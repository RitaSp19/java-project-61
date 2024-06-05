package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void playGCD() {
        String condition = "Find the greatest common divisor of given numbers.";
        var attempts = 3;
        String[] questions = new String[attempts];
        String[] correctAnswers = new String[attempts];
        for (int i = 0; i < attempts; i++) {
            int first = (int) (Math.random() * 99) + 1;
            int second = (int) (Math.random() *  99) + 1;
            int max = Math.max(first, second);
            int min = Math.min(first, second);
            while (min != 0) {
                int temp = min;
                min = max % min;
                max = temp;
            }
            questions[i] = first + " " + second;
            correctAnswers[i] = String.valueOf(max);
        }
        Engine.engine(condition, questions, correctAnswers);
    }
}
