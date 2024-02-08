rev=0
num=int(input("Enter a num:"))
temp=num
sum=0
while(temp>0):
	sum+=temp%10
	rev= rev*10 + temp%10
	temp=int(temp/10)
print("Number in reverse order is:",rev)
print("Sum of all digit in {} is {}".format(num,sum))
