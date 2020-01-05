public class problem_5
{
   int count=0;
private String name; 
private int idNumber;
private double payRate;
private double hoursWorked;

public problem_5(String name, int idNumber, double payRate, double hoursWorked) {
   super();
  
if(name.length()==0 || name=="")
   {
   try {
       throw new PayrollException(" Employee Name Should Not Be Empty ");
   } catch (PayrollException e) {
       System.out.println("* payroll class failed to create *");
       System.out.println("---------------------------------------------");
   }
  
   }
else if(idNumber<=0)
{
   try {
       throw new PayrollException(" Employee # Must Be > 0 ");
   } catch (PayrollException e) {
       System.out.println(" payroll class failed to create ");
       System.out.println("---------------------------------------------");
   }  
}
else if(hoursWorked<0 || hoursWorked>84)
{
   try {
       throw new PayrollException(" The Total # of Hours Must Be Between 0 And 84 ");
   } catch (PayrollException e) {
       System.out.println("* payroll class failed to create ");
       System.out.println("---------------------------------------------");
   }  
}
  
else if(payRate<0 || payRate >25)
{
   try {
       throw new PayrollException(" The Payrate Must Be Between 0 and 25 ");
   } catch (PayrollException e) {
       System.out.println("* payroll class failed to create ");
       System.out.println("---------------------------------------------");
   }  
}
  
else {
   this.name = name;
   this.idNumber = idNumber;
   this.payRate = payRate;
   this.hoursWorked = hoursWorked;
   count=1;
   System.out.println(" payroll created successfully ");
}
}

public void setName(String n)
{
name = n;
}

public void setIdNumber(int i)
{
idNumber = i;
}

public void setPayRate(double p)
{
payRate = p;
}

public void setHoursWorked(double h)
{
hoursWorked = h;
}

public String getName()
{
return name;
}

public int getIdNumber()
{
return idNumber;
}

public double getPayRate()
{
return payRate;
}

public double getHoursWorked()
{
return hoursWorked;
}

public double getGrossPay()
{
return hoursWorked * payRate;
}

@Override
public String toString() {
   return "payroll [name=" + name + ", idNumber=" + idNumber + ", payRate="
           + payRate + ", hoursWorked=" + hoursWorked + ", Gross Pay="
           + getGrossPay() + "]";
}

}  
