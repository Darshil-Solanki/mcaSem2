t1, t2 = 0, 1
t3 = t1+t2

f = open("fibo.txt","a")
f.write(str(t1))
f.write(str(t2))

inp = int(input("Enter the number : "))

print(t1)
print(t2)

for i in range(3,inp+1):
	f.write(str(t3))
	t1, t2 = t2, t3
	t3 = t1 + t2
	
print("Appended successfully")
