package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void playPrime() {
        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < Engine.attempts; i++) {
            int number = (int) (Math.random() * 99) + 1;
            String answer = "yes";
            if (number <= 1) {
                answer = "no";
            } else {
                for (int j = 2; j <= Math.sqrt(number); j++) {
                    if (number % j == 0) {
                        answer = "no";
                        break;
                    }
                }
            }
            Engine.questions[i] = String.valueOf(number);
            Engine.correctAnswers[i] = answer;
        }
        Engine.engine(condition);
    }
}
