package excepciones.CuentaBancaria;

public class DepositoMaximo extends RuntimeException {
    public DepositoMaximo()
    {
        super("Has superado la cantidad a ingresada");
    }
}
