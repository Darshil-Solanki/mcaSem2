string=input("Enter main String:")
substring=input("Enter sub string:")
print(string.find(substring) if string.find(substring)>0 else "Not found")
print(string.count(substring))

