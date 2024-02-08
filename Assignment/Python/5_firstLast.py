str=input("Enter a string:")
newStr=str if len(str)<3 else str[0:2]+str[-2:]
print("Newstr: ",newStr)
