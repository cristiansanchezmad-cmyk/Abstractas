package Practica3;

import java.util.ArrayList;

public class Jugador extends MutxameFC implements AccionesDeportivas,FuncionesIntegrantes{

    private Equipo categoria;
    private int dorsal;
    private Posiciones posicion;
    private static ArrayList<Integer> listaDorsales= new ArrayList<Integer>();


    public Jugador(String nombre, int edad, Integer dorsal, Posiciones posicion, Equipo categoria) {
        super(nombre, edad);
        setDorsal(dorsal);
        this.posicion=posicion;
        this.categoria=categoria;

    }

    public void calentar(){

        System.out.println("El jugador comienza en calentar");
    }

    public void descansar(){

        System.out.println("El jugador sale a descansar");

    }

    public void marcarGol(){

        System.out.println("GOOOOOOOOOOL");

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


         try {

             if (!listaDorsales.contains(dorsal)) {

                listaDorsales.add(dorsal);
                this.dorsal=dorsal;
             }else {
                 throw new ComprobarDorsal();
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
                "categoria=" + categoria +
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

        System.out.println("EL jugador celebra el gol quitándose la camiseta");
    }
}
