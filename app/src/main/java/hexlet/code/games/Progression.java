package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH_INCREMENT = 9;
    private static final int MIN_INITIAL_NUMBER = 1;
    private static final int MAX_INITIAL_NUMBER = 9;

    public static void playProgression() {
        String condition = "What number is missing in the progression?";

        for (int i = 0; i < Engine.attempts; i++) {
            int length = (int) (Math.random() * MAX_PROGRESSION_LENGTH_INCREMENT) + MIN_PROGRESSION_LENGTH;
            int position = (int) (Math.random() * length);
            int first = (int) (Math.random() * (MAX_INITIAL_NUMBER - MIN_INITIAL_NUMBER + 1)) + MIN_INITIAL_NUMBER;
            int difference = (int) (Math.random() * (MAX_INITIAL_NUMBER - MIN_INITIAL_NUMBER + 1)) + MIN_INITIAL_NUMBER;
            int[] progression = new int[length];
            progression[0] = first;
            for (int j = 1; j < length; j++) {
                progression[j] = progression[j - 1] + difference;
            }
            String answer = String.valueOf(progression[position]);
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < progression.length; j++) {
                if (j == position) {
                    stringBuilder.append("..");
                } else {
                    stringBuilder.append(progression[j]);
                }
                if (j < progression.length - 1) {
                    stringBuilder.append(" ");
                }
            }
            String question = stringBuilder.toString();
            Engine.questions[i] = question;
            Engine.correctAnswers[i] = answer;
        }
        Engine.engine(condition);
    }
}
