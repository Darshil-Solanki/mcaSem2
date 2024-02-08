li=[(1,'1',3,'darshil',0),
(2,'hello',9,3,''),
(3,'hi',9.3,' ',4),
(7,'list',2,1),
(9,3,4,5,'tuple','array')]

newLi=[]

for i in li:
    temp=[]
    for j in i:
        if type(j) !=type("str"):
            temp.append(j)
    newLi.append(tuple(temp))

print("List with string:",li)
print("List without string:",newLi)
