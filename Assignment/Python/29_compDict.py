compAccessory={
    "a1":{
        "name":"keyboard",
        "price":800
    },
    "a2":{
        "name":"mouse",
        "price":500
    },
    "a3":{
        "name":"display",
        "price":5000
    },
    "a4":{
        "name":"motherboard",
        "price":2000
    },
    "a5":{
        "name":"pendrive",
        "price":250
    },
}

print("Accessory before changes:\n",compAccessory)

for key,value in compAccessory.items():
    if(value["price"]<500):
        compAccessory[key]["price"]=500

print("Accessory after changes:\n",compAccessory)