package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void playEven() {
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.attempts; i++) {
            int number = (int) (Math.random() * 100);
            String question = String.valueOf(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            Engine.questions[i] = question;
            Engine.correctAnswers[i] = correctAnswer;
        }
        Engine.engine(condition);
    }
}
