a=int(input("Enter a num1:"))
b=int(input("Enter a num2:"))
pow=1
for i in range(b):
    pow*=a
print("Power of {} raised to {} is: {}".format(a,b,pow))