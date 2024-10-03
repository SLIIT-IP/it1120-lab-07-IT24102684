import java.util.Scanner;
public class IT24102684Lab7Q3 {
    private static Object input;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int customer;
        for (customer = 1; customer <= 5; customer++ ) {
            System.out.println("\nCustomer " + customer);

            System.out.print("Enter total bill amount: ");
            double amount = input.nextInt();

            //Calculation
            double discount = amount * 0.05;
            double amountPaid = amount - discount;

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = input.next().charAt(0);

            switch (mode) {
                case 'C':
                case 'c':
                    System.out.print("Discount is : " + discount);
                    System.out.print("\nAmount to be paid: " + amountPaid + "\n");
                    break;

                case 'O':
                case 'o':
                    System.out.print("No discount applicable");
                    System.out.print("\nAmount to be paid: " + amount + "\n");
                    break;

                default:
                    System.out.print("Payment Mode is Not Valid \n");

            }

        }
        
    }
}