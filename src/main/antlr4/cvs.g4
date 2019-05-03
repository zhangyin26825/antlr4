grammar cvs;
@header{
package com.zhangyin.cvs;
}
file: row lastrow;
row: field (',' field)* '\r'?'\n';
lastrow: field (',' field)*;
field:  ID
    { System.out.println("Found alpha: "+_localctx.getText()); }
    ;

ID: ~[,\n\r]+;
