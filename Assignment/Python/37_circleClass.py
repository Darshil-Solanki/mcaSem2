import math
class circle:
    def __init__(self,radius):
        self.radius=radius
    def area(self):
        return math.pi*self.radius*self.radius
    def perimeter(self):
        return 2*math.pi*self.radius
        
c=circle(5)
print("Area of circle:",c.area())
print("Area of perimeter:",c.perimeter())