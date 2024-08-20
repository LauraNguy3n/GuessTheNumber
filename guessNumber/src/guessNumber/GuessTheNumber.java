package guessNumber;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Type your guess: ");
		Random random = new Random();
		int random_number = random.nextInt(101); 
		int attempts = 0;
		boolean won = false; 
		int guess;
		//int a = sc.nextInt();
		
		while(!won){
			System.out.println("Enter your guess number: ");
			 guess = sc.nextInt();                        
			attempts++;
		
		if(guess <1 || guess>100) {// for checking the range
			System.out.println("Enter the numbers from 1-100  ");
			continue;
		}
		 if(guess < random_number) {
			System.out.println("Your guess is too low, guess another");
		}
		else if(guess > random_number) {
			System.out.println("Your guess is too high, guess another");
			
		}
		else {
			won = true;
			System.out.println("Congrats! You guessed the number! :D \n Total Attempts:" + attempts);	
			}
	
		}
		sc.close();
	}
}
		/*
		1. use a random library(random library can guess a number from a range)
		2. we will ask user to input the guessing (Scanner function)

		3. conditions:
			3.1 if the user guess is higher than the computer guess, display message 'your guess is high, please guess another')
			3.2 if user guess is lower than the computer guess. message ' your guess is low, try to guess another')
			
		4. if number matches, then print congratulations message and also show the number of attempts
		*/