package Plataforma_streaming;

public abstract class Suscripcion {

    public Suscripcion(String nombrePlan, double precio){

        this.nombrePlan=nombrePlan;
        this.precio=precio;

    }
    private String nombrePlan;
    private double precio;

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

 public abstract void obtenerBeneficios();
 public abstract void obtenerPeriodoPrueba();
    public void mostrarInfo(){

        System.out.println("Plan: "+nombrePlan+ ", Precio: "+precio+ " €");

    }

    @Override
    public String toString() {
        return "Suscripcion{" +
                "nombrePlan='" + nombrePlan + '\'' +
                ", precio=" + precio +
                '}';
    }
}
