flag='1'
while(flag!='0'):
	a=int(input("Enter first value:"))
	b=int(input("Enter second value:"))
	flag=input("Enter Operation or 0 to exit:")
	if(flag=='+'):
		print("A: ",a," B: ",b," a+b: ",a+b)
	elif(flag=='-'):
		print("A: ",a," B: ",b," a-b:",a-b)
	elif(flag=='*'):
		print("A: ",a," B: ",b," a*b:",a*b)
	elif(flag=='/'):
		print("A: ",a," B: ",b," a/b:",a/b)
	elif(flag=='%'):
		print("A: ",a," B: ",b," a%b:",a%b)
	elif(flag=='//'):
		print("A: ",a," B: ",b," a//b:",a//b)
	elif(flag=='**'):
		print("A: ",a," B: ",b," a**b:",a**b)
	elif(flag=='0'):
		break		
	else:
		print("Unexpected Choice!!")
