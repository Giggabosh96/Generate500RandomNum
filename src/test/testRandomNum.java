package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class testRandomNum {

	 public static void main(String[] args) {
		 guessingNumberGame();
	 }
	 
	 public static void guessingNumberGame(){
	     
			Scanner sc = new Scanner(System.in);

			Random rand = new Random();
			int number = rand.nextInt(500);

		     int K = 5; // Number of Trials
		     int i, guess;

		     System.out.println("A number is chosen between 1 to 500. Guess the number within 5 trials.");

		     for (i = 1; i < K; i++) {

		         System.out.println("Guess the number:");
		         guess = sc.nextInt();

		         if (number == guess) {
		             System.out.println("Congratulations!" + " You guessed the number.");
		             break;
		         }
		         else if (number > guess
		                  && i != K - 1) {
		             System.out.println("The number is "+ "greater than " + guess);
		         }
		         else if (number < guess
		                  && i != K - 1) {
		             System.out.println("The number is" + " less than " + guess);
		         }
		     }

		     if (i == K) {
		         System.out.println("You have exhausted " + K + " trials.");
		         System.out.println("The number was " + number);
		     	}
			}
 }
