package interfaces.Ejercicio_Dispositivos;

public abstract class Dispositivo {

    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre, boolean estado){
        this.nombre=nombre;
        estado=false;

    }

    public abstract void encender ();

    public void apagar(){

        if (estado) {
            estado = false;
            System.out.println("Dispositivo " + nombre + " apagado");
        }else{
            System.out.println("EL dispositvo "+ nombre+" ya ha sido apagado");
        }

    }
    public void mostrarEstado(){

        System.out.println(estado);
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }

}
