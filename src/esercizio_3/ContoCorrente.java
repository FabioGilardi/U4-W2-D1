package esercizio_3;

public class ContoCorrente {

    final int maxMovimenti = 50;

    //    ATTRIBUTES
    String titolare;
    int nMovimenti;
    double saldo;

    //    CONSTRUCTOR
    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
    }

    //    METHODS
    void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti)
            saldo = saldo - x;
        else
            saldo = saldo - x - 0.50;
        if (saldo < 0) {
            throw new BancaException("Il conto è in rosso");
        }
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }
}
