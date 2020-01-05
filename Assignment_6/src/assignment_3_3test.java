import java.text.DecimalFormat;
import java.util.Scanner;
public class assignment_3_3test {

     public static void main(String[] args) {

    	 assignment__3_3  payroll = new assignment__3_3();
           Scanner kb = new Scanner(System.in);

           int hours;
           double payRate;
           double wages;


           int[] employeeID = {1, 2, 3,
                   4, 5, 6, 7  };

           for (int i = 0; i < 7; i++) {

               do {


                   System.out.println("Enter the hours worked by employee number " + employeeID[i]+":");
                   hours = Integer.parseInt(kb.nextLine());
               }
               while (hours < 0);

               payroll.setHours(i, hours);

               do {

                   System.out.println("Enter the hourly pay rate for employee number :" + employeeID[i]+":" );
                   payRate = Double.parseDouble(kb.nextLine());


                   if(payRate<0.00)
                       System.out.println("ERROR: Enter 6.00 or greater for pay rate: ");

               }while (payRate < 0.00);

               payroll.setPayRate(i, payRate);
               int empid = payroll.getEmployeeID(i);
               wages = payroll.calculateGrossPay(empid);
               payroll.setWages(i, wages);
           }


           DecimalFormat df=new DecimalFormat("##,###.00");


           System.out.println("        PAYROLL DATA        ");
           System.out.println("        =============       ");
           for (int i = 0; i < 7; i++) {
               System.out.println("\tEmployee ID: " + payroll.getEmployeeID(i));
               System.out.println("\tGross pay: $" + df.format(payroll.getWages(i)));
           }

           System.exit(0);
       }
    }