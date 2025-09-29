package movieticketbookingsystem;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Inception", "Sci-fi", 148);
        Movie m2 = new Movie("Avengers", "Action", 143);

        List<ShowTime> showTimes = new ArrayList<>();
        showTimes.add(new ShowTime(m1, LocalDateTime.of(2025, 9, 30, 18, 0), 50));
        showTimes.add(new ShowTime(m2, LocalDateTime.of(2025, 9, 30, 21, 0), 40));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        User user = new User(scanner.nextLine());

        ShowTime selectedShow = SelectShow.selectShow(showTimes, scanner);
        if (selectedShow == null) {
            System.out.println("Invalid show selection.");
            scanner.close();
            return;
        }

        int seatsToBook = SelectNoOfSeats.selectSeats(selectedShow, scanner);
        if (seatsToBook == 0) {
            System.out.println("Invalid seat number.");
            scanner.close();
            return;
        }
