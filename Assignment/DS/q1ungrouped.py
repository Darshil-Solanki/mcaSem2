#simple module by darshil solanki for statistics ungrouped data
#mean, median, mean deviation, mode, variance and standard deviation,
#chebyshev
from typing import List
from collections import Counter
from math import sqrt

def mean(numbers:List[int])->float:
	"""Take number iterable and return mean as float value"""
	try:
		return sum(numbers)/len(numbers)
	except ValueError:
		print("Incorrect Values!!!")
	except:
		print("Error Occured!!!")

def median(numbers:List[int])->float:
	"""Return median of list of integers or floats"""
	try:
		numbers.sort()
		return numbers[len(numbers)//2] if len(numbers)%2 != 0 \
		else (numbers[len(numbers)//2]+numbers[len(numbers)//2-1])/2
	except ValueError:
		print("Incorrect Values!!!")
	except:
		print("Error Occured!!!")

def meanDeviation(numbers:List[int])->float:
	"""Returns Mean Deviation of numbers list of integers or floats"""
	try:
		m=mean(numbers)
		return sum([abs(x-m) for x in numbers])/len(numbers)
	except ValueError:
		print("Incorrect Values!!!")
	except:
		print("Error Occured!!!")

def mode(numbers:List)->List:
	"""Return Mode values of numbers iterable"""
	try:
		c=Counter(numbers)
		return [k for k,v in c.items() if v==max(c.values())]
	except ValueError:
		print("Incorrect Values!!!")
	except:
		print("Error Occured!!!")

def variance(numbers:List)->float:
	"""Return Variance of numbers iterable"""
	try:
		m=mean(numbers)
		return sum((x-m)**2 for x in numbers)/len(numbers)
	except ValueError:
		print("Incorrect Values!!!")
	except:
		print("Error Occured!!!")	

def standardDeviation(numbers:List)->float:
	"""Return Standard Variance of numbers iterable"""
	return sqrt(variance(numbers))

def chebyshev(std:float,low:float,high:float):
	"""Return How many percentage of data of range(low,high) lie in k
	range of standard deviation from mean."""
	try:
		k=abs(high-low)/(2*std)
		if(k<=1):
			print("Not a valid range of standard deviation to get percentage.")
			print("Provide a range of atleast 75% data")
			return -1
		return (1-1/(k*k))*100
	except ValueError:
		print("Incorrect Values!!!")
	except:
		print("Error occured!!!")
while True:
	print("a. Mean")
	print("b. Median")
	print("c. Mean Deviation")
	print("d. Mode")
	print("e. Variance")
	print("f. Standard Deviation")
	print("g. Chebyshev")
	print("h. All of the above")
	print("i. Exit")
	c=input("Enter choice:").lower()
	if(ord(c)<97 or ord(c)>105):
		print("Enter correct choice!!!")
		continue
	if c =='i':
		break
	if c == 'g':
		try:
			low = float(input("Enter Range low value:"))
			high = float(input("Enter Range high value:"))
			std = float(input("Enter standard deviation:"))
			print("Percentage of data within range of standard deviation using chebyshev's formula:",chebyshev(std,low,high))
		except ValueError:
			print("Provide correct value!!!")
		continue
	n = int(input("Enter How many numbers you have to calculate:"))
	numbers= [float(input("Enter num {0}:".format(i+1))) for i in range(n)]
	if c == 'a':
		m=mean(numbers)
		print("Mean of numbers is:",m)	
	elif c == 'b':
		m=median(numbers)
		print("Median of numbers is:",m)
	elif c == 'c':
		m=meanDeviation(numbers)
		print("Mean Deviation of number is:",m)
	elif c == 'd':
		m=mode(numbers)
		print("Mode of numbers is:",m)
	elif c == 'e':
		v=variance(numbers)
		print("Varaiance in numbers is:",v)
	elif c == 'f':
		std=standardDeviation(numbers)
		print("Standard Deviation in numbers is:",std)
	elif c == 'h':
		print("Mean of numbers is:",mean(numbers))	
		print("Median of numbers is:",median(numbers))
		print("Mean Deviation of number is:",meanDeviation(numbers))
		print("Mode of numbers is:",mode(numbers))
		print("Varaiance in numbers is:",variance(numbers))
		print("Standard Deviation in numbers is:",standardDeviation(numbers))
		try:
			low = float(input("Enter Range low value:"))
			high = float(input("Enter Range high value:"))
			std = float(input("Enter standard deviation:"))
			print("Percentage of data within range of standard deviation using chebyshev's formula:",chebyshev(std,low,high))
		except ValueError:
			print("Provide correct value!!!")
	else:
		pass