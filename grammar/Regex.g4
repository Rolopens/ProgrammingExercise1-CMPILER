// Define a grammar called Hello
    grammar Regex;
s   : B
    | X
    ;
B   : A R
    | X'U'B R
    | X'U'X
    ;
R   : A R
    | 'U' A R
    | 'U' X R
    | /* epsilon */
    ;
A   : N'+'
    | N'*'
    | N'?'
    | N
    |'('B')'
    |'('B')''*'
    |'('B')''+'
    |'('B')''?'
    ;
N   : [a-z0-9]+
    ;
X   : 'E'
    | '(''E'')'
    ;
WS  : [ \t\r]+ -> skip
    ; // skip spaces, tabs

