# Use SQL to query Dgraph

## Introduction

This Java library allows you to query Dgraph using SQL. You can think of it as a translator for SQL into the Dgraph native query language (GraphQL+-).

## Getting Started

To start using SQL, create a Dgraph client:

```
ManagedChannel channel = ManagedChannelBuilder
    .forAddress("localhost", 9080)
    .usePlaintext().build();
DgraphStub stub = DgraphGrpc.newStub(channel);
DgraphClient dgraphClient = new DgraphClient(stub);
```

Translate SQL into native Dgraph queries:

```
String sql = "SELECT r.resblock_name FROM (r:resblock) WHERE r.resblock_id = '1000010';";
SqlParser parser = SqlParser.getParser();
String graphql = parser.toGraphQL(sql);
System.out.println(graphql);
```

The output is:

```
{ query(func:eq(resblock_id,"1000010"))@filter(type(resblock)){ resblock_name } }
```

Now you can run the Dgraph native query:

```
dgraphClient.newReadOnlyTransaction().query(graphql);
```

## SQL language

This section describes the SQL-like syntax supported which is called Dgraph SQL.

Although Draph SQL follows the SQL terminology and conventions first, whenever possible. However the backing engine itself is Dgraph for which Dgraph SQL was purposely created hence why features or concepts that are not available, or cannot be mapped correctly. The differences between Dgraph SQL and SQL roughly are:

- In SQL, the database is collection of tables; while in Dgraph the database is composed of nodes and edges. So the `from` clause of Dgraph SQL is quiet different from SQL, it's similar with cypher's `match` clause instead.
- SQL has static schema while Dgraph, as a nosql database, has dynamic schema. So each field is prefixed with an identifier and the '.' Operator that indicates the node or edge it belongs to.

### Features supported

#### count

GraphQL+- query example: Number of subway station nearby the resblock named "清秀阁".

```
{
	query(func: eq(resblock_name,"清秀阁"))@filter(type(resblock)){ 			   					
	    count(r_subway_station)
	}
}
```

the  Dgraph SQL equivalent:

```
SELECT count(r.r_subway_station)
FROM (r:resblock)-[:r_subway_station]->
WHERE r.resblock_name = '清秀阁';
```

#### aggregation

The supported functions include min, max, sum and avg.

GraphQL+- query example: Find supermarkets named "日月超市" and the average green ratio of resblocks nearby them.

```
{
	C as var(func: allofterms(name,"日月超市"))@filter(type(supermarket)){
		B as avg(val(A))
		~r_supermarket{
			A as green_ratio 
		}
	}
	query(func: uid(C)){
		name
		val(B)
	}
}
```

the Dgraph SQL equivalent:

```
SELECT s.name, sum(resblock.green_ratio)
FROM (s:supermarket)-[:~r_supermarket]->(resblock)
WHERE allofterms(s.name,'日月超市');
```

#### pagination

It must be specified that which node to limit. `first: N` retrieves the first `N` results, and with `offset: N` the first `N` results are not returned.

GraphQL+- query example: Find first three supermarkets that near by resblock named "清秀阁".

```
{
	query(func:eq(resblock_name,"清秀阁"))@filter(type(resblock)){
		r_supermarket@filter(type(supermarket))(first:3){
			name
		}
	}
}
```

the Dgraph SQL equivalent:

```
SELECT s.name 
FROM (r:resblock)-[:r_supermarket]->(s:supermarket) 
WHERE r.resblock_name = '清秀阁'
LIMIT s(first:3);
```

#### sort

 GraphQL+- query example: 

```
{
	query(func:regexp(resblock_name,/秀园/), orderasc:resblock_name)@filter(type(resblock)){
		resblock_name 	r_subway_station@filter(type(subway_station)){
			name
		}
	}
}
```

the Dgraph SQL equivalent:

```shortestPath
SELECT r.resblock_name, s.name 
FROM (r:resblock)-[:r_subway_station]->(s:subway_station) 
WHERE regexp(r.resblock_name,'秀园') 
ORDER BY r.resblock_name ASC;
```

#### groupby

When using `group by`, only aggregations are allowed and `count` may only be applied to `uid`

inside the `select` clause.

GraphQL+- query example: Group resblocks by city and return the number of resblock in each city.

```
{
	var(func:type(resblock))@groupby(r_city){
		A as count(uid) 
	}
	query(func:uid(count.r)){
		val(A)
	}
}
```

the Dgraph SQL equivalent:

```
SELECT count(r)
FROM (r:resblock)-[:r_city]-> 
GROUP BY r_city;
```

#### shortest path

The shortest path between a source node and destination node can be found using the function `shortest`. With `numpaths: k`, the k-shortest paths are returned. With `depth: n`, the shortest paths up to `n` hops away are returned. With `property: name `, the `name` of  nodes in the paths are returned.

GraphQL+- query example:

```
{ 
	S as var(func: eq(name,"Alice"))@filter(type(person)) 
	T as var(func: eq(name,"Bob"))@filter(tupe(person)) 
	path as shortest(from: uid(S), to: uid(T), numpaths: 1) { 
		friend 
	} 
	path(func: uid(path)) { 
		name 
	} 
}
```

the Dgraph SQL equivalent:

```
SELECT shortest(property: name, numpaths: 1)
FROM (pm:person)-[:friend]->(rd:person)
WHERE pm.name = 'Alice' AND rd.name = 'Bob';
```

#### N-degree

The maximum depth is specified by the `depth` parameter.

GraphQL+- query example:

```
{
	query(func:eq(resblock_name,"清秀阁"))@filter(type(resblock))@recurse(depth:3){
		expand(_all_)
	}
}
```

the Dgraph SQL equivalent:

```
SELECT ndegree(depth: 3)
FROM (r:resblock) 
WHERE r.resblock_name = '清秀阁';
```
### More about Dgraph SQL

There are more details about the SQL language in Dgraph SQL.md.