import java.util.Scanner;

public class problem_1 {

  
   public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter the string :");
           String str = in.nextLine();
           backwardString(str);
          
   }
   public static void backwardString(String str){
       System.out.println("Reverse String is :");
       for(int i=str.length()-1 ; i>=0; i--){
           System.out.print(str.charAt(i));
       }
   }
  

}
