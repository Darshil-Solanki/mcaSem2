#simple module by darshil solanki for statistics ungrouped data
#mean, median, mean deviation, mode, variance and standard deviation,
#chebyshev
from typing import List
from math import sqrt

def getClassesAndFrequencies(numbers:List)->List[List]:
	"""Helper function that get Class interval and Frequncies of data to classes
	Return a list contains list of class interval and list of frequncies to those classes"""
	minV=min(numbers)
	maxV=max(numbers)
	cNo = len(bin(len(numbers)))-2
	cWidth = round((maxV-minV)/cNo)
	class_intervals = [(minV + i * cWidth, minV + (i + 1) * cWidth) for i in range(cNo)]
	frequency_distribution = [0] * cNo
	for value in numbers:
		for i, interval in enumerate(class_intervals):
			if interval[0] <= value < interval[1]:
				frequency_distribution[i] += 1
				break
	return [class_intervals,frequency_distribution]

def mean(numbers:List)->float:
	"""Return Mean of Grouped data frequencies"""
	class_intervals,frequencies=getClassesAndFrequencies(numbers)
	midpoints = [(interval[0] + interval[1]) / 2 for interval in class_intervals]
	mfTotal = sum(midpoints[i] * frequencies[i] for i in range(len(midpoints)))
	fiTotal = sum(frequencies)
	return mfTotal / fiTotal
	
def variance(numbers:List)->float:
	"""Return Variance of Grouped data frequencies"""
	class_intervals,frequencies=getClassesAndFrequencies(numbers)
	midpoints = [(interval[0] + interval[1]) / 2 for interval in class_intervals]
	fiTotal = sum(frequencies)
	mfTotal = sum(midpoints[i] * frequencies[i] for i in range(len(midpoints)))
	mean = mfTotal / fiTotal
	fmxTotal = sum((midpoints[i]-mean)**2*frequencies[i] for i in range(len(midpoints)))
	return fmxTotal/fiTotal
	

def standardDeviation(numbers:List)->float:
	"""Return Standard Deviation of Grouped data frequencies"""
	return sqrt(variance(numbers))	

while True:
	print("a. Mean")
	print("b. Variance")
	print("c. Standard Deviation")
	print("d. All of the above")
	print("e. Exit")
	c=input("Enter choice:").lower()
	if(ord(c)<97 or ord(c)>101):
		print("Enter correct choice!!!")
		continue
	if c =='e':
		break
	n = int(input("Enter How many numbers you have to calculate:"))
	numbers= [float(input("Enter num {0}:".format(i+1))) for i in range(n)]
	if c == 'a':
		m=mean(numbers)
		print("Mean of numbers is:",m)	
	elif c == 'b':
		m=variance(numbers)
		print("Median of numbers is:",m)
	elif c == 'c':
		m=standardDeviation(numbers)
		print("Mean Deviation of number is:",m)
	elif c == 'd':
		print("Mean of numbers is:",mean(numbers))
		print("Variance of numbers is:",variance(numbers))
		print("Standard Deviation of numbers is:",standardDeviation(numbers))
	else:
		pass