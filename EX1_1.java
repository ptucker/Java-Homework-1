import java.util.Scanner;   // This is used to process input from the user
import java.util.Random;    // This gives me a random number generator


public class EX1_1 {
	public static void main(String [] args) {
	Scanner userChoice = new Scanner(System.in);                        // userChoice will be my variable object that will hold the user's choice of a number between 10 & 100
	System.out.println("Please pick a number between 10 and 100\n");    // Make the user choose a number between 10 & 100
	int holder = userChoice.nextInt();                                  // Hold that choice in a variable
	
	for (int i = 0; i < holder; i++) {                                  // Now that we know the user's choice, let's start a for loop to output that many numbers to the screen
    Random Rnumber = new Random();                                      // Rnumber will be my variable object for accessing the random number generation
    int number = Rnumber.nextInt(1000) + 1;                             // Use Rnumber's member variables to randomly generate a number between 1 and 1000 and save it in the int variable number
	if(number % 2 == 0) {                                               // If the number is even, tell the screen so
	System.out.printf("%d is an even number\n", number);
    } else {                                                            // Otherwise, tell the screen that it's odd
	System.out.printf("%d is an odd number\n", number);
    }
}
	userChoice.close();                                                 // Close the input variable
	}
}