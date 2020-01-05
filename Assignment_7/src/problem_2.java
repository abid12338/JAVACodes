import java.util.Scanner;

public class problem_2 {

    static int[] employeeID = { 5658845, 4520125, 7895122, 8777541, 8451277,
            13028590, 7580489 };
    static int[] hours = new int[7];
    static double[] payRate = new double[7];
    static double[] wages = new double[7];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Hours and Payrate for every employee id");
        for (int i = 0; i < employeeID.length; i++) {
            System.out.println("For Employee ID: " + employeeID[i]);
            System.out.print("Enter hours");
            do {
                hours[i] = input.nextInt();
                if (hours[i] < 0) {
                    System.out.print("Reenter hours");
                }
            } while (hours[i] < 0);
            System.out.print("Enter Payrate");
            do {
                payRate[i] = input.nextDouble();
                if (payRate[i] < 6) {
                    System.out.print("Reenter Payrate");
                }
            } while (payRate[i] < 6);
            wages[i] = hours[i] * payRate[i];
        }

        System.out.println("Employee Id      Wages");
        System.out.println("-----------      -----");
        for (int i = 0; i < employeeID.length; i++) {
            System.out.print(employeeID[i] + "          " + wages[i]);
            System.out.println();
        }
    }
}