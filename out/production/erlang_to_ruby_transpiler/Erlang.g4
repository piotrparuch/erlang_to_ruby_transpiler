grammar Erlang;

Dot : '.' ;

Left_bracket : '(';

Right_bracket : ')';

OK : 'ok';

Input : 'io:read' ;

Output : 'io:format';

Endl : ',' | ';' ;

Name: (LOWER | '_') (DGT | LOWER | UPPER | '_' | '@')* ;

Var : (UPPER | '_') (DGT | LOWER | UPPER | '_' | '@')* ;

Op : '+' | '-' | '*' | '/'  ;

OpLog: '>' | '>=' | '<' | '=<' | '==' | '/=' ;

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

program: module? compile? funcDec* main EOF;

type : Integer | Char | String | Float ;

module : '-module' Left_bracket Name Right_bracket Dot ;

compile : '-compile' Left_bracket 'export_all' Right_bracket Dot ;

read : Input '(' String ')' ;

print : Output '(' (type | funcName) (',' (type | Var | list | map | funcName))* ')' ;

logop : (type | Var) OpLog (type | Var) ;

nlogop : (type | Var) Op (type | Var) ;

operation : logop | nlogop ;

list : '[' ((type | Var | OK | funcName) ','?)* ']' ;

tuple : '{' ((type | Var | OK) ','?)* '}' ;

map : '#{' ((type | Var | Name) ' => ' (type | Var | Name | list | tuple | map) ','?)* '}' ;

declaration : (Var | tuple | list) '=' (type | read | map | map_to_list | list_reverse) ;

expr : operation | declaration | print | type;

arg : type | Var | Name;

funcName : Name '(' (arg ','?)* ')' | map_to_list | list_reverse;

guard : 'when' expr (',' expr)* ;

line : (expr | if_stat | Name | funcName) ;

body : (line ','?)* ;

if_stat: 'if' (operation '->' expr ';')+ ('true' '->' expr)? 'end';

func : funcName guard? '->' body ;

funcDec : func (';' func)* Dot ;

main : 'main() ->' body Dot;

map_to_list : 'maps:to_list(' (Var | map) ')' ;

list_reverse : 'lists:reverse(' (Var | list) ')' ;