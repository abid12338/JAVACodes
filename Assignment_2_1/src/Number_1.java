import java.util.Scanner;


public class Number_1 {

	public static void main(String[] args) {
		//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		
		String name;
		int age;
		double annualPay;
		
		System.out.println("What is your name?");
		
	name = keyboard.nextLine();
	
	System.out.println(name);
	
	System.out.println("What is your age?");
	
	age = keyboard.nextInt();
	
	System.out.println(age);
	
	System.out.println("What is your desired annual income?");
	
	annualPay = keyboard.nextDouble();
	
	System.out.println(annualPay);
	
	System.out.println("My name is " + name + ", my age is " + age + " , and I hope to earn " + annualPay + " per year");
	
	}

}
