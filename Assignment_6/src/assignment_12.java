public class assignment_12 {
	
	  private double balance; // Account Balance
	    private double interestRate; // Account annual InterestRate
	   
	    /**
	    * The constructor initializes the balance and interestRate fields
	    * with the values passed to startBalance and intRate. The interest
	    * field is assigned 0.0.
	    */

	    public assignment_12 (double startBalance,
	            double intRate)
	    {
	        balance = startBalance;
	        interestRate = intRate;
	    }

	    // The getBalance method returns the value in the balance field.

	    public double getBalance()
	    {
	        return balance;
	    }


	    // The addDeposit method add the deposit to the balance.

	    public void addDeposit(double deposit)
	    {
	        balance = (balance + deposit);
	    }

	    //The subtractWithdraw method subtracts the withdraw from the
	    // balance.

	    public void subtractWithdraw(double withdraw)
	    {
	        balance = (balance - withdraw);
	    }

	    // The getInterestRate method returns the value in the interestRate
	    // field.

	    public double getInterestRate()
	    {
	        return interestRate;
	    }


	    // The addInterest method adds the interest earned on the account
	    // based on the current account balance and the interest rate.
	   
	    public void addInterest()
	    {
	        balance = (balance + balance*interestRate/12);
	    }

	}