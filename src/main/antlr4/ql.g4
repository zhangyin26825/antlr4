grammar ql;
file:stat+;
stat: 'type' TYPENAME NL       #TypeDecl 
     | VARNAME ':=' expr NL    #VarDecl
     ;
expr :'(' expr ')'				 			   #PriorityExpr
	 | 'new' TYPENAME         				   #newVar
	 | ID					  				   #assignVar
	 |<assoc=right> '\\' '(' ID ':' type ')' '->'  expr     #defFunction
	 | expr '(' expr ')'					   #invokeFunction
	 ;
type :	'(' type ')'	 							#PriorityType
	 |  TYPENAME                			#assignType
	 |<assoc=right>  type '->' type						#functionType
	 ;

VARNAME		:	[a-zA-Z]+;
ID  		:  [a-zA-Z]+;
TYPENAME	:    [a-zA-Z]+;  
NEW 	 	: 'new';    
ARROW 		: '->';    
WS 			: [ \r\t\n]+ -> skip ;
NL 			:'\r'? '\n' ;
     
     
     