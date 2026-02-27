package Practica3;

import java.util.ArrayList;

public class Jugador extends MutxameFC implements AccionesDeportivas,FuncionesIntegrantes{
    /**
     * Esta clase representa a un entrenador de un equipo.
     * @author Christian Sanchez Madueño
     * @version 1.0 (27/02/2026)
     */
    private Equipo categoria;
    private int dorsal;
    private Posiciones posicion;
    private static ArrayList<Jugador> listaDorsales= new ArrayList<Jugador>();


    public Jugador(String nombre, int edad, Integer dorsal, Posiciones posicion, Equipo categoria) {
        super(nombre, edad);
        this.posicion=posicion;
        this.categoria=categoria;
        setDorsal(dorsal);


    }

    /**
     * Metodo que muesta como el jugador calienta.
     */

    public void calentar(){

        System.out.println("El jugador comienza en calentar");
    }
    /**
     * Metodo que muesta como el jugador descansa.
     */
    public void descansar(){

        System.out.println("El jugador sale a descansar");

    }
    /**
     * Metodo que muesta como el jugador mete gol.
     */

    public void marcarGol(){

        System.out.println("GOOOOOOOOOOL de "+this.getNombre());

    }


    public Equipo getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipo categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {

        boolean estado=false;
        try {
            for (Jugador j : listaDorsales){
                if (dorsal== j.getDorsal() && categoria==j.getCategoria()){

                    estado=true;

                }


            }
            if (estado) {

                throw new ComprobarDorsal();
            }else {

                listaDorsales.add(this);
                this.dorsal=dorsal;

            }
            
        }catch (ComprobarDorsal comprobar ){

            System.out.println(comprobar.getMessage());

        }

    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + getNombre() +
                ", edad=" + getEdad() +
                ", categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", posicion=" + posicion +
                '}';
    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

        System.out.println(this.getNombre()+" comienza el partido contra "+rival);
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador "+this.getNombre()+" se concentrar cuando el pitido del árbitro indica el comienzo del partido");
    }

    @Override
    public void viajar(String ciudad) {

        System.out.println("El jugador "+this.getNombre()+" viaja al lugar donde se celebra el partido");
    }

    @Override
    public void celebrarGol() {

        System.out.println("El jugador"+ this.getNombre()+"celebra el gol quitándose la camiseta");
    }
}