grammar Erlang;

Dot : '.' ;

OK : 'ok';

Input : 'io:read' ;

Output : 'io:format';

Endl : ',' | ';' ;

Name: (LOWER | '_') (DGT | LOWER | UPPER | '_' | '@')* ;

Var : (UPPER | '_') (DGT | LOWER | UPPER | '_' | '@')* ;

Op : '+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '/=' ;

Integer : '0' | ([1-9][0-9]*);

Float : Integer Dot DGT+;

String : '"' ( '\\"' | . )*? '"';

Char: '\'' ( DGT | NDGT) '\'';

fragment DGT : [0-9] ;

fragment NDGT : [a-zA-Z_] ;

fragment UPPER : [A-Z] ;

fragment LOWER : [a-z] ;

WS : [ \t\r\n]+ -> skip ;
Comment : '%' ~ [\r\n]*;

program: module? compile? funcDec* EOF;

type : Integer | Char | String | Float ;

module : '-module(' Name ').' ;

compile : '-compile(export_all).' ;

read : Input '(' String ')' ;

print : Output '(' String (',' (type | Var | list))* ')' ;

operation : (type | Var) Op (type | Var) ;

list : '[' ((type | Var | OK) ','?)* ']' ;

tuple : '{' ((type | Var | OK) ','?)* '}' ;

declaration : (Var | tuple | list) '=' (type | read);

expr : operation | declaration | print | type;

arg : type | Var;

funcName : Name '(' (arg ','?)* ')' ;

guard : 'when' expr ;

line : (expr | if_stat) ;

body : (line ','?)* ;

if_stat: 'if' (operation '->' expr ';')+ ('true' '->' expr)? 'end';

func : funcName guard? '->' body ;

funcDec : func (';' func)* Dot ;

