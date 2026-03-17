package org.example.tenis;

import redes_sociales.Usuario;

import java.util.*;

public class ReservasApp {
    static HashMap<Usuario, HashSet<Reserv>> mapa = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);
    static void main(String[] argsS) {

    }

    public static void  eliminar(HashSet<Reserv> listaRserva){

        System.out.println("Qué pistas quieres borrar?");
        String pista = teclado.nextLine();
        Iterator<Reserv> iterator = listaRserva.iterator();

        while (iterator.hasNext()){

            Reserv reserv = iterator.next();

            if (reserv.getPista() instanceof Tenis){

                iterator.remove();

            } else if (reserv.getPista() instanceof  Padel) {

            }
            iterator.remove();



        }

    }

    public static HashSet<Reserv> listareserva(Usuario usuario){



        return mapa.get(usuario);
    }

    public static void reservaCrear(Usuario usuario, Pista pista){

        Reserv reserv = new Reserv(usuario, pista);

        HashSet <Reserv> lista = listareserva(usuario);

        if (lista.contains(reserv)){

            throw  new ReservaDuplicada("Ya hay una reserva igual");

        }else{

            lista.add(reserv);
            mapa.put(usuario, lista);

        }

    }



}


