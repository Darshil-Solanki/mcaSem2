str=input("Enter a string:")
c=input("Enter a character to find:")
l=[]
for i in range(len(str)):
	if(str[i]==c):
		l.append(i)
print(l)
