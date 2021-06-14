grammar Erlang;

fragment DGT : [0-9] ;

fragment NDGT : [a-zA-Z_] ;

fragment UPPER : [A-Z] ;

fragment LOWER : [a-z] ;

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

Type : Integer | Char | String | Float ;

WS : [ \t\r\n]+ -> skip ;
Comment : '%' ~ [\r\n]*;

program: module? compile? funcDec* EOF;

module : '-module(' Name ').' ;

compile : '-compile(export_all).' ;

read : Input '(' String ')' ;

print : Output '(' String (',' (Type | Var | list))* ')' ;

operation : Type Op Type ;

list : '[' ((Type | Var | OK) ','?)* ']' ;

tuple : '{' ((Type | Var | OK) ','?)* '}' ;

declaration : (Var | tuple | list) '=' (Type | read);

expr : operation | declaration | print ;

arg : Type;

funcName : Name '(' (arg ','?)* ')' ;

guard : 'when' expr ;

body : (expr ','?)* ;

func : funcName guard? '->' body ;

funcDec : func (';' func)* Dot ;