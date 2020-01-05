import java.util.Random;

import java.util.Scanner;

class problem_12 {
	
   private static String sideUp;
   
   public problem_12() {
	   
       this.sideUp = "Heads";
       toss();  }
  
   public static int toss() {
       Random rand = new Random();
       
       int value = rand.nextInt(2);
       if (value == 0) {
           sideUp = "Heads";
       } else {
           sideUp = "Tails";
       }
       return value;
   }
  
   public static String getSideUp() {
       return sideUp;
   }
   public static void main(String args[]){
       Scanner keyboard = new Scanner(System.in);
   
       Player player1 = new Player();
       Player player2 = new Player();
       while(true){
           System.out.print("Player 1, enter 1 for tails or 0 for heads: ");
           
           int guess = keyboard.nextInt();
           
           if(guess == toss()){
        	   
               player1.increaseScore();
               
               System.out.println("Good guess, it was " + problem_12.getSideUp());
               
               System.out.println("Player 1 score: " + player1.getScore());
               
           }
           else{
               player1.decreaseScore();
               
               System.out.println("Bad guess, it was " + problem_12.getSideUp());
               
               System.out.println("Player 1 score: " + player1.getScore());
               
           }

         
           System.out.print("Player 2, enter 1 for tails or 0 for heads: ");
           guess = keyboard.nextInt();
           
           if(guess == toss()){
               player2.increaseScore();
               System.out.println("Good guess, it was " + problem_12.getSideUp());
               
               System.out.println("Player 2 score: " + player2.getScore());
           }
           else{
               player2.decreaseScore();
               System.out.println("Bad guess, it was " + problem_12.getSideUp());
               
               System.out.println("Player 2 score: " + player2.getScore());
           }
          
         
           if(player1.getScore() == 5){
               System.out.println();
               
               System.out.println("Player 1 wins");
               
               break;
           }
           else if(player2.getScore() == 5){
               System.out.println();
               System.out.println("Player 2 wins");
               break;
           }
       }
   }
}


 class Player {
	 
   int playerScore;
   
   Player(){
	   
       playerScore = 0;
   }
   int getScore(){
       return playerScore;
   }
   void increaseScore(){
	   
       playerScore++;
       
   }
   void decreaseScore(){
       playerScore--;
   }
}
