package esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(esercizio2.Main.class);

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        logger.info("Insert the kilometers traveled");
        int km = myScanner.nextInt();
        logger.info("Insert the fuel consumed");
        int fuel = myScanner.nextInt();
        try {
            logger.info("Your consume is around " + km / fuel + " km/l");
        } catch (ArithmeticException exception) {
            logger.error("You cant insert 0 as a value for fuel!");
        }
    }
}
