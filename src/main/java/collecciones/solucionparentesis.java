package collecciones;

import java.util.Stack;

public class solucionparentesis {

        static java.util.Scanner in;

        public static boolean casoDePrueba() {
            if (!in.hasNext())
                return false;
            else {
                Stack<Character> pila = new Stack<>();
                String valor="";
                String comp=in.nextLine();
                boolean estado= true;
                for (int i = 0; i <comp.length() ; i++) {
                    if (comp.charAt(i)=='(' || comp.charAt(i)=='{' || comp.charAt(i)=='[') {

                        pila.push(comp.charAt(i));

                    } else if (comp.charAt(i)==')' || comp.charAt(i)=='}' || comp.charAt(i)==']') {

                        pila.push(comp.charAt(i));


                    }

                    if (pila.peek()=='[' && comp.charAt(i)==']'){

                       pila.pop();

                   } else if (pila.peek()=='(' && comp.charAt(i)==')') {
                        pila.pop();
                   } else if (pila.peek()=='{' && comp.charAt(i)=='}') {

                       pila.pop();
                   }else{

                       estado=false;

                   }

                    }

                if (estado && pila.isEmpty()){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                return true;
            }
        } // casoDePrueba

        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {
            }
        }
    }


