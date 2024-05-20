import Connection.APIClient;
import Model.Conversion;
import Model.Currencies;
import Model.DVO;

import java.util.Scanner;

import static Model.Currencies.*;

public class ExchangeRate {

    public static void main(String[] args) {
        DVO dvo = new DVO();
        Conversion conversion = new Conversion();
        Scanner scan = new Scanner(System.in);
        String[][] currencies = dvo.getCurrencies();
        int numRandomIndices = 10;
        int[] randomIndices = Currencies.generateRandomIndices(currencies.length, numRandomIndices);


        System.out.println("--Selecione la moneda que desea convertir\n--Ingresa 0 para salir\n--Ingresa 11 para nueva lista\n");
        showRandomCurrencies(currencies, randomIndices);
        int userInput = scan.nextInt();

        if (userInput == 0) {
            return;
        }

        switch (userInput) {
            case 1:
                handleChoiceBase(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 2:
                handleChoiceBase(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 3:
                handleChoiceBase(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 4:
                handleChoiceBase(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 5:
                handleChoiceBase(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 6:
                handleChoiceBase(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 7:
                handleChoiceBase(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 8:
                handleChoiceBase(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 9:
                handleChoiceBase(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 10:
                handleChoiceBase(dvo, currencies, randomIndices, userInput - 1);
                break;
            default:
                System.out.println("Opcion no valida");
        }

        System.out.println("\nSeleccione a que moneda desea convertirla\n");
        showRandomCurrencies(currencies, randomIndices);
        userInput = scan.nextInt();

        switch (userInput) {

            case 1:
                handleChoiceTarget(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 2:
                handleChoiceTarget(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 3:
                handleChoiceTarget(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 4:
                handleChoiceTarget(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 5:
                handleChoiceTarget(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 6:
                handleChoiceTarget(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 7:
                handleChoiceTarget(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 8:
                handleChoiceTarget(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 9:
                handleChoiceTarget(dvo, currencies, randomIndices, userInput - 1);
                break;
            case 10:
                handleChoiceTarget(dvo, currencies, randomIndices, userInput - 1);
                break;
            default:

                System.out.println("Opcion no valida");
        }

        System.out.println("\nIngrese el monto a convertir");
        dvo.setAmount(100000);
        //Connection

        APIClient.connection(dvo.getBase(), dvo.getTarget());
        conversion.amountExchanged(dvo.getRate(), dvo.getAmount());


    }


}
