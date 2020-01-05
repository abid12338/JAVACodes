
import java.text.DecimalFormat;
import java.util.Scanner;

public class problem_9
{
public static void main(String[] args)
{

int choice;
double radius, length, width, base, height;


Scanner keyboard = new Scanner(System.in);

DecimalFormat form = new DecimalFormat("##.###");

while (true)
{
System.out.println("Geometry Calculator");
System.out.println("1. Calculate the Area"
+ " of Circle");

System.out.println("2. Calculate the Area"
+ " of Rectangle");
System.out.println("3. Calculate the Area"
+ " of Triangle");
System.out.println("4. Quit");
System.out.println();

System.out.print("Enter your choice (1-4):"
+ " ");

choice = keyboard.nextInt();

switch (choice)
{

case 1:
System.out.print("Enter radius of the"
+ " circle: ");
radius = keyboard.nextDouble();
System.out.println("Area of Circle: "
+ form.format(Geometry.
circlesArea(radius)));
break;

case 2:
System.out.print("Enter length of "
+ "rectangle: ");
length = keyboard.nextDouble();
System.out.print("Enter width of "
+ "rectangle: ");
width = keyboard.nextDouble();
System.out.println("Area of "
+ "Rectangle: " +
form.format(
Geometry.rectanglesArea
(length, width)));
break;

case 3:
System.out.print("Enter base of"
+ " triangle: ");
base = keyboard.nextDouble();
System.out.print("Enter height of "
+ "triangle: ");
height = keyboard.nextDouble();
System.out.println("Area of Triangle: "
+ form.format(Geometry
.trianglesArea(
base, height)));
break;

case 4:
System.exit(0);
break;

default:
System.out.println("You have selected"
+ " out of range. \nPlease"
+ " select your choice in"
+ " range(1-4).");
}
System.out.println();
}
}
}

class Geometry
{

public static double circlesArea(double cir_radius)
{
if (cir_radius < 0)
{
errorMessage(" circle's radius.");
return 0;
}
else
return Math.PI * cir_radius * cir_radius;
}



public static double rectanglesArea(
double rec_length, double rec_width)
{
if (rec_length < 0 || rec_width < 0)
{
errorMessage(" rectangle's length or "
+ "width.");
return 0;
}
else
return rec_length * rec_width;
}private static void errorMessage(String string) {


	
}





public static double trianglesArea(double tri_base,
double tri_height)
{
if (tri_base < 0 || tri_height < 0)
{
errorMessage(" triangle's base or height");
return 0;
}
else
return tri_base * tri_height * 0.5;
}}

