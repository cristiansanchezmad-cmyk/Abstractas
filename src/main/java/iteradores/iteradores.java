package iteradores;

import java.util.*;

public class iteradores {

    static void main(String[] args) {

        TreeSet<String> lista = new TreeSet<>();
        lista.add("Pikachu");
        lista.add("Charmander");
        lista.add("Squirtle");
        lista.add("Bulbasur");
        lista.add("Magikarp");
//
//        for (String pokemon : lista){
//
//            if (pokemon.equalsIgnoreCase("Squirtle")){
//
//                lista.remove(pokemon);
//            }
//        }

        Iterator<String> it = lista.iterator();
        while (it.hasNext()){

            String pokemon = it.next();
            if (pokemon.equals("Pikachu")){

                it.remove();
            }else {
                System.out.println(pokemon);
            }
        }

        HashMap<String,Integer> mapa = new HashMap<>();
        mapa.put("Nicky Nicole", 4);
        mapa.put("Hermione", 7);

       Iterator< Map.Entry<String, Integer>> itmapita = mapa.entrySet().iterator();
       while (itmapita.hasNext()) {
           Map.Entry<String, Integer> novia = itmapita.next();
           System.out.println(novia.getKey()+"ha durado "+novia.getValue());

           if (novia.getKey().equals("Hermiones")){

               itmapita.remove();

           }

       }

    }
}
