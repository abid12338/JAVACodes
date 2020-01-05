
public class EmployeeTest {

	public static void main(String[] args) {
		assignment_1 empObj1 = new assignment_1("Susan Meyers" ,47899, "accounting", "vice president ");

		assignment_1 empObj2 = new assignment_1 ("mark jones",39119);
		
		empObj2.setDepartment("IT");
		empObj2.setPosition("programmer");
		
		assignment_1 empObj3 = new assignment_1();
		
		empObj3.setName("Joy rogers ");
		empObj3.setIDNumber(81774);
		empObj3.setDepartment("manufacturing");
		empObj3.setPosition("engineer");
		
		System.out.println("---------------------" + "------------------");
		System.out.printf("%-15s%-12s%-15s%-15s\n", "Name", "ID Number", "department", "position" );
		System.out.println("--------------------" +"------------------");
		
		
		System.out.printf("%-15s%-12s%-15s%-15s\n",
				empObj1.getName(),empObj1.getIDNumber(),
		        empObj1.getDepartment(),
		        empObj1.getPosition());
		System.out.printf("%-15s%-12d%-15s%-15s\n",
				empObj2.getName(),empObj2.getIDNumber(),
                empObj2.getDepartment(),
                empObj2.getPosition());
		System.out.printf("%-15s%-12d%-15s%-15s\n",
				empObj3.getName(),empObj3.getIDNumber(),
				empObj3.getDepartment(),
				empObj3.getPosition());
		System.out.println("-------------------" + "------------------");
		
		
		
		
	}

}
