
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shahbaz
 */
import java.util.Random;
import java.util.Scanner;     // importing libraries

public class RockPaperScissor {
    
   
        public static void main(String[] args) {
        
                                 boolean playAgain= true;
            
                                 do
                                 {
                                    startGame();
                                    System.out.println("do you want to play again? (y/n)");
                                    Scanner scan = new Scanner(System.in);
                                    String playMove=scan.next();
              
                                        if(playMove.equals("y")){
                                        playAgain=true;
                                } else 
                                        playAgain = false;
                                        System.exit(0);
                                 } while (playAgain == true);
           
                         }
        
         static void startGame(){
                
                 int tie =0;
                 int youwin =0;
                 int compwin=0;           // intialising variables
           
           
        System.out.println("How many rounds you want to play?");
        Scanner scanner = new Scanner(System.in);
        int rounds = Integer.parseInt(scanner.nextLine());              //asking user to enter number of rounds

         if(rounds>10){
                 System.out.println("You can't play this game");        // exiting game if rounds are more than 10
                 System.exit(0);
             }
         
        for (int i = 0; i < rounds; i++) {
           
            int result = playRockPaperScissors(scanner);
            if(result == 1){
                tie = tie +1;                               //counter to count each state
            }
            
            else if(result == 2){
                youwin = youwin + 1;
            }
            
            else if(result == 3){
                compwin = compwin + 1;
            }
            
        }
            System.out.println("match tie " + tie + "times");
            System.out.println("You won " + youwin + "times");
            System.out.println("Computer won" + compwin + "times"); // displaying on the last who won the game
         
                
            }

    static int playRockPaperScissors(Scanner scanner) {
        
        System.out.println("Type what you want to choose?");      // asking about user choice
        System.out.println("rock" );
        System.out.println("paper" );
        System.out.println("scissors");
        String playerMove = scanner.nextLine();

 
        Random random = new Random();
        int randomNumber = random.nextInt(3);                   //getting random move from computer
        String computerMove;
        
        if (randomNumber == 0) {
            computerMove = "rock";
        }
        else if (randomNumber == 1) {
            computerMove = "paper";
        }
        else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove );

        
        if (playerMove.equals(computerMove)) {
            System.out.println("Its a tie");
         return 1;                                          // using return for the counter
        
        } else if (winning(playerMove, computerMove)) {  // printing the results
            System.out.println("You won the round");
            return 2;
        
        } else {
            System.out.println("Computer wins");
            return 3;
          
        }
    }
     
    static boolean winning(String yourchoice, String compchoice) {
        if (yourchoice.equals("rock")) {
            return compchoice.equals("scissors");
        } else if (yourchoice.equals("paper")) {
            return compchoice.equals("rock");
        } else {
            return compchoice.equals("paper");
        }
    }
    
}


