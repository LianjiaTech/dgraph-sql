Dgraph SQL的from子句主要借鉴了cypher的match子句，其它关键字的含义尽量与SQL保持一致。

## 1、路径匹配

SQL的from子句是一个表或多个表的连接，而在Dgraph SQL里则是由点的名称和边的类型组成的路径。点名称后面可跟`:点标签`；边用边类型和箭头`-[:边类型]->`表示，边类型前面可加上`边别名:`。

图数据中边是有方向的，必须沿着边的方向进行查询。如果想沿着两个方向查询，需要在schema中定义一个边的反向边。边`edge`的反向边表示为为 `~edge`。

例如，在小区图中，小区`resblock`通过边`r_subway_station`连接到地铁站`subway_station`，可以沿着路径 `(resblock)-[:r_subway_station]→(subway_station)`查询小区周围的地铁。如果想查询地铁周围的小区，则需要沿着路径 `(subway_station)-[:~r_subway_station]→(resblock)`。

**例子：查询清秀阁小区周围1km内的地铁站**

```
SELECT r.resblock_name, s.name FROM (r:resblock)-[rs:r_subway_station]->(s:subway_station) WHERE r.resblock_name = '清秀阁' AND rs.distance <= 1000;
```

**例子：查询西二旗地铁站周围1km内的小区**

```
SELECT r.resblock_name, r_subway_station.distance FROM (s:subway_station)-[rs:~r_subway_station]→(r: resblock) WHERE s.name = '西二旗' AND rs.distance <= 1000;
```

路径内可以同时有正向边和反向边

**例子：查找清秀园小区附近的小学的学生**

```
SELECT s.name FROM (r:resblock)-[:r_primary_school]->(p:primary_school)-[:~r_primary_school]->(s:student) WHERE r.resblock_name = '清秀阁';
```

## 2、属性

无论是点的属性还是边的属性，必须带上点名称或者边类型前缀，用`.`分割。

## 3、count

可以用count函数对点，边，点的属性(多值属性)进行计数。使用方法为 count(node), count(node.property), count(node.edge)。

**例子：统计所有小区的个数**

```
SELECT count(r) FROM (r:resblock);
```

**例子：统计清秀阁小区周围的地铁数**

```
SELECT count (r.r_subway_station) FROM (r:resblock)-[:r_subway_station]-> WHERE r.resblock_name = '清秀阁';
```

## 4、比较运算

Dgraph SQL提供的比较运算符有: =，>, <, >=, <= 。属性必须建立了相应的索引才能进行比较。

| 运算符左侧                           | 数据类型        | 运算符和索引需求                    | 运算符右侧 |        |
| :----------------------------------- | :-------------- | :---------------------------------- | :--------- | ------ |
| node.propertyedge.property           | int             | =，>, <, >=, <=                     | int        | 字面值 |
| float                                | =，>, <, >=, <= | float                               |            |        |
| bool                                 | =               | bool                                |            |        |
| string                               | =               | hash, exact,term, fulltext, trigram |            |        |
| >, <, >=, <=                         | exact           |                                     |            |        |
| dateTime                             | =，>, <, >=, <= | dateTime                            |            |        |
| count(node.property)count(node.edge) | list            | =，>, <, >=, <=                     | count      |        |

**例子：查询周围地铁数超过3个的小区**

```
SELECT r.resblock_id, s.name FROM (r:resblock)-[:r_subway_station]->(s:subway_station) WHERE count (r.r_subway_station) >= 3;
```

## 5、function

Dgraph SQL提供了若干string匹配函数(包括正则匹配，模糊匹配)，用作查询的过滤条件。

| 函数                                                   | 索引需求 | 说明                                     |
| :----------------------------------------------------- | :------- | :--------------------------------------- |
| allofterms(node.property, 'space-separated term list') | term     | 匹配所有term；顺序无关；大小写不敏感     |
| anyofterms(node.property, 'space-separated term list') | term     | 匹配任一term；顺序无关；大小写不敏感     |
| match(node.property, 'string', distance)               | trigram  | 模糊匹配，字符串编辑距离；distance大于0  |
| alloftext(node.property, 'space-separated term list')  | fulltext | 带有词干和停止词的全文检索；匹配所有text |
| anyoftext(node.property, 'space-separated term list')  | fulltext | 带有词干和停止词的全文检索；匹配任一text |
| regexp(node.property, 'regular express')               | trigram  | 按照正则表达式匹配                       |

## 6、has

Dgraph SQL提供IS NOT NULL关键字，用于判断某个属性或某条边是否存在。用法: WHERE node.property IS NOT NULL或者 WHERE node.edge IS NOT NULL。

**例子：查找周围有地铁的小区**

```
SELECT r.resblock_id FROM (r:resblock)-[:r_subway_station]-> WHERE r_subway_station IS NOT NULL;
```

**例子：查找记录了绿化率的小区**

```
SELECT r.resblock_id FROM (r:resblock) WHERE r.green_ratio IS NOT NULL;
```

## 7、pagination

Dgraph SQL提供LIMIT关键字，用于限制返回的点的个数。用法为: LIMIT node(first : 10, offset : 10)，offset的意思是跳过前几个结果，first的意思是返回几个结果。

**例子：查询清秀阁小区周围的三个超市**

```
SELECT s.name FROM (r:resblock)-[:r_supermarket]->(s:supermarket) WHERE r.resblock_name = '清秀阁' LIMIT s(first:3);
```

## 8、sort

Dgraph SQL提供了ORDER BY关键字，用于根据点或边的属性进行排序。用法: ORDER BY node.property ASC, edge.property DESC。

**例子：查询名字包含秀园的小区及周围的地铁站，小区按名字排序，地铁站按距离排序**

```
SELECT r.resblock_name, s.name FROM (r:resblock)-[:r_subway_station]->(s:subway_station) WHERE regexp(r.resblock_name, '秀园') ORDER BY r.resblock_name ASC, r_subway_station.distance ASC;
```

## 9、groupby

Dgraph SQL提供了GROUP BY 关键字，用于对查询结果分组。用法: GROUP BY node.property或者GROUP BY edge。使用分组时，SELECT子句中只能出现聚合函数和 count(node)。

**例子：把小区按所在城市分组**

```
SELECT count(r)FROM (r:resblock)-[:r_city]-> GROUP BY r_city;
```

## 10、shortestpath

Dgraph SQL提供了查询最短路径的函数。用法: SELECT shortest(property: properyName, from: node1 ,to: node2, numpaths: 1, depth: 6)，property参数的含义是展示路径上节点的哪个属性，后两个参数分别是路径数和路径长度。注意: 最短路径必须保证起始节点和目的节点唯一。

**例子：查询Alice和Bob之间最近的朋友关系，列出路径上点的name属性**

```
SELECT shortest(property: name, numpaths: 1) FROM (pm:person)-[:friend]->(rd:person) WHERE pm.name = 'Alice' AND rd.name = 'Bob';
```

## 13、N-degree

Dgraph SQL供了查询N度以内所有节点的函数。用法: SELECT ndegree(depth: 2)。

**例子：查询清秀阁小区的三度节点**

```
SELECT ndegree(depth: 3) FROM (r:resblock) WHERE r.resblock_name = '清秀阁';
```

## 14、aggregation

Dgraph SQL还支持sum，avg，max，min函数，聚合函数可嵌套。用法：SELECT min(node.property)。

**例子：查询名字包含秀园的小区的最小绿化率**

```
SELECT min(r.green_ratio) FROM (r:resblock) WHERE regexp(r.resblock_name, '秀园');
```

## 15、having

having子句的含义和SQL中的一样，having是对聚合函数的值进行约束，而不是属性值。

**例子：把小区按城市分组，并筛选小区平均绿化率大于90的城市**

```
SELECT c.city_code, avg(r.green_ratio) FROM (r:resblock)-[:r_city]->(city) GROUP BY r_city HAVING avg(r.green_ratio) > 90;
```

