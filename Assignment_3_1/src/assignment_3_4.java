
import java.util.Scanner;

public class assignment_3_4 {



    public static void main(String[] args) {
        {Scanner keyboard = new Scanner(System.in);

        int testscores1 = 0;
        int testscores2 = 0;
        int testscores3 = 0;
        int testscoreav = 0;
        char grade;

         System.out.println("Please enter your 1st score");
         testscores1 = keyboard.nextInt();

          System.out.println("Please enter your 2nd score");
         testscores2 = keyboard.nextInt();

          System.out.println("Please enter your 3rd score");
         testscores3 = keyboard.nextInt();

        testscoreav = (testscores1 + testscores2 + testscores3)/3;


            if (testscoreav >= 90) {
                grade = 'A';
            } else if (testscoreav >= 80) {
                grade = 'B';
            } else if (testscoreav >= 70) {
                grade = 'C';
            } else if (testscoreav >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("The average grade is " + grade);


    }

}



}