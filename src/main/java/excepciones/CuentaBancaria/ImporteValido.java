package excepciones.CuentaBancaria;

public class ImporteValido extends RuntimeException {
    public ImporteValido() {
        super("El importe es inválido");
    }
}
