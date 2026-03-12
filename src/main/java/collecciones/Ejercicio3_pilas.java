package collecciones;

import java.util.Stack;

public class Ejercicio3_pilas {
    static void main(String[] args) {
        String expresion="((2+3)*(5-1))(";
        if (esBalanceado(expresion)){

            System.out.println("BIEN");
        }else{

            System.out.println("MALAMENTE");
        }

    }


public static boolean esBalanceado(String expresion){

    Stack<Character> pila = new Stack<>();
    for (int i = 0; i < expresion.length(); i++) {

        if (expresion.charAt(i)=='('){
            pila.push('(');
        } else if (expresion.charAt(i)==')') {

            if ( pila.contains('(')){

                pila.pop();


            }else{

                return false;
            }

        }
    }

    if (pila.isEmpty()){

        return true;
    }else{

        return false;
    }

}

}

