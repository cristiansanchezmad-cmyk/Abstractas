package collecciones;

import java.util.Stack;

public class Ejercicio2_pilas {
    static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        pila.push(4);
        pila.push(2);
        pila.push(14);


        while (!pila.isEmpty()){

            System.out.println(pila.pop());

        }

    }
}
