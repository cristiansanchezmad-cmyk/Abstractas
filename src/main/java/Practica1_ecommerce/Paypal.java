package Practica1_ecommerce;
/**
 * Implementa el método de pago PayPal con validación de correo y control de saldo.
 * * @author Christian Sanchez Madueño
 * @version 1.0 (15/02/2026)
 */
public class Paypal extends Metodo_pago {

    private String cuenta;
    private double saldo;
    /**
     * Constructor que inicializa la cuenta de PayPal.
     * @param cuenta Dirección de correo electrónico asociada.
     */
    public Paypal(String cuenta){

        this.cuenta=cuenta;
        this.saldo=23;

    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Valida si el formato del correo electrónico es correcto (.com).
     * @param cuenta El string del correo a verificar mediante RegEx.
     */
    public void validarPaypal(String cuenta) {

        if (cuenta.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com$")) {
            System.out.println("Correo válido");

    } else {
            System.out.println("Correo inválido");
        }

    }
    /**
     * Verifica la disponibilidad de fondos antes de confirmar el pago.
     * @param importe Cantidad a descontar del saldo disponible.
     */
    @Override
    public String toString() {
        return "Paypal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public void procesarPago(double importe) {
        if (importe<=saldo) {
            System.out.println("Procesando pago de " + importe + " € con PayPal");
        }else{

            System.out.println("EL saldo es insuficiente");
        }
    }
}
