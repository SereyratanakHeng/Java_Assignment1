import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        // Create object scanner     
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the purchase amount
        System.out.print("Enter your purchase amount: ");
        double purchase = input.nextDouble();

        // compute the tax  
        double tax = 0.1 * purchase;
        // total the price
        double total = tax + purchase;

        // display the result 
        System.out.println("The tax is " + String.format("%.2f", tax) + " and the total amount is " + String.format("%.2f", total));
        input.close();
    }
}
