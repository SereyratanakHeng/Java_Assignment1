import java.util.Scanner;

public class SecondToMinute {
    public static void main(String[] args) {
        // Create object scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user input
        System.out.print("Enter time in seconds: ");
        int inputSeconds = input.nextInt();

        // Calculate full minutes
        int minutes = inputSeconds / 60;
        // Calculate remaining seconds
        int remainingSeconds = inputSeconds % 60; 

        // Display
        System.out.println(inputSeconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
          
        input.close();
    }
}
