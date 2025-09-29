package movieticketbookingsystem;

import java.util.List;
import java.util.Scanner;

public class SelectShow {
    public static ShowTime selectShow(List<ShowTime> showTimes, Scanner scanner) {
        System.out.println("Available shows:");
        for (int i = 0; i < showTimes.size(); i++) {
            System.out.println((i + 1) + ". " + showTimes.get(i));
        }
        System.out.print("Select show number: ");
        int choice = scanner.nextInt() - 1;
        if (choice >= 0 && choice < showTimes.size()) {
            return showTimes.get(choice);
        }
        return null;
    }
}
