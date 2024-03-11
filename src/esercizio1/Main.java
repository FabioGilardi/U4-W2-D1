package esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

//      INIZIALIZZAZIONE DELL'ARRAY DI NUMERI CASUALI
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            Random rndm = new Random();
            numbers[i] = rndm.nextInt(1, 10);
        }
        logger.info(Arrays.toString(numbers));

//      GESTIONE AZIONI UTENTE
        Scanner myScanner = new Scanner(System.in);
        int userNumber = -1;
        int numberPosition = -1;
        while (userNumber != 0) {
            logger.info("Declare a number between 1 and 10, press 0 if u want to close the programme");
            userNumber = Integer.parseInt(myScanner.nextLine());
            if (userNumber != 0) {
                if (userNumber >= 1 && userNumber <= 10) {
                    logger.info("Choose the position to insert the number (between 1 and 5)");
                    numberPosition = Integer.parseInt(myScanner.nextLine());
                    try {
                        numbers[numberPosition - 1] = userNumber;
                        logger.info(Arrays.toString(numbers));
                    } catch (ArrayIndexOutOfBoundsException e) {
                        logger.error("Error: " + e.getMessage());
                    }
                } else {
                    logger.error("You must choose a value between 1 and 10!");
                }
            } else {
                break;
            }
        }
    }
}
