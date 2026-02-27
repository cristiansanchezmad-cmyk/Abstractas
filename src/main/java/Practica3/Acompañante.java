package Practica3;

/**
 * Esta clase representa a un acompañante de un jugador del equipo.
  * @author Christian Sanchez Madueño
 * @version 1.0 (27/02/2026)
 */
public class Acompañante extends MutxameFC implements FuncionesIntegrantes{

    private Jugador integrante;
    private String parentesco;

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    /**
     * Metodo que muesta como el acompañante anima al equipo
     * durante el partido.
     */
    public void animarEquipo(){
        System.out.println("El acompañante"+this.getNombre()+" anima al equipo");
    }

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante=integrante;
        this.parentesco=parentesco;
    }


    @Override
    public String toString() {
        return "Acompañante{" +
                "integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }

    /**
     * Metodo que muestra al acompañante concentrado
     */
    @Override
    public void concentrarse() {
        System.out.println("El acompañante"+this.getNombre()+" se concentrar viendo el partido desde la grada");
    }

    /**
     * Metodo donde el acompañante viaja a la ciudad del partido
     * @param ciudad nombre de la ciudad destino.
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante "+this.getNombre()+" viaja a la ciudad donde se celebrará el partido de su equipo");
    }

    /**
     * Metodo donde el acomapañante celebra el gol de su equipo
     */
    @Override
    public void celebrarGol() {
        System.out.println(("El acompañante " + this.getNombre()+" celebra el gol gritando desde la grada con todas sus fuerzas"));
    }
}