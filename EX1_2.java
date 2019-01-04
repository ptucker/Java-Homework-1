import java.util.Scanner;                   // This is needed to process user input

public class EX1_2 {
	public static void main(String [] args) {
	Scanner userChoice = new Scanner(System.in);                                                    // Variable object for processing user input
	final double PI = 3.14;                                                                         // Final makes my variable PI a constant
	System.out.println("Please give me the radius of a circle: ");                                  // Prompt user for a circle radius
	double radius = userChoice.nextInt();                                                           // Hold that value in a double variable named radius 
	double area = radius * radius * PI;                                                             // Apply the equation for the area of a circle to calculate the area
	System.out.printf("The area of the circle with the radius that you inputted is %.2f\n", area);  // Send the calculated area to the screen
	}
}