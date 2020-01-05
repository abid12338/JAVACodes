//Define the class JasonButler_Assignment10_Q9BankAccount.

public abstract class problem_9_bankaccount

{

    protected String Name;

    protected String Number;

    protected double balance;

    protected int num_deposits;

    protected int num_withdrawls;

    protected double ann_int_rate;

    protected double month_charge;

    public problem_9_bankaccount(double bal, double rate)

    {

        this.balance = bal;

        this.ann_int_rate = rate;

        num_deposits = 0;

        num_withdrawls = 0;

        month_charge = 0;

    }

    public void deposit(double amount)

    {

        this.balance += amount;

        num_deposits++;

    }

    public void withdraw(double amount)

    {

        if(amount <= balance)

        {

            this.balance -= amount;

            num_withdrawls++;

        }

       

    }


    public void calcInterest()

    {

        double mon_int_rate = (ann_int_rate/12);

        double interest = balance * mon_int_rate;

        balance = balance + interest;

    }

    public void monthlyProcess()

    {

        balance -= month_charge;

        this.calcInterest();

       num_deposits = 0;

        num_withdrawls = 0;

        month_charge = 0;

    }


    public void set_name(String name)

    {

        this.Name = name;

    }

    public void set_account(String account)

    {

        this.Number = account;

    }

    public double get_bal()

    {

        return balance;

    }

    public int get_no_deposit()

    {

        return num_deposits;

    }

    public int get_no_withdrawls()

    {

        return num_withdrawls;

    }

}
