package esercizio_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Banca {

    private static Logger logger = LoggerFactory.getLogger(esercizio_3.Banca.class);

    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 1500.0);

        System.out.println("Saldo conto: " + conto1.restituisciSaldo());

        try {
            conto1.preleva(1750.50);
            System.out.println("Saldo conto: " + conto1.restituisciSaldo());
        } catch (BancaException e) {
            logger.error("Errore durante il prelievo: " + e.getMessage());
            e.printStackTrace();
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
        conto2.stampaSaldo();

        try {
            conto2.preleva(2000);
            conto2.stampaSaldo();
        } catch (BancaException e) {
            logger.error("Errore durante il prelievo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
