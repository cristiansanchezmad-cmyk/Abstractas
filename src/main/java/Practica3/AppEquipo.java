package Practica3;

import java.util.ArrayList;

/**
 * Esta clase representa la aplicación principal. Aqui se comprobaran los metodos que aparecen en la practica
 * Tambien es donde aparece el menú de mantenimiento.
 *
 * @author Christian Sanchez Madueño
 * @version 1.0 (27/02/2026)
 */
public class AppEquipo {

    static ArrayList<Jugador> listaJugadores = new ArrayList<>();
    static ArrayList<Acompañante> listacompañantes = new ArrayList<>();

    /**
     * Método principal de la aplicación.
     *
     * Crea instancias de jugadores, entrenador,
     * masajistas y acompañantes.
     *
     * Añade jugadores y acompañantes a sus respectivas listas
     * y ejecuta distintas acciones del equipo como entrenar,
     * jugar partidos, dar masajes o viajar.
     *
     * Finalmente muestra el menú de mantenimiento.
     *
     * @param args argumentos de línea de comandos (no utilizados).
     */
    static void main(String[] args) {

        Jugador jugador1 = new Jugador("Pepe", 22,  7, Posiciones.DEFENSA, Equipo.SENIOR);
        Jugador jugador2 = new Jugador("Luis",29, 7, Posiciones.DELANTERO, Equipo.SENIOR);
        Jugador jugador3 = new Jugador("Lucho",29, 5, Posiciones.DELANTERO, Equipo.ALEVIN);

        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);

        Entrenador entrenador1 = new Entrenador("Jose Mourinho",30,Equipo.SENIOR,  "4-4-2");

        entrenador1.setFormacionPreferida("4-3-3");

        Masajista masajista = new Masajista("Mario", 35, "Grado en Fisioterapueta", 10);
        Masajista masajista2 = new Masajista("Laura", 20, "Grado en Fisioterapueta", 1);

        Acompañante acompañante1 = new Acompañante("Antonio", 40,jugador1, "Padre");
        Acompañante acompañante2 = new Acompañante("Maria Luisa", 45,jugador2,"Madre");
        Acompañante acompañante3 = new Acompañante("Maria Jose", 45,jugador3,"Madre");

        listacompañantes.add(acompañante1);
        listacompañantes.add(acompañante2);
        listacompañantes.add(acompañante3);

        jugador1.concentrarse();

        entrenador1.entrenar();

        masajista.darMasajes(jugador1);

        acompañante1.viajar("Madrid");

        entrenador1.planificarEntrenamiento();

        entrenador1.entrenar();

        jugador2.descansar();

        jugador2.calentar();

        entrenador1.jugarPartido("Valencia");

        acompañante1.animarEquipo();

        entrenador1.hacerCambios();

        jugador1.marcarGol();

        jugador1.celebrarGol();

        masajista2.darMasajes(jugador1);
        masajista2.darMasajes(jugador2);

        acompañante2.viajar("Mutxamel");

        jugador1.descansar();

        System.out.println("Bienvenido al menu de mantenmiento");
        AppMantenimiento.MenuMantenimiento();
    }
}