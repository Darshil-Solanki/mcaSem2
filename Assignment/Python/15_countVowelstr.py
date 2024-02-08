vowel=['a','A','e','E','i','I','o','O','u','U']
st=input("Enter a string:")
sc=vc=cc=0

for i in st:
    if(i.isspace()):
        sc+=1
    if(i.isalpha()):
        if(i in vowel):
            vc+=1
        else:
            cc+=1

print("Space count:",sc)
print("Vowel count:",vc)
print("Consonant count:",cc)