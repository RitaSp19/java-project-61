package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void playProgression() {
    String condition = "What number is missing in the progression?";
    var attempts = 3;
    String[] questions = new String[attempts];
    String[] correctAnswers = new String[attempts];
    for (int i = 0; i < attempts; i++) {
        int length = (int) (Math.random() * 9) + 5;
        int position = (int) (Math.random() * length);
        int first = (int) (Math.random() * 9) + 1;
        int difference = (int) (Math.random() * 9) + 1;
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
        questions[i] = question;
        correctAnswers[i] = answer;
    }
    Engine.engine(condition, questions, correctAnswers);
    }
}
