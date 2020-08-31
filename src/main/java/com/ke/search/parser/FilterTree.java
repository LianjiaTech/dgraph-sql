package com.ke.search.parser;

import com.ke.search.exception.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Filterree is parsed from the where statement or the having statement
 * @author zhaoxiang
 */

class FilterTree {
    FilterOp op;
    /**
     * Value is the string format filter condition.
     */
    String value;
    /**
     * name is a node or an edge to which the filter applies。
     */
    String name;
    ArrayList<FilterTree> children = new ArrayList<>();

    boolean compare;
    String tmpValue;
    String tmpVarName;
    String tmpAttr;

    FilterTree(String value, String name) {
        this.op = FilterOp.NONE;
        this.value = value;
        this.name = name;
    }
    private FilterTree(FilterOp op, String name){
        this.op = op;
        this.name = name;
    }
    void setTmp(String tmpValue, String tmpVarName, String tmpAttr) {
        this.compare = true;
        this.tmpValue = tmpValue;
        this.tmpVarName = tmpVarName;
        this.tmpAttr = tmpAttr;
    }
    FilterTree setCompare(boolean compare) {
        this.compare = compare;
        return this;
    }
    FilterTree setName(String name){
        this.name = name;
        return this;
    }
    FilterTree addChildren(FilterTree c){
        children.add(c);
        return this;
    }
    FilterTree addChildren(int index, FilterTree c){
        children.add(index, c);
        return this;
    }
    FilterTree addChildren(List<FilterTree> list) {
        children.addAll(list);
        return this;
    }
    /**
     * Converts the FilterTree to a string
     */
    String getFilterString(){
        StringBuilder s = new StringBuilder();
        switch (op){
            case AND: case OR:
                s.append("(");
                for(int i = 0;i < children.size()-1;i++){
                    s.append(children.get(i).getFilterString()).append(" ").append(op.toString()).append(" ");
                }
                s.append(children.get(children.size()-1).getFilterString()).append(")");
                break;
            case NOT:
                return "NOT " + children.get(0).getFilterString();
            case NONE:
                return value;
            default:
                throw new ParseException("Undefined filter op");
        }
        return s.toString();
    }
    private static FilterTree compute(FilterTree left, FilterTree right, FilterOp op) {
        String name;
        if (left.name.equals(right.name)) {
            name = left.name;
        } else {
            name = "";
        }
        if(left.op == op && right.op == op){
            return left.addChildren(right.children).setName(name).setCompare(left.compare || right.compare);
        } else if(left.op == op){
            return left.addChildren(right).setName(name).setCompare(left.compare || right.compare);
        } else if(right.op == op){
            return right.addChildren(0, left).setName(name).setCompare(left.compare || right.compare);
        } else {
            return new FilterTree(op, name).addChildren(left).addChildren(right).setCompare(left.compare || right.compare);
        }
    }
    static FilterTree logicalAnd(FilterTree left, FilterTree right) {
        return compute(right, left, FilterOp.AND);
    }
    static FilterTree logicalOr(FilterTree left, FilterTree right) {
        return compute(right, left, FilterOp.OR);
    }
    static FilterTree logicalNot(FilterTree filterTree) {
        if(filterTree.op == FilterOp.NOT){
            return filterTree.children.get(0);
        }else {
            return new FilterTree(FilterOp.NOT, filterTree.name).addChildren(filterTree).setCompare(filterTree.compare);
        }
    }
}
