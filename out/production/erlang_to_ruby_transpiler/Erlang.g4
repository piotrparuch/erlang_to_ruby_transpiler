grammar Erlang;

program: module? compile? funcDec* EOF;

DGT : [0-9] ;

fragment UPPER : [A-Z] ;

fragment LOWER : [a-z] ;

Module_name: (LOWER | '_') (DGT | LOWER | UPPER | '_' | '@')* ;

Atom : LOWER (DGT | LOWER | UPPER | '_' | '@')*
          | '\'' ( '\\' (~'\\'|'\\') | ~[\\'] )* '\'' ;

Type : (Integer | Char | String | Float | List | Tuple) ;

Var : (UPPER | '_') (DGT | LOWER | UPPER | '_' | '@')* ;

Op : ('+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '/=') ;

Float : '-'? DGT+ '.' DGT+  ([Ee] [+-]? DGT+)? ;

Integer : '-'? DGT+ ('#' (DGT | [a-zA-Z])+)? ;

Char : '$' ('\\'? ~[\r\n] | '\\' DGT DGT DGT) ;

String : '"' ( '\\' (~'\\'|'\\') | ~[\\"] )* '"' ;

OK : 'ok' ;

//String : '"' (DGT | LOWER | UPPER | '_' | '@')* '"';

List : '['((Type | Var | OK)? ','?)*']' ;

Tuple : '{'((Type | Var | OK)? ','?)*'}' ;

Input : 'io:read' ;

Output : 'io:format';

Comment : '%' ~[\r\n]* '\r'? '\n' -> skip ;
WS : [\u0000-\u0020\u0080-\u00a0]+ -> skip ;

Endl : (',' | '.' | ';') ;

declaration : (Var | Tuple | List) '=' (Type | read) ;

module : '-module(' Module_name ').' ;

compile : '-compile(export_all).' ;

read : Input '(' String ')' ;

print : Output '(' String (',' (Type | Var))* ')' ;

expr : (Type | func | DGT) (Op (Type | func))? ;

func : Module_name '(' (expr ','?)* ')' ;

guard : 'when' expr ;

body : expr | declaration | print ;

funcDec : func guard? '->' (body Endl)* ;
