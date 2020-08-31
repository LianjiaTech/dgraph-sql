package com.ke.search.exception;
import org.antlr.v4.runtime.Token;
/**
 * @author zhaoxiang
 */
public class ParseException extends RuntimeException {
    public ParseException(Token source, String msg, Object... args){
        super(String.format("line %s:%s: %s",
                source.getLine(),
                source.getCharPositionInLine(),
                String.format(msg, args)));
    }
    public ParseException(int line, int charPositionInLine, String msg) {
        super(String.format("line %s:%s: %s", line, charPositionInLine, msg));
    }
    public ParseException(String msg, Object... args){
        super(String.format(msg, args));
    }
}
