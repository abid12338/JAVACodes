import java.util.Scanner;

public class Assignment_2_17 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner Keyboard = new Scanner(System.in);

        Double sugar = 1.5;
        double butter = 1;
        double flour = 2.75;
        double sugar2;
        double butter2;
        double flour2;



        System.out.println("Input how many cookies you want");

        double userInput = Keyboard.nextDouble();

        sugar2 = (userInput / 48) * 1.5;
        butter2 = (userInput / 48) * 1;
        flour2 = (userInput / 48) * 2.75;



        System.out.println(sugar2);
        System.out.println(butter2);
        System.out.println(flour2);


    }

}