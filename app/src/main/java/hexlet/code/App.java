package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        System.out.print("Your choice: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                Cli.getName();
                break;
            case 2:
                Even.playEven();
                break;
            case 3:
                Calc.playCalc();
            default:
                break;
        }
    }
}
