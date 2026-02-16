package Practica1_ecommerce;

import java.util.Scanner;

/**
 * Clase que gestiona la selección y validación de los métodos de pago.
 * @author Christian Sanchez Madueño
 * @version 1.0 (15/02/2026)
 */
public class Tienda {

    private static Scanner sc = new Scanner(System.in);

    /**
     * Pregunta al usuario el método de pago a usar y realiza las validaciones correspondientes.
     * @return El método de pago creado y validado.
     */
    public static Metodo_pago iniciarPago() {
        System.out.println("¿Qué método de pago quiere usar? (1. Tarjeta, 2. PayPal, 3. Bizum)");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                return configurarTarjeta();
            case 2:
                return configurarPaypal();
            case 3:
                return configurarBizum();
            default:
                System.out.println("Opción no válida.");
                return null;
        }
    }

    /**
     * Auxiliar para crear y ejecutar la validación de Tarjeta de Crédito.
     * @return Instancia de TarjetaCredito.
     */
    private static Metodo_pago configurarTarjeta() {
        System.out.print("Introduce número tarjeta: ");
        String nro = sc.nextLine();
        System.out.print("Introduce tipo: ");
        String tipo = sc.nextLine();
        TarjetaCredito tc = new TarjetaCredito(nro, tipo);
        tc.validadTarjeta(nro);
        return tc;
    }

    /**
     * Auxiliar para crear y ejecutar la validación de PayPal.
     * @return Instancia de Paypal.
     */
    private static Metodo_pago configurarPaypal() {
        System.out.print("Introduce cuenta: ");
        String cuenta = sc.nextLine();
        Paypal p = new Paypal(cuenta);
        p.validarPaypal(cuenta);
        return p;
    }

    /**
     * Auxiliar para crear y ejecutar la validación de Bizum.
     * @return Instancia de Bizum.
     */
    private static Metodo_pago configurarBizum() {
        System.out.print("Introduce teléfono: ");
        String tlf = sc.nextLine();
        Bizum b = new Bizum(tlf, 0);
        b.validadBizum(tlf, b.getPin());
        return b;
    }
}