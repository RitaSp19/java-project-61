package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    private static final int MAX_RANDOM_NUMBER = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void playCalc() {
        String condition = "What is the result of the expression?";


        for (int i = 0; i < Engine.ATTEMPTS; i++) {
            int first = (int) (Math.random() * MAX_RANDOM_NUMBER);
            int second = (int) (Math.random() * MAX_RANDOM_NUMBER);
            int operatorPosition = (int) (Math.random() * OPERATORS.length);
            char operator = OPERATORS[operatorPosition];
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
                default:
                    break;
            }
            String correctAnswer = String.valueOf(numAnswer);
            Engine.questions[i] = question;
            Engine.correctAnswers[i] = correctAnswer;
        }
        Engine.engine(condition);
    }
}
