package excepciones.CuentaBancaria;

public class SaldoInsufiente extends RuntimeException {

    public SaldoInsufiente() {

        super("Estas intentando reitrar mas de lo que tienes");
    }
}
