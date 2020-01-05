//Define the class JasonButler_Assignment10_Q9SavingsAccount.

public class problem_9_savings extends problem_9_bankaccount


{

    private boolean status;


    public problem_9_savings(double bal, double rate)

    {

        super(bal, rate);

        if(bal > 25)

        {

            status = true;

        }

        else

        {

            status = false;

        }

    }

    public void deposit(double amount)

    {

        if(!status)

        {

            if(balance + amount >= 25)

            {

                status = true;

            }

            super.deposit(amount);

        }

        else

        {

            super.deposit(amount);

        }

    }

    public void withdraw(double amount)

    {

        if(status)

        {

            super.withdraw(amount);

            if(balance < 25)

            {

                status = false;

            }

        }

  }

    public void monthlyProcess()

    {

        if(num_withdrawls > 4)

        {

            month_charge +=1;

        }

        balance -= month_charge;

        this.calcInterest();

        if(balance < 25)

        {

            status = false;

        }

        num_deposits = 0;

        num_withdrawls = 0;

    }

    public boolean get_status()

    {

        return status;

    }

    public void print()

    {

        System.out.println();

        System.out.println("Name: "+Name);

        System.out.println("Account Number: "+ Number);

        System.out.println("Balance: "+balance + "$");

        if(!status)

        {

            System.out.println("Status: Inactive");

        }

        else

        {

            System.out.println("Status: Active");

        }

        System.out.println();

    }

}
