import math

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def distance(self):
        return math.hypot(self.x, self.y)
    
    def distance_to(self, other):
        return math.hypot(self.x - other.x, self.y - other.y)
    

def main():
    x = float(input("Enter x coordinate: "))
    y = float(input("Enter y coordinate: "))
    
    p1 = Point(x, y)
    p2 = Point(4.5, 7.0)
    
    print(f"Distance from origin: {p1.distance()}")
    print(f"Distance to point (4.5, 7.0): {p1.distance_to(p2)}")

main()