import java.util.Scanner;

class VersatileBookShop {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        double amount;

        System.out.print("What's the price of a Java book? ");
        amount = keyboard.nextDouble();
        amount = amount + 2.00;

        System.out.print("Your total with shipping is £");
        System.out.print(amount);
        System.out.println(" which will be charged to your credit card.");

        keyboard.close();
    }
}
