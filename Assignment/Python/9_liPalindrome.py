li=[123,32,23232,45,11,121,56]
for i in li:
	rev=0
	temp=i
	while(temp>0):
		rev= rev*10 + temp%10
		temp=int(temp/10)
	if(i==rev):
		print(i)
