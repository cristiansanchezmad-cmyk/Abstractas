package Practica1_ecommerce;


import java.util.Random;
import java.util.Scanner;
/**
 * Gestiona los pagos mediante el sistema Bizum, generando un PIN de seguridad.
 * * @author Christian Sanchez Madueño
 * @version 1.0 (15/02/2026)
 */
public class Bizum extends Metodo_pago {

    private static Random ran= new Random();
    private String telefono;
    private int pin;

    /**
     * Constructor de la clase Bizum.
     * @param telefono El número de teléfono móvil del usuario.
     * @param pin Valor inicial del PIN (será sobrescrito por uno aleatorio).
     */
    public Bizum(String telefono, int pin){

        this.telefono=telefono;
        this.pin=ran.nextInt(99999,1000000);

    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }

    /**
     * Valida la longitud del teléfono y asigna el PIN generado.
     * @param telefono Cadena con el número de teléfono a validar.
     * @param pin Código de seguridad de 6 dígitos.
     */
public void validadBizum(String telefono, int pin ){

    if (telefono.length()==9){}

    this.telefono=telefono;

    System.out.println(pin);

}

    /**
     * @param importe Cantidad económica a procesar en la transacción.
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de"+importe+" € con Bizum");
    }
}
