package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void playCalc() {
        String condition = "What is the result of the expression?";
        var attempts = 3;
        String[] questions = new String[attempts];
        String[] correctAnswers = new String[attempts];
        char[] operators  = {'+', '-', '*'};
        for (int i = 0; i < attempts; i++) {
            int first = (int) (Math.random() * 100);
            int second = (int) (Math.random() * 100);
            int operatorPosition = (int) (Math.random() * 3);
            char operator = operators[operatorPosition];
            String question = first + " " + operator + " " + second;
            int numAnswer = first;
            switch (operator) {
                case '+':
                    numAnswer += second;
                    break;
                case '-':
                    numAnswer -= second;
                    break;
                case '*':
                    numAnswer *= second;
                    break;
            }
            String correctAnswer = String.valueOf(numAnswer);
            questions[i] = question;
            correctAnswers[i] = correctAnswer;
        }
        Engine.engine(condition, questions, correctAnswers);
    }
}
