
import java.util.Scanner;

public class Assignment_5_8
{

public static void main(String[] args)
{

int distance,choice;
double kilometers,inches,feet;
Scanner keyboard = new Scanner(System.in);

System.out.print("Enter a distance in meters: ");
distance = keyboard.nextInt();

do
{

menu();

System.out.print("Enter your choice: ");
choice = keyboard.nextInt();

switch(choice)
{

case 1:

showKilometers(distance);

break;

case 2:

showInches(distance);
break;


case 3:

showFeet(distance);
break;

case 4:

System.out.println("Bye!");
break;


default:

System.out.println("Error: Bad"+
" Input");
}
}while(choice!= 4);
}

public static void showKilometers(int distance)
{

double kilometers = (distance * 0.001);

System.out.println(distance + " meters is " +
kilometers + " kilometers.\n");
}

public static void showInches(int distance)
{

double inches = (distance * 39.37);

System.out.println(distance + " meters is " +
inches + " inches.\n");
}

public static void showFeet(int distance)
{

double feet = (distance * 3.281);

System.out.println(distance + "meters is " +
feet +" feet.\n");
}

public static void menu()
{

System.out.println("1. Convert to kilometers\n"+
"2. Convert to inches \n"+
"3. Convert to feet \n4.quit the program\n");
}
}
