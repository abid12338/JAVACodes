import java.util.Scanner;
public class assignment__3_3 {


    private int[] employeeID = {1, 2, 3,
               4, 5, 6,7
       };


       private int[] hours = new int[7];


       private double[] payRate = new double[7];


       private double[] wages = new double[7];


       public int getEmployeeID(int index) {
           return employeeID[index];
       }


       public int getHours(int index) {
           return hours[index];
       }


       public double getPayRate(int index) {
           return payRate[index];
       }


       public double getWages(int index) {
           return wages[index];
       }


       public void setEmployeeID(int index, int ID) {
           employeeID[index] = ID;
       }


       public void setHours(int index, int hour) {
           hours[index] = hour;
       }


       public void setPayRate(int index, double payrate) {
           payRate[index] = payrate;
       }


       public void setWages(int index, double wage) {
           wages[index] = wage;
       }



       public double calculateGrossPay(int theEmployeeID) {
           double grossPay = 0;
           int employeeIndex = - 1; 
           for (int i = 0; i < employeeID.length; i++) {
               if (employeeID[i] == theEmployeeID) {
                   employeeIndex = i;
                   break;
               }
           }
           if (employeeIndex != - 1) {


               int h = hours[employeeIndex];
               double r = payRate[employeeIndex];
               grossPay = (h * r); 
           }
           return grossPay;
       }
    }