try:
    while(True):
        c = input("Enter operand(+-*/) or 0 to exit:")
        if(c == '0'):        
            break
        a = int(input("Enter a num1:"))
        b = int(input("Enter a num2:"))
        if(c == '+'):
            print("Addition of num1 and num2 is:",a+b)
        elif(c == '-'):
            print("Subtraction of num1 and num2 is:",a+b)
        elif(c == '*'):
            print("Multiplication of num1 and num2 is:",a+b)
        elif(c == '/'):
            print("Division of num1 and num2 is:",a+b)
        else:
            print("Please enter valid operand")
except ZeroDivisionError:
    print("Cannot divide by zero")
except ValueError:
    print("invalid value")
except:
    print("Something went wrong.")