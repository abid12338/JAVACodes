public class assignment_1
{ 
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	
	public assignment_1(String aName, int anIDNumber, String aDepartment,String aPosition)
	{
		name = aName;
		idNumber = anIDNumber;
		department = aDepartment;
		position = aPosition; 
		
	}
	public assignment_1 (String aName, int anIDNumber)
	{
		name = aName;
		idNumber = anIDNumber;
		department = "";
		position = "";
	}
	public assignment_1()
	{
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	public void setName(String aName)
	{
		name = aName;
	}
	public void setIDNumber(int anIDNumber)
	{
		idNumber = anIDNumber;
		
	}
	public void setDepartment(String aDepartment)
	{
		department = aDepartment;
		
	}
	public void setPosition(String aPosition)
	{
		position = aPosition;
	}
	public String getName()
	{
		return name;
	}
	public int getIDNumber()
	{
		return idNumber;
	}
	public String getDepartment() 
	{
		return department;
	}
	public String getPosition()
	{
		return position;
	}
	
	
}