try:
    with open('concate1.txt','r') as file1, open('concate2.txt','r') as file2:
        data1=file1.read()
        data2=file2.read()
        concated_data=data1+"\n"+data2
    with open('concated.txt','w') as file:
        file.write(concated_data)
    print("Files concatenated in concated.txt")
except FileNotFoundError:
    print("One or both input files is missing")
except Exception as e:
    print("Error occured:",e)