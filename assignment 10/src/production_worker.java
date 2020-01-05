import java.util.Scanner;
public class production_worker
{

   public production_worker(String empName, String empNumber, String date, int sh, double rate) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args)
   {

       Scanner input = new Scanner(System.in);
       char choice;
      
       do
       {

           System.out.print("Please enter the employee name: ");
           String empName = input.nextLine();
          
           System.out.print("Please enter the employee number in format XXX-L (X is a value between 0-9 and L is a letter between A-M): ");
           String empNumber = input.nextLine();
           
           System.out.print("Please enter the employee hire date: ");
           String date = input.nextLine();
           
           System.out.print("Please enter the employee shift (1=day shift and 2=night shift): ");
           int sh = Integer.parseInt(input.nextLine());
           
           System.out.print("Please enter the employee hourly pay rate: $");
           double rate = Double.parseDouble(input.nextLine());
           
           production_worker worker = new production_worker(empName, empNumber, date, sh, rate);
           
           System.out.println("\nDetails of the employee: ");
           System.out.println(worker);
          
           System.out.print("\nDo you want to demonstrate this program again? (Y/N): ");
           choice = input.nextLine().charAt(0);
           System.out.println();
       }while(choice == 'Y' || choice == 'y');
   }
}
