import sys

def add(b,c,d):
    temp=[[b[0][i]+c[0][i]for i in range(3)],
          [b[1][i]+c[1][i]for i in range(3)]]
    return [[temp[0][i]+d[0][i] for i in range(3)],[temp[1][i]+d[1][i] for i in range(3)]]

try:
    a= [ [ int(sys.argv[i]) for i in range(1,4)],[int(sys.argv[i]) for i in range(4,7)] ]
    print("From cmdLine:\n",a)
    print("Addition:")
    print(add(a,a,a))
except IndexError:
    print("Provide enough numbers")
except Exception as e:
    print("Error occured:",e)