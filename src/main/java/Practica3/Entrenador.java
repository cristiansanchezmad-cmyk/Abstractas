package Practica3;

public class Entrenador extends MutxameFC implements AccionesDeportivas, FuncionesIntegrantes{

    private Equipo equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipo equipo, String formacionPreferida) {
        super(nombre, edad);

        this.equipo=equipo;
        this.formacionPreferida=formacionPreferida;

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
        this.formacionPreferida = formacionPreferida;
    }

    public void planificarEntrenamiento(){

        System.out.println("Comienza a planificar el entrenamiento");

    }
    public void hacerCambios(){

        System.out.println("El entrenador cambia al jugador...");
    }


    @Override
    public void entrenar() {
        System.out.println("El entrenador comienza a explicar el entrenamiento");
    }

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


    @Override
    public void concentrarse() {
        System.out.println("El entrenador "+this.getNombre()+" se concentrar en sus jugadors mientras ve el partido");
    }

    @Override
    public void viajar(String ciudad) {

        System.out.println("El entrenador "+this.getNombre()+" viaja con su equipo al campo donde se celebrará el partido");
    }

    @Override
    public void celebrarGol() {

        System.out.println("El entrenador celebra el gol de su jugador desde el banquillo");
    }
}
