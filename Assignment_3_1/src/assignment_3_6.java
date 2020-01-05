import java.io.Serializable;
import java.util.Scanner;
public class assignment_3_6 {


    public static void main(String[] args) {
        {Scanner text = new Scanner(System.in);

        double second = 0.00;
        double hour = 0.00;
        double day = 0.00;
        Serializable time = 0.00 ;


        System.out.println("How many seconds?");
        second = text.nextDouble();

       
        if(second >= 60 && second <= 3599) {
            time = second / 60 + " minute";
        }else if (second >=3600 && second <= 86399) {
        time = second/3600 + " hour"; 
        }else if (second >= 86400) {
        time = second / 86400 + " day";
        }

        System.out.println(time);


    }

}
}