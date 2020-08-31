package com.ke.search.parser;

import com.ke.search.exception.ParseException;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

/**
 * Lexer errors and syntax errors throw exceptions directly
 * @author zhaoxiang
 */
public class SimpleErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        throw new ParseException(line, charPositionInLine, msg);
    }
}
