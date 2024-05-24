package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");
        int choice = in.nextInt();
        if (choice == 1) {
            Cli.getName();
        } else if (choice == 2) {
            Even.evenGame();
        }
    }
}
