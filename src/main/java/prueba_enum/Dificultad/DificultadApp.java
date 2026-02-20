package prueba_enum.Dificultad;

import java.util.Random;
import java.util.Scanner;

public class DificultadApp {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();

        int puntaicon = ale.nextInt(5001);
        System.out.println("Introduce la dificultad: ");
        Dificultado dificultad = Dificultado.valueOf(teclado.next());

        int resultado = puntaicon*dificultad.getMultiplicador();

        System.out.println("Puntuacion obtenida: "+puntaicon);
        System.out.println("Puntuacion final "+resultado );
    }
}
