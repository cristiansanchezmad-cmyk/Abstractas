package Practica1_ecommerce;

public class AppEcommerce {

    /**
     * Método principal que inicia el flujo de pago a través de la tienda.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {

        // Llamada al método estático para iniciar el proceso de selección y validación
        Metodo_pago miPago = Tienda.iniciarPago();

        // Si el pago se configuró correctamente, se procede a procesarlo
        if (miPago != null) {
            // Ejemplo de importe: 150.50 €
            miPago.procesarPago(150.50);
        } else {
            System.out.println("No se pudo completar la operación: Método de pago no válido.");
        }
    }
}

