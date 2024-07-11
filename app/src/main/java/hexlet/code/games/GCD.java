package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void playGCD() {
        String condition = "Find the greatest common divisor of given numbers.";
        String[] questions = new String[Engine.ATTEMPTS];
        String[] correctAnswers = new String[Engine.ATTEMPTS];
        for (int i = 0; i < Engine.ATTEMPTS; i++) {
            int first = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER)) + MIN_NUMBER;
            int second = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER)) + MIN_NUMBER;
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
