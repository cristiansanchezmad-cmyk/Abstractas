package Practica3;


public class Masajista extends MutxameFC {

    /**
     * Esta clase representa a un acompañante de un jugador del equipo.
     * @author Christian Sanchez Madueño
     * @version 1.0 (27/02/2026)
     */
    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anosExperiencia=anosExperiencia;
    }

    public  void darMasajes(Jugador jugador){

        System.out.println("El masajista comienza con su masaje...");

    }
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }

}
