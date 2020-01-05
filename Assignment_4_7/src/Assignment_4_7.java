import java.util.Scanner;
import java.text.*;


public class Assignment_4_7 {

    public static void main(String[] args) {
     int floors;
     int rooms = 0; 
     int roomsTaken = 0;
     int totalRoom = 0;
     double totalRoomsFilled = 0;
     double totalEmpty = 0;
     double occupancyRate = 0.0;


        Scanner keyboard= new Scanner(System.in);

            System.out.print("Enter the number of floors ");
        floors = keyboard.nextInt();

        while(floors < 1){
            System.out.print("Enter a number of floors greater than 0 ");
            floors = keyboard.nextInt();
        }


        for(int i=0; i<floors; i++){

            System.out.print("Enter the number of rooms (Floor " + (int)(i + 1) + ") ");
            rooms = keyboard.nextInt();


            while(rooms < 0){
                System.out.print("Enter a number of rooms more than 0 \n(Floor " +(int)(i + 1)+")");
                rooms = keyboard.nextInt();
            }


            System.out.print("Enter the number of rooms taken (Floor " +(int)(i + 1)+")");
            roomsTaken = keyboard.nextInt();

            totalRoom += rooms;

            totalRoomsFilled += roomsTaken;
        }

        totalEmpty = totalRoom - totalRoomsFilled; 

        occupancyRate = (totalRoomsFilled/totalRoom) * 100;

        NumberFormat df = DecimalFormat.getInstance();
          df.setMaximumFractionDigits(2);

        System.out.println("Total Rooms: " + totalRoom + "\nOccupied(QTY): " + totalRoomsFilled + 
          "\nVacant Rooms(QTY): " + totalEmpty + "\nOccupancy Rate: " + df.format(occupancyRate) + "%");
    }
}