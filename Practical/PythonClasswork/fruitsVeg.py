f1=open("fruits.txt","r")
f2=open("vegetables.txt")
f3=open("FruitsVegetable.txt","w+")
f3.write(f1.read()+f2.read())
f3.seek(0)
for i in f3:
    print(i)