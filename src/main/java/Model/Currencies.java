package Model;


import java.util.Random;

public class Currencies {
    static DVO dvo = new DVO();

    public static int[] generateRandomIndices(int arrayLength, int numIndices) {
        Random random = new Random();
        int[] indices = new int[numIndices];
        boolean[] used = new boolean[arrayLength];

        for (int i = 0; i < numIndices; i++) {
            int randomIndex;
            do {
                randomIndex = random.nextInt(arrayLength);
            } while (used[randomIndex]);
            indices[i] = randomIndex;
            used[randomIndex] = true;
        }

        return indices;
    }

    public static void showRandomCurrencies(String[][] currencies, int[] randomIndices) {
        int i = 1;
        for (int index : randomIndices) {
            System.out.println(i + ". " + dvo.getCurrencies()[index][0] + " - " + dvo.getCurrencies()[index][1]);
            i++;
        }
    }

    public static void handleChoiceBase(DVO dvo, String[][] currencies, int[] randomIndices, int index) {
        int chosenIndex = randomIndices[index];
        dvo.setBase(currencies[chosenIndex][0]);
    }

    public static void handleChoiceTarget(DVO dvo, String[][] currencies, int[] randomIndices, int index) {
        int chosenIndex = randomIndices[index];
        dvo.setTarget(currencies[chosenIndex][0]);
    }

}
