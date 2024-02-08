n=int(input("Enter a 3-digit Number:"))
sum=0
temp=n
while(temp>0):
	sum+=(temp%10)**3
	temp= int(temp/10)
if(sum==n):
	print("Number is Armstrong")
else:
	print("Number is not Armstrong")
