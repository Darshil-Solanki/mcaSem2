n1=int(input("Enter a num:"))
n2=int(input("Enter a num:"))

fact1=[]
fact2=[]

gcd=1

nt1=n1
nt2=n2

for i in range(2,n1+1):
    while(nt1%i==0):
        fact1.append(i)
        nt1=int(nt1/i)

for i in range(2,n2+1):
    while(nt2%i==0):
        fact2.append(i)
        nt2=int(nt2/i)

for i in fact1:
    if(i in fact2):
        gcd*=i
        fact2.remove(i)
        fact1.remove(i)

if(len(fact2)!=0):
    for i in fact2:
        if(i in fact1):
            gcd*=i
            fact1.remove(i)
            
print("GCD of {} and {} is {}".format(n1,n2,gcd))