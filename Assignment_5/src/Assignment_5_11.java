import java.util.Scanner;
import java.io.*;
 class Assignment_5_11 {

	public static void main(String[] args) {
		double  NS,SP,SC,PP,PC;
		double Profit;
		int n;
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter number of stocks:");
		n = keyboard.nextInt();
		for(int i=0;i<n;i++) 
		{
    	
    	System.out.println("enter a number of shares:");
    	NS=keyboard.nextDouble();
    	
    	System.out.println("enter sale price per share: ");
    	SP=keyboard.nextDouble();
    	
    	System.out.println("enter sale commission paid: ");
    	SC=keyboard.nextDouble();
    	
    	System.out.println("enter purchase price for share; ");
    	PP=keyboard.nextDouble();
    	 
    	System.out.println("Enter purchase comission paid: ");
    	PC=keyboard.nextDouble();
		
    	Profit=calculateProfit(NS,SP,SC,PP,PC);
    	
    	
		if(Profit<0)
    		System.out.println("loss for stock" + i + "is: "+ Profit);
    	else 
    		System.out.println("Profit for stock" + i + "is: "+ Profit);
		}
	}
	

    public static double calculateProfit(double NS,double SP, double SC,double PP, double PC)		
    
    {		
    	double profit;
    	profit=((NS*SP)-SC)-((NS*PP)+PC);
    	return profit;
    }
    	
			
	}


