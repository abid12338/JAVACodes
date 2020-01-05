package midterm;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class problem_number_one {

	public static void main(String[] args) {
		
	Scanner invest = new Scanner(System.in);

		System.out.print("Please enter the starting amount you are going to invest in $: ");
		double initialInvestment = invest.nextDouble();
		
		System.out.print("Please enter the % monthly interest rate: ");
		double interestMonthly = invest.nextDouble();
		
		interestMonthly /= 1200;
		System.out.print("Please enter the number of years your investment will grow: ");
		int numberOfYears = invest.nextInt();

		
		double finalInvestmentValue= 
		initialInvestment * Math.pow(1 + interestMonthly, numberOfYears * 12);
		
	
		NumberFormat twoDecimal = DecimalFormat.getInstance();
		twoDecimal.setMaximumFractionDigits(2);;
		
		
		System.out.println("The value of your $" + initialInvestment+ " initial investement with a monthly interest of " + interestMonthly + " over " + numberOfYears + " years");
		System.out.println("is $" + twoDecimal.format(finalInvestmentValue));
	}}
