vowel=('a','A','e','E','i','I','o','O','u','U')
st=input("Enter a string:")
vc=0
for i in st:
    if i in vowel:
        vc+=1
print("Vowel count is:",vc)