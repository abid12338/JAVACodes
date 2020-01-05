package midterm;


public class problem_number_five {

	//new method if locker open = yes (open)
	public static boolean lockerOpen(String l) {
		return l == "OPEN";
	}
	
	//new method if locker open = no (closed)
	public static void lockerClosed(String[] locker) {
		for (int i = 0; i < locker.length; i++) {
			locker[i] = "CLOSED";
		}
	}
	
	//new method for changing of locker
	public static void lockerChange(String[] locker) {
		int go = 0;

		for (int s = 1; s <= locker.length; s++) {
			for (int l = 0; l < locker.length; l += s) {
				if (lockerOpen(locker[l]))
					locker[l] = "CLOSED";
				else
					locker[l] = "OPEN";
			}
			go++;
		}
	}
	
	public static void main(String[] args) {
		String[] locker = new String[100];

		lockerClosed(locker);

		lockerChange(locker);
		
		print(locker);
	}

	public static void print(String[] locker) {
		for (int i = 0; i < locker.length; i++) {
			if (lockerOpen(locker[i])) {
				System.out.print("\n Locker " + (i + 1) + " is open");
			}
		}
		System.out.println();
	}
}
