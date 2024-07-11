package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter."
                + "\n1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        String choice = in.nextLine();
        switch (choice) {
            case "1":
                Cli.getName();
                break;
            case "2":
                Even.playEven();
                break;
            case "3":
                Calc.playCalc();
                break;
            case "4":
                GCD.playGCD();
                break;
            case "5":
                Progression.playProgression();
                break;
            case "6":
                Prime.playPrime();
                break;
            default:
                break;
        }
    }
}
