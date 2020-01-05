import java.util.Scanner;
public class assignment_2_7 {

	public static void main(String[] args) {
		
	     
		 Double stateTax = 0.04;
		 Double totalStateTax;
	     Double countyTax = 0.02;
	     Double totalCountyTax;
	     
	     Double totalAmount;
	     
	  
	     
	     Scanner keyboard = new Scanner(System.in);
	     
	     System.out.println("Enter your total purchase");
	     
	     Double totalPurchase = keyboard.nextDouble();
	     
	     Double totalTax = (countyTax + stateTax) * totalPurchase;
	     
	     Double totalsale = totalTax + totalPurchase;
	     
	     totalStateTax = stateTax * totalPurchase; 
	     
	     totalCountyTax = countyTax * totalPurchase;
	     
	     totalAmount = totalTax + totalPurchase;
	     
	     System.out.println("The total state sales tax is " + totalStateTax + "\nThe Total County sales tax is " + totalCountyTax + "\nThe Total sales tax is " + totalTax + "\nThe total amount is " + totalAmount);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     

	}
}
