l1=[1,2,3,4,6,9,4,7,8]
l2=[6,3,5,3,2,3,8,5,0]
mergeLi=[]
for i in range(len(l1)):
    mergeLi.append((l1[i],l2[i]))
print("L1 is:",l1)
print("L2 is:",l2)
print("Merged List is:",mergeLi)