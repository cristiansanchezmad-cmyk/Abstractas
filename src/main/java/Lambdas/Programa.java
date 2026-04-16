package Lambdas;

import practica1_Tema7.Pedido;
import practica1_Tema7.Producto;

import javax.xml.crypto.KeySelector;

public class Programa {
    static void main(String[] args) {

        Prueba prueba = new Prueba() {
            @Override
            public String aprobar(int nota) {
             if (nota>5) {
                 return "APROBANDO PRORGRAMACIÓN DESDE UNA ANONIMA";

             }else{
                 return "Al miercoles";
             }

             }
        };
        Prueba lambda = (int nota) -> {

            System.out.println("Aprobando programación desde lambda"+nota);
            if (nota>5){

                return "Apruebo";
            }else{

                return "Miércoles";

            }

        };
    }
}
