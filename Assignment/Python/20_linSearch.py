li=[5,43,4,32,41,22,0]
k=int(input("Enter key to find:"))
for i in li:
	if(i==k):
		print("Success key ",k," founded")
		break
else:
	print("failure!")
