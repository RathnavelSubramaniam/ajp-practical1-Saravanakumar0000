[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=24298287)
# AJP-PRG1
Quadrilateral
Step 1: Class Design with Constructors
 Define the Point class with private instance variables x and y, and parameterized
constructor to set the value of x and y. Define getX() and getY() to return the value of x and
y respectively.
 Define the Quadrilateral class with private instance variables point1, point2, point3, and
point4 of type Point representing the four endpoints of the quadrilateral. Include
parameterized constructors to assign the values of these four points.
 Define the Trapezoid class, Rectangle class and Square class as a subclass of Quadrilateral.
Inside all the subclasses, call super() which calls the superclassconstructor for assigning the
values to these points.
Step 2: Implement the method to find Area
 Inside each subclass, declare a method calculateArea and calculate the Area of the
corresponding shapes.
Step 3: Creating main()
 Instantiate objects of each class (Point, Quadrilateral, Trapezoid, Rectangle, Square)
 Set points for each shape object
 Calculate and output the area of each shape except for Quadrilateral
