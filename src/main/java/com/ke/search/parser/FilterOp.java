package com.ke.search.parser;
/**
 * @author zhaoxiang
 * @date 2020/04/08
 */

enum FilterOp {
    /**
     * None indicates a single filter condition, and other types are composite filter conditions
     */
    NONE,
    OR,
    AND,
    NOT
}