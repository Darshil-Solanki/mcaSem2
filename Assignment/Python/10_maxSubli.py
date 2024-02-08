nestedLi=[[1,2,3],[1,2],[1,2,3,4,5],[0],[],[1,2,3,4]]
maxLength=0
maxIndex=0
for i in range(len(nestedLi)):
	if len(nestedLi[i])>maxLength :
		maxLength = len(nestedLi[i])
		maxIndex = i
print("Maximum subList index is: ",maxIndex)
print("Maximum subList: ",nestedLi[maxIndex])
