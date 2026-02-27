package Practica3;


public class Entrenador extends MutxameFC implements AccionesDeportivas, FuncionesIntegrantes{
    /**
     * Esta clase representa a un entrenador de un equipo.
     * @author Christian Sanchez Madueño
     * @version 1.0 (27/02/2026)
     */
    private Equipo equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipo equipo, String formacionPreferida) {
        super(nombre, edad);

        this.equipo=equipo;
        setFormacionPreferida(formacionPreferida);
    }


    public Equipo getEquipo() {

        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {

        try {

            if (formacionPreferida.matches("\\d-\\d-\\d")) {

                this.formacionPreferida=formacionPreferida;

            }else {
                throw new ValidarFormacion();
            }
        }catch (ValidarFormacion validarFormacion ){

            System.out.println(validarFormacion.getMessage());

        }

    }

    /**
     * Metodo que muesta como el el entrenador planifica el entrenamiento.
     */
    public void planificarEntrenamiento(){

        System.out.println("Comienza a planificar el entrenamiento");

    }
    public void hacerCambios(){

        System.out.println("El entrenador cambia al jugador...");
    }


    /**
     * Metodo que muesta como el entrenador comienza con el entrenamiento
     */
    @Override
    public void entrenar() {
        System.out.println("El entrenador comienza a explicar el entrenamiento");
    }

    /**
     * Metodo que muesta al entrenador en el partido
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println("EL entrenador "+this.getNombre()+" está dirigiendo el partido desde el banquillo ");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }


    /**
     * Metodo que muesta como el entrenador se concentra
     */
    @Override
    public void concentrarse() {
        System.out.println("El entrenador "+this.getNombre()+" se concentrar en sus jugadors mientras ve el partido");
    }

    /**
     * Metodo que muesta como el entrenador viaja al lugar del partido
     */
    @Override
    public void viajar(String ciudad) {

        System.out.println("El entrenador "+this.getNombre()+" viaja con su equipo al campo donde se celebrará el partido");
    }

    /**
     * Metodo que muesta como el entrenador celebra el gol
     */

    @Override
    public void celebrarGol() {

        System.out.println("El entrenador celebra el gol de su jugador desde el banquillo");
    }
}
