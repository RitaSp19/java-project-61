package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void getName() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        String name = in.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
