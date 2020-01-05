package assignment_2_21;

import java.util.Scanner;

public class Asssignment_2_21 {

	public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

		Double a;
        Double r;
		
		System.out.println("Enter the amount of money originally deposited	into the account ");
		
		Double p = Keyboard.nextDouble();
		
		System.out.println("Enter the amount of annual interest rate paid by the account ");
		
		Double r1 = Keyboard.nextDouble();
		
		r = r1 / 100;
		
		System.out.println("Enter the number of times per year the interest is compounded ("
				+ " for example, if interest is compounded monthly, enter 12. If interest is compounded quarterly enter 4) ");

		Double n = Keyboard.nextDouble();
		
		System.out.println("Enter the number of years the acccount will be left to earn interest ");
		
		
		Double t = Keyboard.nextDouble();
		
		a  = p * (1 + r * n) * n * t;
				
	
		System.out.println(" The amount of money that will be in the account is " + a );

	
	}

}
