f=int(input("Enter a num:"))
fact=1
if(f==0):
	print(1)
elif(f<0):
	print("Negative num!!!")
else:
	for i in range(1,f+1):
		fact*=i
print("factorial of {} is {}".format(f,fact))
