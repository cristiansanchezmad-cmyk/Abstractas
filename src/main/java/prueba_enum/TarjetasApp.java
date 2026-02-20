package prueba_enum;

import java.util.Scanner;

public class TarjetasApp {
    static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Tarjetas tarjeta_tipo = Tarjetas.VISA;

        System.out.println(tarjeta_tipo.ordinal());

        System.out.println(tarjeta_tipo.name());

        System.out.println("Tipos de tarjetas: ");
        for (Tarjetas tarjeta: Tarjetas.values()){
            System.out.println(tarjeta);

        }
        System.out.println("Introduce el tipo: ");
        Tarjetas tipo= Tarjetas.valueOf(teclado.next());

        System.out.println("La tarjeta del tipo: "+tarjeta_tipo+" tiene una comisión de "+tipo.getComision()+ " euros");

    }
}
