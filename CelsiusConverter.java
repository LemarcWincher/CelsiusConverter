// TIP: To run the code, press the Run button or use the keyboard shortcut (usually Shift+F10).

/**
 * Celsius To Fahrenheit Converter.
 *
 * @author Lemarc Wincher
 * @version 1.0
 * @since 2025-09-02
 */



import java.util.Scanner; // Introduces scanner to read user input via keyboard

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner; // Introduces scanner to read user input via keyboard

public class CelsiusConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Assigns scanner to begin reading user input

        System.out.println("Hello! Welcome to the Celsius To Fahrenheit Converter");
        System.out.println("This project is designed to convert your inputted temperature in Celsius and convert it into Fahrenheit!");
        System.out.println("Press enter to continue...");
        input.nextLine(); // Waits for the user to press continue

        String runAgain; // Variable to store whether user wants to convert again

        do { // Outer loop allows multiple conversions
            String confirm; // Creates the string to hold user input that confirms input is correct
            double userCelsius = 0; // Declares variable prior to inner loop

            do { // Inner loop ensures user confirms input
                System.out.print("Please enter the temperature in Celsius that you wish to convert: ");
                userCelsius = input.nextDouble(); // Stores user input into the variable
                input.nextLine(); // Consumes leftover newline

                System.out.println("You entered: " + userCelsius + "°C");
                System.out.print("Is this correct? (Y/N): ");
                confirm = input.nextLine().trim().toUpperCase(); // Ensures user input is capitalized and flows properly into while loop
            } while (!confirm.equals("Y")); //Ensures user has to type capital Y, asks until they confirm yes

            System.out.println();
            System.out.println("Great! Converting " + userCelsius + "°C to Fahrenheit...");
            System.out.println(); //Blank line for formatting
            double fahrenheitTemperature = convertToFahrenheit(userCelsius); // Stores the conversion result
            System.out.println(userCelsius + "°C is equal to " + fahrenheitTemperature + "°F!"); // Prints the output

            // Ask user if they want to convert another temperature
            System.out.print("Do you want to convert another temperature? (Y/N) "); // Added space for cleaner input
            runAgain = input.nextLine().trim().toUpperCase();

        } while (runAgain.equals("Y")); // Repeat outer loop if user enters Y

        System.out.println("Thanks for using my converter! Goodbye!");
        input.close(); // Closes scanner
    }

    // Celsius Conversion Method
    public static double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; //Formula for Celsius to Fahrenheit conversion
    }
}
