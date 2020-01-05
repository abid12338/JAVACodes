package midterm;

import java.util.*;

public class problem_number_two {

	public static void main(String[] args) {
		
	    
		Scanner taxScanner = new Scanner(System.in);
		
		// Instruction created on which tax filing statuses to pick
		System.out.println("The following values are tax filing statuses");
		System.out.println("............................................");
		System.out.println("0 = Single Filer, 1 - Married Jointly, 2 = Married Separately, 3 = Head of Household");
		System.out.println("");
		System.out.println("Please enter your current tax year filing status: ");

		int filingStatus = taxScanner.nextInt();
		
		
		if (filingStatus >= 4 || filingStatus < 0) {
			System.out.println("Invalid entry. Please enter filing status 0, 1, 2, or 3");
			System.exit(0);
		}
		
		
		System.out.print("Please enter your total taxable income in $: ");
		double taxableIncome = taxScanner.nextDouble();
		
		double tax = 0;
		
			
		if (filingStatus == 0) {
			if (taxableIncome <= 8350)
				tax = taxableIncome * 0.10;
			
			else if (taxableIncome <= 33950)
				tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
			
			else if (taxableIncome <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(taxableIncome - 33950) * 0.25;
			
			else if (taxableIncome <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(82250- 33950) * 0.25 + (taxableIncome- 82250) * 0.28;
			
			else if (taxableIncome <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
					(taxableIncome - 171550) * 0.35;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
					(372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
		}
		
		
		if (filingStatus == 1) {
			if (taxableIncome <= 16700)
				tax = taxableIncome * 0.10;
			
			else if (taxableIncome <= 67900)
				tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
			
			else if (taxableIncome <= 137050)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
					(taxableIncome - 137050) * 0.25;
			
			else if (taxableIncome <= 208850)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
					(208850 - 137050) * 0.25 + (taxableIncome - 208851) * 0.28;
			
			else if (taxableIncome <=372950)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
					(208850 - 137051) * 0.25 + (372950 - 208851) * 0.28 +
					(taxableIncome - 208851) * 0.33;
			
			else 
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
					(208850 - 137051) * 0.25 + (372950 - 208851) * 0.28 +
					(372950 - 208851) * 0.33 + (taxableIncome - 372951) * 0.35;
		}
		
		
		if (filingStatus == 2) {
			if (taxableIncome <= 8350)
				tax = taxableIncome * 0.10;
			
			else if (taxableIncome <= 33950)
				tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
			
			else if (taxableIncome <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(taxableIncome - 33950) * 0.25;
			
			else if (taxableIncome <= 104425)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(68525 - 33950) * 0.25 + (taxableIncome - 68525) * 0.28;
			
			else if (taxableIncome <= 186475) 
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
					(68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
					(taxableIncome - 104426) * 0.33;
			else 
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				(68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
				(186475 - 104426) * 0.33 + (taxableIncome - 186476) * 0.35;
		}
		
		
		if (filingStatus == 3) {
			if (taxableIncome <= 11950)
				tax = taxableIncome * 0.10;
			
			else if (taxableIncome <= 45500)
				tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
			
			else if (taxableIncome <= 117450)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
					(taxableIncome - 45500) * 0.25;
			
			else if (taxableIncome <= 190200)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
					(117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
			
			else if (taxableIncome <= 372950) 
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
					(117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
					(taxableIncome - 190200) * 0.33;
			else 
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
				(117450 - 45500) * 0.25 + (104425 - 117450) * 0.28 +
				(372950 - 190200) * 0.33 + (taxableIncome - 372951) * 0.35;
		}
		
					
		
		System.out.println("Your income tax is " + (int)(tax * 100) / 100.0);
	}
}
