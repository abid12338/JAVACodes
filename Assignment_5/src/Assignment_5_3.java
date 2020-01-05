import java.io.PrintStream;
import java.util.Scanner;
public class Assignment_5_3 {

    public static void main(String[] args) {
    double width = 0;
    double length = 0;
    double area = 0;
    PrintStream display = null;
    Scanner text = new Scanner(System.in);

    getdisplay(length, width, area, display);


    }

    public static double getLength(double length) {

        System.out.println("please enter the length");
        Scanner text = new Scanner(System.in);
        length = text.nextDouble();

        return length;
    }

    public static double getWidth(double width) {
        System.out.println("please enter the width");
        width = new Scanner(System.in).nextDouble();

        return width;

    }

    public static double getArea(double length, double width, double area) {
         area = getLength(length) * getWidth(width);
        return area;

    }

    public static PrintStream getdisplay(double length, double width, double area, PrintStream display) {
    System.out.printf("The area is " + getArea(length, width, area));

        return display;
    }







}