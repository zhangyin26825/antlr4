grammar Calc;
options{
}
@header{
package com.zhangyin.calc;
import java.math.*;
import java.util.*;
import java.util.function.Function;
}
@parser::members{

}

expr returns [BigDecimal b]  :  LPAREN expr RPAREN           # priority
       |  function LPAREN paramList?  RPAREN                 # invokeFunction
       |  variable                                           # replaceVariable
       |  '#{'  ID '}'                                       # ognl
       |   expr  op=(MUL|DIV) expr                           # muldiv
       |   expr  op=(ADD|SUB) expr                           # addsub
       |   number                                            # replaceNumber
       ;
paramList :  expr  (',' expr )* ;
function  : ID;
variable  : ID;
number    : NUM;

LPAREN : '(';
RPAREN : ')';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
ID  : [a-zA-Z$_]+;
NUM :  NonZeroDigit Digit*  ('.'  Digit*)?;
WS  :  [ \t\r\n\u000C]+ -> skip
    ;
fragment
Digit
	:	'0'
	|	NonZeroDigit
	;
fragment
NonZeroDigit
	:	[1-9]
	;