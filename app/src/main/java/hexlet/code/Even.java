package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void evenGame() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = in.nextLine();
        System.out.printf("Hello, %s!\n", name);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var attempts = 3;
        for (int i = 0; i < attempts; i++) {
            int number = (int) (Math.random() * 100);
            var isEven = (number % 2 == 0) ? "yes" : "no";
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = in.nextLine();
            if (!isEven.equals(answer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, isEven);
                System.out.printf("Let's try again, %s!\n", name);
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.printf("Congratulations, %s!\n", name);
        in.close();
    }
}
