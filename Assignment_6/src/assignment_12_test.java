import java.util.Scanner; 
import java.io.*; 
import java.text.DecimalFormat; 
public class assignment_12_test{
	public static void main(String[] args) throws IOException
    {
        assignment_12 account;
        int months = 0;
        double depAmount;
        double withAmount;
        double totalDeposits = 0.00;
        double totalWithdrawn = 0.00;

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

       
        // Create a Decimal Format object to set $ amouts display.
        DecimalFormat dollar = new DecimalFormat("##,##0.00");

        // Get the starting balance.
        System.out.println("Enter the savings account's starting balance: ");
        double bal = keyboard.nextDouble();

       
        // Get the annual interest rate.
        System.out.println("Enter the savings account's annual interest rate: ");
        double intRate = keyboard.nextDouble();
       
        // Create a SavingsAccount object.
        account = new assignment_12(bal, intRate);


        // Get the number of month the savings account has been open.
        System.out.println("How many months have passed since the account "
                + "was opened? :");
        months = keyboard.nextInt();

        // Process the information for the months.
        for (int month = 1; month <= months; month++)
        {
            // Get the account's balance.
            bal = account.getBalance();

            // Get the amount of the deposit.
            System.out.println("Enter the amount deposited during month "
                    + month + ": ");
            depAmount = keyboard.nextDouble();
            account.addDeposit(depAmount);

            // Running total for deposits.
            totalDeposits = (totalDeposits + depAmount);

            // Get the amount of the withdraw.
            System.out.println("Enter the amount withdrawn during month "
                    + month + ": ");
            withAmount = keyboard.nextDouble();
            account.subtractWithdraw(withAmount);

            // Running total for withdraw.
            totalWithdrawn = (totalWithdrawn + withAmount);

            // Calculate the interest for the month.
           
            account.addInterest();
            System.out.println("Balance at the end of month "+month+": "+
                    dollar.format(account.getBalance()));
        }

       
        System.out.println("Total deposited: $" + dollar.format(totalDeposits));
       
        System.out.println("Total withdrawn: $" + dollar.format(totalWithdrawn));

        // Display the ending balance.
        System.out.println("Ending balance: $" + dollar.format(account.getBalance()));
    }
}