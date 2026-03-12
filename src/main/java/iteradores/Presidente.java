package iteradores;

public class Presidente {
    private String nombre;
    private String ciudad;



    public Presidente(String nombre, String ciudad){

        this.nombre=nombre;
        this.ciudad=ciudad;

    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
