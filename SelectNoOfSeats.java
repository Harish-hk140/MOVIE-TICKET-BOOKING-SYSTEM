package movieticketbookingsystem;

import java.util.Scanner;

public class SelectNoOfSeats {
    public static int selectSeats(ShowTime showTime, Scanner scanner) {
        System.out.println("Seats available: " + showTime.getSeatsAvailable());
        System.out.print("Enter number of seats to book: ");
        int seats = scanner.nextInt();
        if (seats > 0 && seats <= showTime.getSeatsAvailable()) {
            return seats;
        }
        return 0;
    }
}
