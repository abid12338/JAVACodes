

import java.util.Scanner;


public class Assignment_3_3 {

	public static void main(String[] args) {
		
		Scanner keyboard =  new Scanner(System.in);
	
		double weight;
		Double height;
		
		System.out.println("Enter your weight in pounds");
		
		weight =  keyboard.nextDouble();

		System.out.println("Enter your height in inches ");
		
		height = keyboard.nextDouble();
		
		Double bmi = (weight * 703) / (height * height);

	
        System.out.println( "your BMI is " + bmi);		
		
		if (bmi < 18.5) {
			System.out.println(" your bmi is less than 18.5 so you are underweight ");
		
		
		}
		else  {
			System.out.println("your bmi is over 25 so you are overweight ");
			
		
			
		}
	
		
	
	}

}