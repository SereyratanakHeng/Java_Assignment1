import java.util.Scanner;

public class FinancialApp {
    public static void main(String[] args) {
        // Create object scanner
        Scanner input = new Scanner(System.in);
        // Prompt the user for the input
        System.out.print("Enter the monthly saving amount: ");
        double amount = input.nextDouble();

        // compute the saving amount
        double firstmonth = amount * (1 + 0.003125);
        double secondmonth = (amount + firstmonth) * (1 + 0.003125);
        double thirdmonth = (amount + secondmonth) * (1 + 0.003125);
        double fourthmonth = (amount + thirdmonth) * (1 + 0.003125);
        double fifthmonth = (amount + fourthmonth) * (1 + 0.003125);
        double sixthmonth = (amount + fifthmonth) * (1 + 0.003125);

        // display the result
        System.out.println("After the first month, the account value is " +  firstmonth);
        System.out.println("After the second month, the account value is " +  secondmonth);
        System.out.println("After the third month, the account value is " +  thirdmonth);
        System.out.println("After the fourth month, the account value is " +  fourthmonth);
        System.out.println("After the fifth month, the account value is " +  fifthmonth);
        System.out.println("After the sixth month, the account value is " +  sixthmonth);
        input.close();
    }
}