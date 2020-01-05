
import java.util.Scanner;
public class assignment_5_6 {

    public static void main(String[] args) {
        double F =0;
        double C =0;
        double temp = 0;
        getTemp(F, C, temp);
    }

        public static double getTemp(double f, double c, double temp) {
        for (c = 0; c <= 20; c++ ) {

            f = ((9*c) / 5) + 32;

            System.out.println("Celsius: " + c);

            System.out.println("Fahrenheit: " + f);


    }
        return temp;
        }

}