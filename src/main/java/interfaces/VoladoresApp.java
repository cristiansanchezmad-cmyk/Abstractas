package interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VoladoresApp {
    static void main() {


        Superman clark_lent = new Superman();
        Pajaros piolin = new Pajaros();
        SpiderMan peter_parker = new SpiderMan();

        clark_lent.volar();
    piolin.volar();
        clark_lent.rayoLaser();
        clark_lent.alientoHielo();

        ArrayList<SuperHeroe> listaHeroes= new ArrayList<>();
        listaHeroes.add(clark_lent);
        listaHeroes.add(peter_parker);

        for (SuperHeroe superHeroe : listaHeroes){
            if (superHeroe instanceof  Superman) {
                ((Superman) superHeroe).alientoHielo();
                ((Superman) superHeroe).rayoLaser();

            } else if (superHeroe instanceof  SpiderMan) {
                ((SpiderMan) superHeroe).volar();
            }

        }

    }

}
