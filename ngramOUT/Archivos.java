/*
*



 
 *
* 
 T
To
o 
 c
ch
ha
an
ng
ge
e 
 t
th
hi
is
s 
 t
te
em
mp
pl
la
at
te
e,
, 
 c
ch
ho
oo
os
se
e 
 T
To
oo
ol
ls
s 
 |
| 
 T
Te
em
mp
pl
la
at
te
es
s



 
 *
* 
 a
an
nd
d 
 o
op
pe
en
n 
 t
th
he
e 
 t
te
em
mp
pl
la
at
te
e 
 i
in
n 
 t
th
he
e 
 e
ed
di
it
to
or
r.
.



 
 *
*/
/



p
pa
ac
ck
ka
ag
ge
e 
 p
pk
kg
g0
00
00
03
30
0_
_n
ns
sa
al
lt
to
os
sd
de
el
li
in
ne
es
s;
;







i
im
mp
po
or
rt
t 
 j
ja
av
va
a.
.i
io
o.
.*
*;
;







/
/*
**
*



 
 *
*



 
 *
* 
 @
@a
au
ut
th
ho
or
r 
 M
Mi
ig
gu
ue
el
l



 
 *
*/
/



p
pu
ub
bl
li
ic
c 
 c
cl
la
as
ss
s 
 A
Ar
rc
ch
hi
iv
vo
os
s 
 {
{



 
  
  
  
 



 
  
  
  
 p
pu
ub
bl
li
ic
c 
 s
st
ta
at
ti
ic
c 
 i
in
nt
t 
 c
ca
an
nt
ti
id
da
ad
dD
De
eP
Pa
al
la
ab
br
ra
as
s(
( 
 S
St
tr
ri
in
ng
g 
 n
no
om
mb
br
re
eA
Ar
rc
ch
hi
iv
vo
o 
 )
){
{



 
  
  
  
  
  
  
  
 F
Fi
il
le
e 
  
  
  
  
  
  
  
  
  
  
 a
ar
rc
ch
hi
iv
vo
o 
 ;
;



 
  
  
  
  
  
  
  
 F
Fi
il
le
eR
Re
ea
ad
de
er
r 
  
  
  
  
 f
fr
r 
  
  
  
  
  
 ;
;



 
  
  
  
  
  
  
  
 B
Bu
uf
ff
fe
er
re
ed
dR
Re
ea
ad
de
er
r 
 b
br
r 
  
  
  
  
  
 ;
;



 
  
  
  
  
  
  
  
 S
St
tr
ri
in
ng
g 
  
  
  
  
  
  
  
  
 l
li
in
ne
ea
a 
  
  
 ;
;



 
  
  
  
  
  
  
  
 i
in
nt
t 
  
  
  
  
  
  
  
  
  
  
  
 i
i 
  
 =
= 
  
  
 0
0;
;



 
  
  
  
  
  
  
  
  
 



 
  
  
  
  
  
  
  
 t
tr
ry
y{
{



 
  
  
  
  
  
  
  
  
  
  
  
 a
ar
rc
ch
hi
iv
vo
o 
 =
= 
 n
ne
ew
w 
 F
Fi
il
le
e(
( 
 n
no
om
mb
br
re
eA
Ar
rc
ch
hi
iv
vo
o 
 )
);
;



 
  
  
  
  
  
  
  
  
  
  
  
 f
fr
r 
 =
= 
 n
ne
ew
w 
 F
Fi
il
le
eR
Re
ea
ad
de
er
r(
( 
 a
ar
rc
ch
hi
iv
vo
o 
 )
);
;



 
  
  
  
  
  
  
  
  
  
  
  
 b
br
r 
 =
= 
 n
ne
ew
w 
 B
Bu
uf
ff
fe
er
re
ed
dR
Re
ea
ad
de
er
r(
( 
 f
fr
r 
 )
);
;



 
  
  
  
  
  
  
  
  
  
  
  
 



 
  
  
  
  
  
  
  
  
  
  
  
 w
wh
hi
il
le
e(
( 
 (
(l
li
in
ne
ea
a 
 =
= 
 b
br
r.
.r
re
ea
ad
dL
Li
in
ne
e(
()
))
)!
!=
= 
 n
nu
ul
ll
l)
)



 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 i
i+
++
+;
; 
  
  
  
  
  
  
  
  
  
  
  
 



 
  
  
  
  
  
  
  
  
  
  
  
 



 
  
  
  
  
  
  
  
  
  
  
  
 f
fr
r.
.c
cl
lo
os
se
e(
()
);
;



 
  
  
  
  
  
  
  
  
  
  
  
 b
br
r.
.c
cl
lo
os
se
e(
()
);
;







 
  
  
  
  
  
  
  
  
  
  
  
 r
re
et
tu
ur
rn
n 
 i
i;
; 
  
  
  
  
  
  
  
  
  
  
  
 



 
  
  
  
  
  
  
  
 }
}c
ca
at
tc
ch
h 
 (
( 
 E
Ex
xc
ce
ep
pt
ti
io
on
n 
 e
e 
 )
){
{



 
  
  
  
  
  
  
  
  
  
  
  
 e
e.
.p
pr
ri
in
nt
tS
St
ta
ac
ck
kT
Tr
ra
ac
ce
e(
()
);
;



 
  
  
  
  
  
  
  
  
 }
} 
  
  
  
  
  
  
 



 
  
  
 



 
  
  
  
  
  
  
  
 r
re
et
tu
ur
rn
n 
 0
0;
;



 
  
  
  
 }
}



 
  
  
  
 



 
  
  
  
 p
pu
ub
bl
li
ic
c 
 s
st
ta
at
ti
ic
c 
 S
St
tr
ri
in
ng
g[
[]
] 
 l
le
ee
er
rA
Ar
rc
ch
hi
iv
vo
oD
De
eT
Te
ex
xt
to
o 
 (
( 
 S
St
tr
ri
in
ng
g 
 n
no
om
mb
br
re
eA
Ar
rc
ch
hi
iv
vo
o 
 )
){
