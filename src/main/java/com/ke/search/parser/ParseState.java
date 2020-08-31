package com.ke.search.parser;

/**
 * @author zhaoxiang
 * @date 2020/04/17
 */
public enum ParseState {
    /**
     * Mark the stages of parser.
     */
    WHERE,
    GROUPBY,
    HAVING,
    ORDER,
}