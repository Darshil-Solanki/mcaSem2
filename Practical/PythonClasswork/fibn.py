def fib(n):
    first=0 
    second=1
    sequence=""
    if(n>0 and n<16):
        if(n == 0):
            pass
        elif(n == 1):
            sequence+="0"
        elif(n == 2):
            sequence+="0 1"
        else:
            sequence+="0 1"
            for i in range(n-2):
                temp=first
                first=second
                second=temp+second
                sequence+=(" "+str(second))
        print(sequence)
    else:
        print("Wrong Number.")
