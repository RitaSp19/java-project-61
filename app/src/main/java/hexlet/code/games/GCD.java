package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void playGCD() {
        String condition = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.attempts; i++) {
            int first = (int) (Math.random() * 99) + 1;
            int second = (int) (Math.random() *  99) + 1;
            int max = Math.max(first, second);
            int min = Math.min(first, second);
            while (min != 0) {
                int temp = min;
                min = max % min;
                max = temp;
            }
            Engine.questions[i] = first + " " + second;
            Engine.correctAnswers[i] = String.valueOf(max);
        }
        Engine.engine(condition);
    }
}
