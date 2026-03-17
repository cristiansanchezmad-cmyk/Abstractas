package iteradores;

import java.util.ArrayList;
import java.util.ListIterator;
public class tecleado_estropeado{

    static java.util.Scanner teclado;

    public static boolean casoDePrueba() {
        if (!teclado.hasNext())
            return false;
        else {
            ArrayList<Character> lista = new ArrayList<>();
             ListIterator<Character> it = lista.listIterator();
            String frase = teclado.nextLine();

            for (Character caracter : frase.toCharArray()) {

                switch (caracter) {
                    case '-':
                        while (it.hasPrevious()) {
                            it.previous();
                        }
                        break;

                    case '+':
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;

                    case '*':
                        if (it.hasNext()) {
                            it.next();
                        }
                        break;

                    case '3':
                        if (it.hasNext()) {
                            it.next();
                            it.remove();
                        }
                        break;

                    default:
                        it.add(caracter);
                        break;
                }
            }
            for (Character caracter : lista) {
                System.out.print(caracter);
            }
            System.out.println();
            return true;


        }


        }


    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}

