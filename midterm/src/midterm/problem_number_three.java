package midterm;

import java.util.*;

public class problem_number_three {

	public static void main(String[] args) {
		
		//Overview written to prompt the user what they will be inputting 
		System.out.println("The following program prompts the user to enter a width (x) and height (y) as coordinates");
		System.out.println("and then tells them if the coordinates fall within a rectangle with a width of 10 from (0,0) and a height of 5 from origin (0,0).");
		System.out.println("");
		
		//Creating a scanner to capture x and y coordinates
		Scanner rectangle = new Scanner(System.in);
		
		//Width (x) and height (y) captured here
	    System.out.print("Please enter two coordinates (x y): ");
	    double xWidth = rectangle.nextDouble();
	    double yHeight = rectangle.nextDouble();

	    rectangle.close();

	    double distanceXWidth = Math.pow(xWidth * xWidth, 0.5D);
	    double distanceYHeight = Math.pow(yHeight * yHeight, 0.5D);

	    //If statement to determine whether the coordinates provided lie within the rectangle
	    if ((distanceYHeight <= 5) && (distanceXWidth <= 10.0)) {
	        System.out.println("Point (" + xWidth + ", " + yHeight + ") lies within the rectangle");
	    } else {
	        System.out.println("Point (" + xWidth + ", " + yHeight + ") does not lie within the rectangle");

	}

}
}

