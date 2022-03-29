/**

* The program that will allow the user to play “Rock, Paper, Scissor” with the computer. 

*

* @author  Laura Duffley

* @version 1.0

* @since   2022-03-28

*/

// certain lines from https://junilearning.com/blog/coding-projects/rock-paper-scissors-java-project/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
		//initialize Scanner and display welcome
		Scanner in = new Scanner(System.in);		System.out.println("Welcome to the Rock, Paper, Scissors game!");

		//use while(true) loop and  break the loop only if user types "quit"
		while(true) {

			//get  user move from user input
			System.out.print("Please enter rock, paper, or scissors. To quit the game, type quit. ");
			String userMove = in.nextLine();

			//check if user wants to end game
			if(userMove.equals("quit")) {
				break;
			}

			//error check
			if(!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {

				System.out.println("Invalid entry.");

			} else {

				//generate random number between 0 and 3 and convert it to an integer meaning the possibilities are 0, 1, or 2
				int randomNumber = (int)(Math.random()*3);
	
				//convert the random number to string
				String generatedMove = "";
				if(randomNumber == 0) {
					generatedMove = "rock";
				} else if(randomNumber == 1) {
					generatedMove = "paper";
				} else {
					generatedMove = "scissors";
				}
				System.out.println("User move: " + generatedMove);
	
				//display outcome
				if(userMove.equals(generatedMove)) {
					System.out.println("It's a tie!");
				} else if((userMove.equals("rock") && generatedMove.equals("scissors")) || (userMove.equals("scissors") && generatedMove.equals("paper")) || (userMove.equals("paper") && generatedMove.equals("rock"))) {
					System.out.println("You won!");
				} else {
					System.out.println("You lost!");
				}

			}

		}

		//thank user for playing
		System.out.println("Thank you for playing!");

  }
}