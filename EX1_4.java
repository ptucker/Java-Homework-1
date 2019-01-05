import java.util.Scanner;                  // Used for user input

public class EX1_4 {
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please give me your weight in pounds: ");       // Prompt user for their weight
	double weightHolder = input.nextDouble();                           // Hold it as a double variable
	System.out.println("Okay, now give me your height in inches: ");    // Prompt user for their height
	double heightHolder = input.nextDouble();                           // Hold it as a double variable
	weightHolder *= .455;                                               // Convert the weight to kilograms
	heightHolder *= .0254;                                              // Convert the height to meters
	double BMI = weightHolder / (heightHolder * heightHolder);          // Use the BMI equation to calculate this person's Body-Mass Index
	System.out.printf("Your Body Mass Index is %.2f", BMI);             // Round it to the 2nd decimal place and print it to the console
	}

}