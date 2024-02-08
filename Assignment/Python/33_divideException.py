try:
    n1=int(input("Enter a num1:"))
    n2=int(input("Enter a num2:"))
    print("{}/{} is {}".format(n1,n2,(n1/n2)))
except ZeroDivisionError:
    print("Cann't divide by zero.")
except Exception as e:
    print("Error:",e)