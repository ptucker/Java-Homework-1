import java.util.Scanner;                                   // Needed for user input

public class EX1_3 {
	public static void main(String [] args) {
    int finalAnswer = 0;                                    // variable to hold the final converted integer value
    int placeHolder = 1;                                    // variable I will use to move the place of the final answer from the tens to the hundreds, etc.
	Scanner userChoice = new Scanner(System.in);            // User input object variable
	System.out.println("Please choose a random number: ");  // Prompt the user for a random number
    String str = userChoice.next();                         // Save the user's number choice in a string object variable
    
    // Let's use a try/catch block to filter out all of the erroneous user inputs
    try {
        Integer.parseInt(str);                              // Use the integer member variable parseInt to make sure that the user inputted string is an integer
        /*
        Now that we know that the user inputted an integer, let's start the process of converting it from a string to an int
        We start by peeling off each char one by one, starting from the ones position and moving to the tens, etc
        We'll use a for loop to run this operation. 
        */
        for(int i = str.length() - 1; i > -1; i--) {                // Bascially, let's run this loop 1 time for each digit of the number   
            finalAnswer += (str.charAt(i) - '0') * placeHolder;     // With each iteration, add this digit to our final answer variable in the right place
            placeHolder *= 10;                                      // Iterate the place holder variable so that the next iteration of this loop will place the number in the right spot
        }
        System.out.printf("The newly converting integer is %d", finalAnswer); // Test this algorithm by printing this newly converted number to the screen
    }

    catch (NumberFormatException e) {               // Oops, the user inputted something other than an integer
	
	    System.out.println("Oops, you didn't input a number!\n");  // Tell them the bad news
    }

    } 

}