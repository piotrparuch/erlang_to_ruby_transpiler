grammar Erlang;

//forms : form+ EOF ;

fragment DGT : [0-9] ;

fragment UPPER : [A-Z] ;

fragment LOWER : [a-z] ;

atomToken : AtomToken ;
AtomToken : LOWER (DGT | LOWER | UPPER | '_' | '@')*
          | '\'' ( '\\' (~'\\'|'\\') | ~[\\'] )* '\'' ;

varToken : VarToken ;
VarToken : (UPPER | '_') (DGT | LOWER | UPPER | '_' | '@')* ;

floatToken : FloatToken ;
FloatToken : '-'? DGT+ '.' DGT+  ([Ee] [+-]? DGT+)? ;

integerToken : IntegerToken ;
IntegerToken : '-'? DGT+ ('#' (DGT | [a-zA-Z])+)? ;

charToken : CharToken ;
CharToken : '$' ('\\'? ~[\r\n] | '\\' DGT DGT DGT) ;

stringToken : StringToken ;
StringToken : '"' ( '\\' (~'\\'|'\\') | ~[\\"] )* '"' ;

AttrName : '-' ('spec' | 'callback') ;
Comment : '%' ~[\r\n]* '\r'? '\n' -> skip ;
WS : [\u0000-\u0020\u0080-\u00a0]+ -> skip ;