package Model;

import Connection.APIClient;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MenuOptions {
    private static final SingletonDVO singletonDvo = SingletonDVO.obtenerInstancia();

    APIClient apiClient = new APIClient();
    Calculo calc = new Calculo();
    Currencies currency = new Currencies();
    Scanner scan = new Scanner(System.in);

    String[][] currencies = singletonDvo.getCurrencies();
    int numRandomIndices = 10;
    int[] randomIndices = currency.generateRandomIndices(currencies.length, numRandomIndices);
    int userInput;

    public void options() {
        try {
            //obten la moneda base
            System.out.println("\n--Seleccione la moneda que desea convertir.\n--Ingresa 0 para salir.\n");
            currency.showRandomCurrencies(currencies, randomIndices);
            System.out.println("\nPresione enter para continuar");


            userInput = scan.nextInt();
            Pattern pattern = Pattern.compile("^[0-9]+$");
            Matcher matcher = pattern.matcher(Integer.toString(userInput));

            if (matcher.matches()) {
                if (userInput == 0) {
                    exit();
                } else if (userInput >= 1 && userInput <= numRandomIndices) {
                    currency.handleChoiceBase(singletonDvo, currencies, randomIndices, userInput - 1);

                    //obten la moneda target
                    System.out.println("\nSeleccione a qué moneda desea convertirla\n");
                    currency.showRandomCurrencies(currencies, randomIndices);
                    System.out.println("\nPresione enter para continuar");
                    userInput = scan.nextInt();

                    if (matcher.matches() && userInput >= 1 && userInput <= numRandomIndices) {
                        currency.handleChoiceTarget(singletonDvo, currencies, randomIndices, userInput - 1);

                        //monto a convertir
                        System.out.println("\nIngrese el monto a convertir");
                        singletonDvo.setAmount(scan.nextDouble());

                        // Connection
                        apiClient.APIConnection(singletonDvo.getBase(), singletonDvo.getTarget());
                        singletonDvo.setFormatedRate(calc.numberFormat(singletonDvo.getRate()));
                        calc.calculate(singletonDvo.getAmount(), singletonDvo.getRate());
                        singletonDvo.setFormatedTotal(calc.numberFormat(singletonDvo.getTotal()));
                        System.out.println(singletonDvo.toString());

                        System.out.println("\n¿Desea continuar?\n");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        userInput = scan.nextInt();

                        if (userInput == 1) {
                            System.out.println("Generando nueva lista...");
                            this.randomIndices = currency.generateRandomIndices(currencies.length, numRandomIndices);
                            System.out.println("Nueva lista generada.");
                            options();
                        } else {
                            exit();
                        }
                    } else {
                        System.out.println("Opción no válida");
                        options();
                    }
                } else {
                    System.out.println("Opción no válida");
                    options();
                }
            } else {
                System.out.println("Opción no válida");
                options();
            }
        } catch (InputMismatchException e){
            System.out.println("Entrada no válida. Por favor, ingrese un número.");
            scan.nextLine();  // Clear the invalid input
            options();
        }
    }

    private void exit() {
        System.out.println("Usted ha salido del sistema.");
    }
}
