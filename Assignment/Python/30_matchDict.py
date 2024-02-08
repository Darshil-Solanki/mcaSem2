dic1={
    1:"one",
    2:"two",
    3:"three",
    4:"four",
    5:"five"
}
dic2={
    1:"one",
    2:"two",
    3:"3",
    4:"fourth",
    5:"five"
}
for i in dic1.keys():
    if(dic1[i]!=dic2[i]):
        print("Value of dic1 and dic2 for key {} not matched".format(i))