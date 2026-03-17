package iteradores;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Mariateclado {
    static Scanner teclado = new Scanner(System.in);

    static void main(String[] args) {


        ArrayList<Character> lista = new ArrayList<>();
        ListIterator<Character> it = lista.listIterator();
        String frase = teclado.nextLine();

        for (Character caracter : lista) {

            switch (caracter) {

                case '<':
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                    break;


            case '>':
                if (it.hasNext()){

                    it.next();
                }
                break;

                case '#':
                    if (it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    break;

                default:
                    it.add(caracter);


        }
        }
        for (Character caracter : lista){
            System.out.println(caracter);
        }
        }
    }

