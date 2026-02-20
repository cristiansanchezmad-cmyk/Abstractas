package Practica3;

public class AppEquipo {


    static void main(String[] args) {
        Masajista masajista = new Masajista("Mario", 23, "Grado en Fisioterapueta", 10);
        Jugador jugador1 = new Jugador("Pepe", 22,  7, Posiciones.DEFENSA, Equipo.BENJAMIN);
        Jugador jugador2 = new Jugador("Luis",29, 7, Posiciones.DELANTERO, Equipo.BENJAMIN);


        System.out.println(jugador1.getDorsal());
        System.out.println(jugador2.getDorsal());




    }

}
