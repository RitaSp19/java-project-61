package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n0 - Exit");
        int choice = in.nextInt();
        System.out.println("Your choice: " + choice);
        if (choice == 1) {
            Cli.getName();
        }
    }
}
