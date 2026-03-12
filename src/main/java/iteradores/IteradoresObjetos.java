package iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteradoresObjetos {

    static void main(String[] args) {

        ArrayList<Presidente> lista = new ArrayList<>(Arrays.asList(
        new Presidente ("Donal Trump", "USA"),
        new Presidente ("Benja Netanyahu", "ISAREL"),
        new Presidente ("Pedro Sánchez", "ESPAÑA")));

        Iterator<Presidente> it = lista.iterator();
        while (it.hasNext()) {

            Presidente presi = it.next();

            if (presi.getNombre().equals("Benja Netanyahu")) {
                it.remove();
            }
        }
        System.out.println(lista);
    }

}
