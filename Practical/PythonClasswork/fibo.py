def fib():
    fibo="0 1"
    first = 0 
    second =1
    for i in range(2,10):
        fibo+= " " +str(+first+second)
        first,second=second,first+second
    return fibo

f1=open("fibo.txt","w")
f1.write(fib())
f1.close()
print(fib())   