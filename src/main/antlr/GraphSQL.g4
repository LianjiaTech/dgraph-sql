grammar GraphSQL;
query
: selectClause fromClause whereClause? groupBy? havingClause? orderBy? limitClause? ';';
fromClause
: FROM path;
path
: node (edge path?)?;
node
: '(' nodeName? (':' nodeLabel)? ')' ;
edge
: '-' '[' edgeName? (':' edgeType)? ']' '->';
whereClause
: WHERE expr;
expr
: predicate IS NOT NULL                                                #notNull
| funcName '(' namedAttribute ',' STRING_LITERAL (',' NUMERIC_LITERAL)? ')'   #stringFunc
| commonItem op=( '=' | '<' | '<=' | '>' | '>=' ) literal_value        #comparision
| NOT expr                                                             #logicalNot
| expr AND expr                                                        #logicalAnd
| expr OR expr                                                         #logicalOr
| '(' expr ')'                                                         #parenthesis
;
groupBy
: GROUP BY predicate;
selectClause
: SELECT OPT? selectItem (',' selectItem)*;
selectItem
: commonItem (AS alias)? #selectCommon
| shortestPath   #selectSpecial
| ndegree        #selectSpecial
;
shortestPath
: SHORTEST '(' property (',' shortestOptions)* ')';
ndegree
: NDEGREE '(' depthArgs ')';
havingClause
: HAVING expr;
orderBy
: ORDER BY orderItem (',' orderItem)*;
orderItem
: commonItem order=(ASC | DESC);
limitClause
: LIMIT limitItem (',' limitItem)*;
limitItem
: nodeName '(' limitArgs (',' limitArgs)? ')';
aggregation
: aggr=(MAX | MIN | SUM | AVG) '(' commonItem ')';
commonItem
: namedAttribute
| countFunc
| aggregation
;
countFunc
: COUNT '(' countItem ')';
countItem
: namedAttribute
| name;
shortestOptions
: depthArgs
| numPaths
;
limitArgs
: first
| offset
;
property : PROPERTY ':' id;
depthArgs : DEPTH ':' NUMERIC_LITERAL;
numPaths : NUMPATHS ':' NUMERIC_LITERAL;
first : FIRST ':' NUMERIC_LITERAL;
offset : OFFSET ':' NUMERIC_LITERAL;
predicate
: namedAttribute
| edgeName
;
namedAttribute
: name '.' attribute;
edgeName : name;
nodeName : name;
name : id;
nodeLabel : id;
edgeType : id;
alias : id;
attribute
: id
| '*';
literal_value
: NUMERIC_LITERAL
| STRING_LITERAL;
funcName
: ANYOFTERMS | ALLOFTERMS | ALLOFTEXT | ANYOFTEXT | REGEXP | MATCH;
keyword
: SELECT | FROM | WHERE | NOT | AND | OR | IS | NULL | GROUP | HAVING
| ORDER | BY | ASC | DESC | LIMIT | COUNT | SHORTEST | PROPERTY | NDEGREE
| DEPTH | NUMPATHS | FIRST | OFFSET | MAX | MIN | SUM | AVG | AS | OPT | funcName;
id
: ID
| keyword
;
SELECT : S E L E C T;
FROM : F R O M ;
WHERE : W H E R E;
NOT : N O T;
AND : A N D;
OR : O R;
IS : I S;
NULL : N U L L;
GROUP : G R O U P;
HAVING : H A V I N G;
ORDER : O R D E R;
BY : B Y;
ASC : A S C;
DESC : D E S C;
LIMIT : L I M I T;
AS : A S;
OPT : O P T;
COUNT : 'count';
ANYOFTERMS : 'anyofterms';
ALLOFTERMS : 'allofterms';
ALLOFTEXT : 'alloftext';
ANYOFTEXT : 'anyoftext';
REGEXP : 'regexp';
MATCH : 'match';
SHORTEST : 'shortest';
PROPERTY : 'property';
NDEGREE : 'ndegree';
DEPTH : 'depth';
NUMPATHS : 'numpaths';
FIRST : 'first';
OFFSET : 'offset';
MAX : 'max';
MIN : 'min';
SUM : 'sum';
AVG : 'avg';
NUMERIC_LITERAL
 : DIGIT+ ( '.' DIGIT* )? ( E [-+]? DIGIT+ )?
 | '.' DIGIT+ ( E [-+]? DIGIT+ )?
 ;
STRING_LITERAL
 : '\'' ( ~'\'' | '\'\'' )* '\'';
ID : '~'? [a-zA-Z] [a-zA-Z0-9_]*;
WS : [ \r\t\n] -> skip;
fragment DIGIT : [0-9];
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];