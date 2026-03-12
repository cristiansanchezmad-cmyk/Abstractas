package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Va_de_Modas {

        static Scanner teclado;

        public static boolean casoDePrueba() {
            int num = teclado.nextInt();
            teclado.nextLine();
            HashMap<Integer,Integer> mapita = new HashMap<>();
            int numoriginal=0;
            int nummoda=0;

            if (num<=0)
            return false;
        else {


                    String nume=teclado.nextLine();





                for (String moda : nume.split(" ")){

                    if (mapita.containsKey(Integer.parseInt(moda))){

                       mapita.put(Integer.parseInt(moda),mapita.get(Integer.parseInt(moda))+1);


                    }else{

                        mapita.put(Integer.parseInt(moda),1);



                    }

                }

                for (Map.Entry < Integer, Integer> mapa : mapita.entrySet()){



                        if (mapa.getValue()>numoriginal){

                           numoriginal=mapa.getValue();

                        }else{

                            System.out.println(numoriginal);
                        }


                }





                return true;
            }
        }

        public static void main(String[] args) {
            teclado = new Scanner(System.in);
            while (casoDePrueba()) {
            }
        } // main

    } // class soluti
