import java.util.Scanner;

public class FahToCel {
    public static void main(String[] args) {
        // Create object scanner
        Scanner input = new Scanner(System.in);
        
        // prompt the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // compute celsius to fahrenheit
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);

        // display the result
        System.out.println(fahrenheit + " Fahrenheit is " + String.format("%.2f", celsius) + " Celsuis.");
        input.close();   
    }
}
    
