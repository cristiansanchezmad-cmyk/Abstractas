package excepciones.CuentaBancaria;

public class LimiteDiario extends RuntimeException {
    public LimiteDiario()
    {
        super("Has superado la cantidad para retirar");
    }
}
