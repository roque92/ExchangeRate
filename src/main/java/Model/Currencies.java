package Model;


import java.util.Random;

public class Currencies {
    SingletonDVO singletonDvo = SingletonDVO.obtenerInstancia();

    public int[] generateRandomIndices(int arrayLength, int numIndices) {
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

    public void showRandomCurrencies(String[][] currencies, int[] randomIndices) {
        int i = 1;
        for (int index : randomIndices) {
            System.out.println(i + ". " + singletonDvo.getCurrencies()[index][0] + " - " + singletonDvo.getCurrencies()[index][1]);
            i++;
        }
    }

    public void handleChoiceBase(SingletonDVO singletonDvo, String[][] currencies, int[] randomIndices, int index) {
        int chosenIndex = randomIndices[index];
        singletonDvo.setBase(currencies[chosenIndex][0]);
        singletonDvo.setBaseName(currencies[chosenIndex][1]);
    }

    public void handleChoiceTarget(SingletonDVO singletonDvo, String[][] currencies, int[] randomIndices, int index) {
        int chosenIndex = randomIndices[index];
        singletonDvo.setTarget(currencies[chosenIndex][0]);
        singletonDvo.setTargetName(currencies[chosenIndex][1]);
    }

}
