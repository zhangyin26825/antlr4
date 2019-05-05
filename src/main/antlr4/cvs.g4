grammar cvs;
@header{
package com.zhangyin.cvs;
}
@members {
int count = 0;
}
file: row lastrow;
row locals [int i=1] : {$i++; System.out.println("当前第"+$i+"行");}field (',' field)* '\r'?'\n';
lastrow: field (',' field)*;
field:  ID
    { System.out.println("Found alpha: "+_localctx.getText()); }
    ;

ID: ~[,\n\r]+;
