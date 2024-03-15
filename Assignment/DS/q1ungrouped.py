#mean, median, mean deviation, mode, variance and standard deviation,
#chebyshev
from typing import List
def mean(numbers:List[int])->float:
	"""take number iterable and return mean as float value"""
	return sum(numbers)/len(numbers)
def median(numbers):
	return numbers[len(numbers)//2] if len(numbers)%2 != 0 \
	else (numbers[len(numbers)//2]+numbers[len(numbers)//2+1])/2
def meanDeviation
while True:
	n = int(input("Enter How many numbers you have to calculate."))
	numbers= [float(input(f"Enter num {}:".format(i))) for i in range(n)]
	print("a. Mean")
	print("b. Median")
	print("c. Mean Deviation")
	print("d. Mode")
	print("e. Variance")
	print("f. Standard Deviation")
	print("g. All of the above")
	print("h. Chebyshev")
	print("i. Exit")
	c=input("Enter choice:").lower()
	if(96<ord(c)<106):
		print("Enter correct choice!!!")
		continue
	if c =='i':
		break
	elif c == 'a' 
		mean(numbers)
		
	
