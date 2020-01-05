
class problem_5
{
private int monthNumber;

public problem_5()
{
monthNumber = 1;
}

public problem_5(int month_num)
{
if(month_num < 1 || month_num > 12) monthNumber = 1;
else monthNumber = month_num;
}

public problem_5(String month_name)
{
if(month_name.equalsIgnoreCase("January")) monthNumber = 1;
else if(month_name.equalsIgnoreCase("February")) monthNumber = 2;
else if(month_name.equalsIgnoreCase("March")) monthNumber = 3;
else if(month_name.equalsIgnoreCase("April")) monthNumber = 4;
else if(month_name.equalsIgnoreCase("May")) monthNumber = 5;
else if(month_name.equalsIgnoreCase("June")) monthNumber = 6;
else if(month_name.equalsIgnoreCase("July")) monthNumber = 7;
else if(month_name.equalsIgnoreCase("August")) monthNumber = 8;
else if(month_name.equalsIgnoreCase("September")) monthNumber = 9;
else if(month_name.equalsIgnoreCase("October")) monthNumber = 10;
else if(month_name.equalsIgnoreCase("November")) monthNumber = 11;
else if(month_name.equalsIgnoreCase("December")) monthNumber = 12;
}
public void setMonthNumber(int month_num)
{
if(month_num < 1 || month_num > 12) monthNumber = 1;
else monthNumber = month_num;
}
public int getmonthNumber()
{
return monthNumber;
}
public String getMonthName()
{
if(monthNumber==1) return "January";
else if(monthNumber==2) return "February";
else if(monthNumber==3) return "March";
else if(monthNumber==4) return "April";
else if(monthNumber==5) return "May";
else if(monthNumber==6) return "June";
else if(monthNumber==7) return "July";
else if(monthNumber==8) return "August";
else if(monthNumber==9) return "September";
else if(monthNumber==10) return "October";
else if(monthNumber==11) return "November";
else if(monthNumber==12) return "December";
return "January";
}
public String toString()
{
return getMonthName();
}
public boolean equals(problem_5 M)
{
return monthNumber==M.monthNumber;
}
public boolean greaterThan(problem_5 M)
{
return monthNumber>M.monthNumber;
}
public boolean lessThan(problem_5 M)
{
return monthNumber<M.monthNumber;
}
public static void main(String[] args)
{
problem_5 m1 = new problem_5(7);
problem_5 m2 = new problem_5(12);
System.out.println("Month m1 name is " + m1);
System.out.println("Month m2 name is " + m2);
System.out.println("is m1 equal to m2 ? " + m1.equals(m2));
}
}