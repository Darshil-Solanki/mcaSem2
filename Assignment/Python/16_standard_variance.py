import math
li=[-3,0,3,6,9]
sum=0
for i in li:
	sum+=i
mean=sum/len(li)
varSum=0
for i in li:
	varSum+=(i-mean)**2
variance=varSum/len(li)
std_variance=math.sqrt(variance)
print("Data:[-3,0,3,6,9]")
print("Mean is :",mean)
print("Variance is :",variance)
print("Standard variance is:",std_variance)
