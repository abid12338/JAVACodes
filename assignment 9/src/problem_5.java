import java.util.Scanner;


public class problem_5 {

  
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       while(true){
       System.out.print("Please enter the password: ");
       String password = scan.next();
       boolean status = validatePassword(password);
       if(status == true){
           System.out.println("Valid Password");
           break;
       }
       else{
       System.out.println("Invalid Password.. Try Again..");  
       }
       }
   }
   public static boolean validatePassword(String pass){
       int upperCount = 0;
       int lowerCount = 0;
       int digitCount = 0;
       if(pass.length() >= 6){
           for(int i=0; i<pass.length(); i++){
               if(Character.isUpperCase(pass.charAt(i))){
                   upperCount++;
               }
               else if(Character.isLowerCase(pass.charAt(i))){
                   lowerCount++;
               }
               else if(Character.isDigit(pass.charAt(i))){
                   digitCount++;
               }
           }
           if(upperCount > 0 && lowerCount >0 && digitCount >0){
               return true;
           }
           else{
               return false;
           }
              
       }
       else{
           return false;
       }
      
   }

}
