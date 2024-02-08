sen=input("Enter a Sentence:")
dc=lc=uc=0
for i in sen:
	if (i.isupper()):
		uc+=1
	if(i.islower()):
		lc+=1
	if(i.isdigit()):
		dc+=1
print("digit count:",dc)
print("lowercase count:",lc)
print("uppercase count:",uc)
