package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void engine(String condition, String[] questions, String[] correctAnswers) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = in.nextLine();
        System.out.printf("Hello, %s!\n", name);
        System.out.println(condition);
        var attempts = questions.length;
        for (int i = 0; i < attempts; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String answer = in.nextLine();
            if (!correctAnswers[i].equals(answer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswers[i]);
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
