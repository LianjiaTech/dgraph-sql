package com.ke.search;

import com.ke.search.parser.SqlParser;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author zhaoxiang
 * @date 2020/05/26
 */
public class SqlParserTest {
    @Test
    public void testAlias(){
        String sql = "SELECT r.resblock_name, s.name as subway_name\n" +
                "FROM (r:resblock)-[subway:r_subway_station]->(s:subway_station)\n" +
                "WHERE r.resblock_name = '清秀阁' AND subway.distance <= 1000;";
        String graphql = "{ " +
                "query(func:eq(resblock_name,\"清秀阁\"))@filter(type(resblock)){ " +
                "resblock_name " +
                "subway:r_subway_station@facets(le(distance,1000))@filter(type(subway_station)){ " +
                "subway_name:name } } }";
        assertEquals(graphql, SqlParser.getParser().toGraphQL(sql));
    }
    @Test
    public void testLimit(){
        String sql = "select p.name, r.resblock_name\n" +
                "FROM (p:pharmacy)-[:~r_pharmacy]->(r:resblock)\n" +
                "WHERE match(p.name,'爱康大药房',3) AND r.green_ratio < 30\n" +
                "LIMIT p(first: 2, offset: 3), r(first: 1);";
        String graphql = "{ query(func:match(name,\"爱康大药房\",3), first:2, offset:3)@filter(type(pharmacy)){ " +
                "name ~r_pharmacy@filter(lt(green_ratio,30) AND type(resblock))(first:1){ resblock_name } } }";
        assertEquals(graphql, SqlParser.getParser().toGraphQL(sql));
    }
    @Test
    public void testOrderBy(){
        String sql = "select p.name, r.resblock_name\n" +
                "FROM (p:pharmacy)-[:~r_pharmacy]->(r:resblock)\n" +
                "WHERE match(p.name,'爱康大药房',3) AND r.green_ratio < 30\n" +
                "ORDER BY p.name ASC, r.green_ratio asc;";
        String graphql = "{ query(func:match(name,\"爱康大药房\",3), orderasc:name)@filter(type(pharmacy)){ " +
                "name ~r_pharmacy@filter(lt(green_ratio,30) AND type(resblock))(orderasc:green_ratio){ resblock_name } } }";
        assertEquals(graphql, SqlParser.getParser().toGraphQL(sql));
    }
    @Test
    public void testAggregation(){
        String sql = "Select director.name AS director_name, min(film.initial_release_date) as min_release\n" +
                "from (director)-[]->(film)\n" +
                "Where director.name = 'steven'\n" +
                "having min(film.initial_release_date) > 10;";
        String graphql = "{ director_ as var(func:eq(name,\"steven\")){ " +
                "min.film.initial_release_date as min(val(film.initial_release_date)) expand(_all_){ " +
                "film.initial_release_date as initial_release_date } } " +
                "query(func:gt(val(min.film.initial_release_date),10))@filter(uid(director_)){ " +
                "director_name:name min_release:val(min.film.initial_release_date) } }";
        assertEquals(graphql, SqlParser.getParser().toGraphQL(sql));
    }
    @Test
    public void testGroupBy(){
        String sql = "select city.city_code, count(resblock) as num_resblock\n" +
                "from (resblock)-[:r_city]->(city)\n" +
                "Where regexp(resblock.resblock_name, '园')\n" +
                "Group by r_city\n" +
                "having count(resblock) > 0;";
        String graphql = "{ var(func:regexp(resblock_name,/园/))@groupby(r_city){ count.resblock as count(uid) } " +
                "query(func:uid(count.resblock))@filter(gt(val(count.resblock),0)){ num_resblock:val(count.resblock) city_code } }";
        assertEquals(graphql, SqlParser.getParser().toGraphQL(sql));
    }
    @Test
    public void testShortest(){
        String sql = "select shortest(property: gid, numpaths: 2, depth: 3)\n" +
                "from (resblock)-[:r_city]->(city)\n" +
                "Where resblock.resblock_name = '上地东里' AND city.city_code = '110000' AND resblock.green_ratio > 80;";
        String graphql = "{ S as var(func:eq(resblock_name,\"上地东里\"))@filter(gt(green_ratio,80)) " +
                "T as var(func:eq(city_code,\"110000\")) " +
                "path as shortest(from:uid(S), to:uid(T), numpaths:2, depth:3){ r_city } path(func: uid(path)){ gid } }";
        assertEquals(graphql, SqlParser.getParser().toGraphQL(sql));
    }
    @Test
    public void testNdegree(){
        String sql = "select ndegree(depth: 3)\n" +
                "From (resblock)\n" +
                "Where resblock.resblock_name = '上地东里';";
        String graphql = "{ query(func:eq(resblock_name,\"上地东里\"))@recurse(depth:3) { expand(_all_) } }";
        assertEquals(graphql, SqlParser.getParser().toGraphQL(sql));
    }
}