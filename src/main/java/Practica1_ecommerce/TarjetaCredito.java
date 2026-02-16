package Practica1_ecommerce;

import java.lang.reflect.Array;
/**
 * Gestiona los pagos con tarjeta de crédito validando el emisor y la longitud del número.
 * * @author Christian Sanchez Madueño
 * @version 1.0 (15/02/2026)
 */
public class TarjetaCredito extends Metodo_pago{

    private final String tipos[]={"VISA", "MASTECARD","MAESTRO"};


    private String nro_tarjeta;
    private String tipo;

    /**
     * Constructor de Tarjeta de Crédito.
     * @param nro_tarjeta El número de la tarjeta (debe ser de 15 caracteres).
     * @param tipo El emisor de la tarjeta (VISA, MASTERCARD o MAESTRO).
     */
    public TarjetaCredito(String nro_tarjeta, String tipo){
      validadTarjeta(nro_tarjeta);
      setTipo(tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        for (int i = 0; i < tipos.length; i++) {

        if (tipos[i].contains(tipo)){

            this.tipo = tipos[i];

        }

        }

    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;

    }
    /**
     * Valida que el número de tarjeta cumpla con la extensión requerida.
     * @param nro_tarjeta Cadena con los dígitos de la tarjeta.
     */
public void validadTarjeta(String nro_tarjeta){

        if (nro_tarjeta.length()==15){
        this.nro_tarjeta=nro_tarjeta;
    }else{
        System.out.println("EL numero de la tarjeta es mayor del establecido");
    }
}

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+ " € con tarjeta de\n" +
                "crédito VISA");
    }

    /**
     * @param importe Cantidad a cargar en la tarjeta seleccionada.
     */
    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
