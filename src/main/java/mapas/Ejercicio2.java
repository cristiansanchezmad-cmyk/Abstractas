package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner teclado = new Scanner(System.in);
    static void main(String[] args) {


        HashMap<Character,Integer> mapita = new HashMap<>();

        System.out.println("Introduce una palabra...");
        String palabra = teclado.nextLine();

        for (Character letras : palabra.toCharArray()){


            if (mapita.containsKey(letras)){

                mapita.put(letras,mapita.get(letras)+1);

            }else {

                mapita.put(letras,mapita.getOrDefault(letras,1));
            }

        }


        for (Map.Entry<Character, Integer> mapa : mapita.entrySet()){

            System.out.println(mapa.getKey()+ " : "+mapa.getValue()+ " veces ");



        }

    }
}
