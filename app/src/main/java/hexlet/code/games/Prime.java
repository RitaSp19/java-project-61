package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String ANSWER_YES = "yes";
    private static final String ANSWER_NO = "no";

    public static void playPrime() {
        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < Engine.attempts; i++) {
            int number = (int) (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1)) + MIN_NUMBER;
            String answer = ANSWER_YES;
            if (number <= 1) {
                answer = ANSWER_NO;
            } else {
                for (int j = 2; j <= Math.sqrt(number); j++) {
                    if (number % j == 0) {
                        answer = ANSWER_NO;
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
