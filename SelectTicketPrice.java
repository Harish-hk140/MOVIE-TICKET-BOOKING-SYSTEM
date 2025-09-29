package movieticketbookingsystem;

import java.util.Scanner;

public class SelectTicketPrice {
    public static int selectTicketPrice(Scanner scanner) {
        System.out.println("Select Ticket Type:");
        System.out.println("1. Silver - $60");
        System.out.println("2. Platinum - $180");
        System.out.println("3. Diamond - $500");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                return 60;
            case 2:
                return 180;
            case 3:
                return 500;
            default:
                System.out.println("Invalid choice, defaulting to Silver.");
                return 60;
        }
    }
}
