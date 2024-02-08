from abc import ABC,abstractmethod
import math
class Shape(ABC):
    @abstractmethod
    def display():
        pass
    @abstractmethod
    def area():
        pass
class Rectangle(Shape):
    def __init__(self,length,width):
        self.length=length
        self.width=width
    def display(self):
        print("length:",self.length) 
        print("width:",self.width) 
    def area(self):
        return self.length * self.width
class Circle(Shape):
    def __init__(self,radius):
        self.radius=radius
    def area(self):
        return math.pi*self.radius*self.radius
    def display(self):
        print(f"Circle radius:{self.radius}")
r=Rectangle(3,4)
r.display()
print("Area of rectangle:",r.area())
c=Circle(5)
c.display()
print("Area of circle:",c.area())
