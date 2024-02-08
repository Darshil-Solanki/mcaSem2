try:
    with open('demo.txt','r') as file:
        content = file.read()
        print("File Data:\n",content)
except FileNotFoundError:
    print("Error:File not found. Make sure path is correct and file exists")
except Exception as e:
    print("Error occured:",e)