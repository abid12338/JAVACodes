import java.util.Scanner;
public class Assignment_5_2 {
	
	public static void main(String[] args) {
	double wholesale = 0;
	double percent = 0;
	double retail = 0;
	Scanner text = new Scanner(System.in);
	System.out.println("please enter the wholesale amount");
	wholesale = text.nextDouble();
	System.out.println("please enter the percentage");
	percent = text.nextDouble();
	
	calc(wholesale, retail, percent);
	
	System.out.println("Retail price is " + calc(wholesale, retail, percent));
	
	
	}
	


public static double calc(double wholesale, double retail, double percent) {
	
	percent = percent/100;
	retail = (wholesale * percent) + wholesale;
	
	return retail;
	
	
}
}