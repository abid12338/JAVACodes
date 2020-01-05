import java.util.Scanner;
public class Assignment_4_2 {

	public static void main(String[] args) {
		int speed; 
		int time;		
		int distance;
			
       Scanner keyboard = new Scanner(System.in);
       
       System.out.println("Enter the speed of the vehicle per hour ");
       
       speed = keyboard.nextInt();
       
       System.out.println("Enter the time traveled in hour ");
       
       time = keyboard.nextInt();
       
    
       
       for (distance =1; distance <= speed; distance++) {
    	   
    	   
    	   System.out.println(distance);
    	   System.out.println(time * distance);
    	 
    	   
    	   
       }
	}

}

