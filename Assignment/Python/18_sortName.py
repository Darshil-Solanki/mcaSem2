li=["darshil","ajay","nusarat","pratham","aaryan"]
newLi=[]
for i in li:
	newLi.append(i.lower())
for i in range(len(newLi)):
	for j in range(len(newLi)-i-1):
		if(newLi[j]>newLi[j+1]):
			newLi[j+1],newLi[j]=newLi[j],newLi[j+1]
print("Sorted list of names:\n",newLi)
