f=open("data.txt","w+")
f.write("This file is generated from python.")
print("File created Successfully.")
f.seek(0)
for i in f:
    print(i)
