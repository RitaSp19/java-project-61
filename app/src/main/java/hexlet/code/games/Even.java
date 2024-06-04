package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void playEven() {
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var attempts = 3;
        String[] questions = new String[attempts];
        String[] correctAnswers = new String[attempts];
        for (int i = 0; i < attempts; i++) {
            int number = (int) (Math.random() * 100);
            String question = String.valueOf(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            questions[i] = question;
            correctAnswers[i] = correctAnswer;
        }
        Engine.engine(condition, questions, correctAnswers);
    }
}
