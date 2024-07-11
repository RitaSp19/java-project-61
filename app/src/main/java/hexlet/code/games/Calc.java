package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void playCalc() {
        String condition = "What is the result of the expression?";

        char[] operators  = {'+', '-', '*'};
        for (int i = 0; i < Engine.attempts; i++) {
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
