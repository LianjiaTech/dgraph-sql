package com.ke.search.parser;

import com.ke.search.antlr.GraphSQLLexer;
import com.ke.search.antlr.GraphSQLParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author zhaoxiang
 * @date 2019/11/08
 */
public class SqlParser {
    private static final SimpleErrorListener ERROR_LISTENER = new SimpleErrorListener();
    public static SqlParser getParser(){
        return new SqlParser();
    }
    private SqlParser(){}
    /**
     * sqlparser api
     */
    public String toGraphQL(String gql){

        CodePointCharStream input = CharStreams.fromString(gql);
        GraphSQLLexer lexer = new GraphSQLLexer(input);

        lexer.removeErrorListeners();
        lexer.addErrorListener(ERROR_LISTENER);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GraphSQLParser parser = new GraphSQLParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(ERROR_LISTENER);

        ParseTree tree = parser.query();

        GraphqlBuilder visitor = new GraphqlBuilder();
        visitor.visit(tree);

        String s = visitor.translate();

        return s;
    }
}