grammar Erlang;

program: module? compile? funcDec* EOF;

DGT : [0-9] ;

UPPER : [A-Z] ;

LOWER : [a-z] ;

Atom : LOWER (DGT | LOWER | UPPER | '_' | '@')*
          | '\'' ( '\\' (~'\\'|'\\') | ~[\\'] )* '\'' ;

Type : (Integer | Char | String | Float | List | Tuple) ;

Var : (UPPER | '_') (DGT | LOWER | UPPER | '_' | '@')* ;

Op : ('+' | '-' | '*' | '/' | '>' | '>=' | '<' | '<=' | '==' | '/=') ;

Float : '-'? DGT+ '.' DGT+  ([Ee] [+-]? DGT+)? ;

Integer : '-'? DGT+ ('#' (DGT | [a-zA-Z])+)? ;

Char : '$' ('\\'? ~[\r\n] | '\\' DGT DGT DGT) ;

String : '"' ( '\\' (~'\\'|'\\') | ~[\\"] )* '"' ;

List : '['(Type? ','?)*']' ; 

Tuple : '{'(Type? ','?)*'}' ;

Comment : '%' ~[\r\n]* '\r'? '\n' -> skip ;
WS : [\u0000-\u0020\u0080-\u00a0]+ -> skip ;

Endl : (',' | '.' | ';') ;

declaration : Var '=' Type Endl ;

module : '-module(' (LOWER | '_')* ').' ;

compile : '-compile(export_all).' ;

expr : (Type | func) (Op (Type | func))? ;

func : ('_' | LOWER) (LOWER | UPPER | DGT | '_' | '@')* '(' (expr ','?)* ')' ;

// ? rek
funcDec : func ('when' expr)? '->' (expr Endl)* funcDec* ;

