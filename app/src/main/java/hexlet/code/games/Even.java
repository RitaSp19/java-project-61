package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String ANSWER_YES = "yes";
    private static final String ANSWER_NO = "no";

    public static void playEven() {
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] questions = new String[Engine.ATTEMPTS];
        String[] correctAnswers = new String[Engine.ATTEMPTS];

        for (int i = 0; i < Engine.ATTEMPTS; i++) {
            int number = (int) (Math.random() * MAX_RANDOM_NUMBER);
            String question = String.valueOf(number);
            String correctAnswer = (number % 2 == 0) ? ANSWER_YES : ANSWER_NO;
            questions[i] = question;
            correctAnswers[i] = correctAnswer;
        }
        Engine.engine(condition, questions, correctAnswers);
    }
}
