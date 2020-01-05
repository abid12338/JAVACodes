package assignment_8;
import java.util.Scanner;
public class problem_1
{
static final double pi=Math.PI;
static double Area(double radius)
{
return pi*radius*radius;
}
static double Area(double length,double width)
{
return length*width;
}
static double Area(float radius,double height)
{
return pi*radius*radius*height;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter radius of the circle: ");
double circleRadius=sc.nextDouble();
System.out.print("Enter Length and Width of the "
+ "rectangle: ");
double rectangleLength=sc.nextDouble();
double rectangleWidth=sc.nextDouble();
System.out.print("Enter Radius and Height of the"
+ " cylinder: ");
double cylinderRadius=sc.nextDouble();
double cylinderHeight=sc.nextDouble();
System.out.println("");
System.out.println("The area of the circle is: "
+problem_1.Area(circleRadius));
System.out.println("The area of the rectangle is: " +problem_1.Area(rectangleLength,rectangleWidth));
System.out.println("The area of the cylinder is: "
+problem_1.Area( cylinderRadius,cylinderHeight));
}
}
