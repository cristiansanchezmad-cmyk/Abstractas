package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {

    static HashMap<String, Double> mapita = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);
    static void main(String[] args) {

        System.out.println("*** REGISTRO DE TEMPERATURAS ***");
        while (true) {

            System.out.println("Elige una opción [insertar, actualizar, consultar, mostrar]");
            String opcion= teclado.nextLine().toLowerCase();
            switch (opcion){
                case "insertar":
                    insertar();
                    break;
                case "actualizar":
                    actualizar();
                    break;
                case "consultar":
                    consultar();
                    break;
                case "ver todas":
                    mostrar();
                    break;
                case "salir": break;

                default:

                    System.out.println("No existe la opcion. Vuelve a elegir una...");


            }
            System.out.println("***Mapita Temporal ***");
            for (Map.Entry<String, Double> mapita: mapita.entrySet()){

                System.out.println(mapita.getKey()+" - "+mapita.getValue());


            }

        }


    }

    public static void insertar(){

        System.out.println("Introduce los datos (ciudad_temperatura)");
        String ciudad[] = teclado.nextLine().split("/");

        mapita.put(ciudad[0], Double.valueOf(ciudad[1]));


    }

    public static void actualizar(){

        System.out.println("Introduce los datos nuevos");
        String ciudadnew [] = teclado.nextLine().split("/");

            if (mapita.containsKey(ciudadnew[0])){



                mapita.put(ciudadnew[0], Double.valueOf(ciudadnew[1]));


            }else{

                System.out.println("No hay una ciudad con el dato que vas");

            }



    }

    public static void consultar(){


    }

    public static void mostrar(){


    }
}
