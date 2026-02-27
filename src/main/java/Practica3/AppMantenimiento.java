package Practica3;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase gestiona el mantenimiento del sistema del club. Lo que signfica que comprobará ciertas cosas del programa, las cuales apareecen en el menu

 * @author Christian Sanchez Madueño
 * @version 1.0 (27/02/2026)
 */
public class AppMantenimiento {

    static  Scanner teclado = new Scanner(System.in);

    /**
     * Este es el menú principal de la aplicación. Dependiendo de la opcion que escojas te llevará a otro menu
     */
    public static void MenuMantenimiento() {
        System.out.println("[1]. Mantenimiento de jugadores" +
                " Dentro podremos añadir jugadores, modificar datos y añadir acompañante (sólo seniors ) ");
        System.out.println("[2]. Consultar equipos" +
                " Dentro se deben listar los equipos del club y elegir uno ");
        System.out.println("[3]. Salir");

        String opcion = teclado.nextLine();

        switch (opcion){

            case "1":
                SubmenuManetenerjugadores();
                break;
            case "2":
                ListadoEsquipos();
                break;
            case "3":
                System.out.println("Saliendo");
                break;
        }
    }

    /**
     * Muestra el submenú de gestión de jugadores. En este podras añadir nuevos jugadores, modificar los que existen o crear acompañantes solo para jugadores sénior.*/
    public static void SubmenuManetenerjugadores(){

        System.out.println("[1]. Añadir nuevo jugador");
        System.out.println("[2]. Modificar datos de jugadores existentes");
        System.out.println("[3]. Crear acompañantes (solo séniors)");
        System.out.println("[X]. Volver al menú principal");
        String subopcion = teclado.nextLine();

        switch (subopcion.toUpperCase()){

            case "1":
                AñadirJugadores();
                break;
            case "2":
                MenumodificarJugadores();
                break;
            case "3":
                AñadirAcompañante();
                break;
            case "X":
                System.out.println("Volviendo al menu principal");
                MenuMantenimiento();
        }
    }

    /**
     * Permite crear un nuevo jugador solicitando los datos por teclado. Estos datos se añadiran a un nuevo Jugador. La posicion y la categoria introducidas deberan coincidir en el Enum
     */
    public static void AñadirJugadores() {
        System.out.println("Introduce los datos del jugador:");
        System.out.println("Introduce su nombre ");
        String nombre2 = teclado.nextLine();
        System.out.println("Introduce su edad:");
        int edad2 = teclado.nextInt();
        System.out.println("Introduce su dorsal");
        int dorsal = teclado.nextInt();

        teclado.nextLine();

        System.out.println("Introduce su posicion (esta solo podrá ser delantero, defensa, centrocampista y portero)");

        String posicion = teclado.nextLine().toUpperCase();
        Posiciones posiciones = null;

        try {
            posiciones = Posiciones.valueOf(posicion);
        } catch (IllegalArgumentException e) {
            System.out.println("La posicion no coincide con la dichas anteriormente");
        }

        System.out.println("El valor debe de coincidir con los dichos anteriormente");

        System.out.println("Introduce la categoria a la que pertenece(esta solo podrá ser  benjamin, alevin, cadete, senior, infantil o juvenil )");
        String categoria = teclado.nextLine().toUpperCase();
        Equipo equipo = null;
        try {
            equipo = Equipo.valueOf(categoria);
        } catch (IllegalArgumentException e) {
            System.out.println("El valor debe  de coincidir con lo dicho anteriormente");
        }

        Jugador jugadorcreado = new Jugador(nombre2, edad2, dorsal, posiciones, equipo);
        System.out.println(jugadorcreado);
    }

    /**
     * Permite modificar los datos de un jugador existente. Primero aparecen los jugadores registrados donde podras elegir a cual quieres modificarle los datos.
     * Una vez escogido, saltará otro menu que preguntará que dato es el que quieres cambiar. Cuando selecciones esta opcion, podras escribir el dato y se guardará en ese jugador
     */
    public static void MenumodificarJugadores() {

        for (int i = 0; i < AppEquipo.listaJugadores.size(); i++) {
            System.out.println(i + AppEquipo.listaJugadores.get(i).toString());
        }

        System.out.println("De que jugador quieres modficar datos");
        int opcionmodif = teclado.nextInt();

        Jugador jugadormodificar = AppEquipo.listaJugadores.get(opcionmodif);
        System.out.println("Que dato quieres cambiar");
        System.out.println("[1]. Nombre");
        System.out.println("[2]. Edad");
        System.out.println("[3]. Dorsal");
        System.out.println("[4]. Posicion");
        System.out.println("[5]. Categoria");

        teclado.nextLine();

        System.out.println("Escribe que lo que quieres añadir");
        String datojug = teclado.next();

        switch (datojug) {
            case "1":
                String nombre = teclado.nextLine();
                jugadormodificar.setNombre(nombre);
                break;

            case "2":
                int edad = teclado.nextInt();
                jugadormodificar.setEdad(edad);
                break;

            case "3":
                int dorsal = teclado.nextInt();
                jugadormodificar.setDorsal(dorsal);
                break;

            case "4":
                String posicion = teclado.nextLine().toUpperCase();
                jugadormodificar.setPosicion(Posiciones.valueOf(posicion));
                break;
        }

        System.out.println(jugadormodificar);
    }

    /**
     * Permite crear un acompañante que pertenezca a un jugador senior, asi que primero introducira los datos por teclado.
     * Al llegara equipo y posicion comprobara si existe en el enum.
     * Una vez hecho esto comprobara que el jugador que has elegido acompañña ( que ya sabes que existe) tenga como categoria senior, si es asi te dejará crearlo
     *
     */
    public static void AñadirAcompañante() {

        System.out.println("Introduce los datos del jugador:");
        System.out.println("Introduce su nombre ");
        String nombre2 = teclado.nextLine();
        System.out.println("Introduce su edad:");
        int edad2 = teclado.nextInt();
        System.out.println("Introduce el nombre jugador al que acompaña");
        String jugador= teclado.nextLine();
        Jugador jugadoracompañante=null;

        for (Jugador j : AppEquipo.listaJugadores){

            if (j.getNombre().equalsIgnoreCase(jugador) && j.getCategoria().equals(Equipo.SENIOR)) {
                jugadoracompañante=j;
            } else  {
                System.out.println("Error. El jugador seleccionado no existe");
            }
        }

        System.out.println("Introduce su parentesco");
        String parentesco=teclado.nextLine();

        Acompañante Acompañantecreado = new Acompañante(nombre2, edad2, jugadoracompañante,parentesco);
        System.out.println(Acompañantecreado);
    }

    /**
     * Muestra el listado de equipos disponibles.
     * Despues preguntara de que equipo de los que hay en el enum, comprobado ya en el enum, quieres mostrar jugadores
     */
    public static void ListadoEsquipos(){

        System.out.println("Consultando equipos...");

        for (Equipo equipo : Equipo.values()){
            System.out.println(equipo.toString());
        }

        System.out.println("Que equipo quieres ver?");
        String equipover=teclado.nextLine();

        for (Jugador jugador :AppEquipo.listaJugadores ){

            if (jugador.getCategoria().toString().equalsIgnoreCase(equipover)){
                System.out.println(jugador);
            }else{
                System.out.println("No hay jugadores creado que pertenezcan a este equipo");
            }
        }
    }
}