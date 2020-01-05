import java.util.Scanner;
public class assignment_3_9 {


    public static void main(String[] args) {
        {Scanner keyboard = new Scanner(System.in);

        double pounds = 0.00;
        double shipping = 0;

       System.out.println("How many pounds?");
        pounds= keyboard.nextDouble();

       if(pounds >= 0 && pounds <= 2) {
        shipping = 1.10;

        }else if (pounds > 2 && pounds <= 6) {
        shipping = 2.20;

        }else if (pounds > 6 && pounds <= 10) {
        shipping = 3.70;

       }else if (pounds > 10) {
           shipping = 3.80;
        }
        System.out.println("The shipping rate is " + shipping);
        }

        }
    }