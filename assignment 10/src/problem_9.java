//Define the Main class.

public class problem_9

{

    public static void main(String[] args) {

    	problem_9_savings new_acc = new problem_9_savings(300, 0.3);

        new_acc.set_name("Jay Wombat");

        new_acc.set_account("1234-5189-8855-7982");

        new_acc.print();

        System.out.println("Withdrawal Of 250$");

        new_acc.withdraw(250);

        new_acc.print();

        System.out.println("Withdrawal Of 35$");

        new_acc.withdraw(35);

        new_acc.print();

        System.out.println("Deposit Of 500$");

        new_acc.deposit(500);

        new_acc.print();


        new_acc.monthlyProcess();

        new_acc.print();

    }

}
