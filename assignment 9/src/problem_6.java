import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        //data
        String name[] = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
        String phone[] = {"555-2234", "555-9098", "555-1785", "555-9224"};
        String input;
        int i;
        boolean found = false;
        Scanner in = new Scanner(System.in);
        //Read input from user
        System.out.print("enter a name or the first few characters of a name: ");
        input = in.next();
        //Go through each name
        for (i = 0; i < name.length; i++) {
            //convert name to lower case
            String currentName = name[i].toLowerCase();
            //Split based on ,
            String[] currentNameSplits = currentName.split(",");
            //name matches
            if (currentName.equals(input.toLowerCase()) ||
                    currentNameSplits[0].contains(input.toLowerCase()) ||
                    currentNameSplits[1].contains(input.toLowerCase())) {
                System.out.println(name[i] + ": " + phone[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println(input + " not found in the phone list");
        }
    }
}
