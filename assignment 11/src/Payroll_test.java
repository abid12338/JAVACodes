import java.util.*;
public class Payroll_test {

  
   public static void main(String[] args) {
       Scanner sc1=new Scanner(System.in);
       Scanner sc=new Scanner(System.in);
      
   while(true)
   {
       System.out.print("Please enter the name of an employee:");
       String name=sc.nextLine();
       System.out.print("Please enter the employee's ID:");
       int id=sc1.nextInt();
       System.out.print("Please enter the # of hours the employee worked:");
       int noOfHours=sc1.nextInt();
       System.out.print("Please enter the hourly pay rate for the employee:");
       int payRate=sc1.nextInt();
       problem_5 pr=new  problem_5 (name,id,noOfHours,payRate);
      
if(pr.count==0)
{continue;}
else
{
   System.out.println(pr.toString());
   System.out.println("*Program Terminated*");break;}
   }
  
   

   }

}
