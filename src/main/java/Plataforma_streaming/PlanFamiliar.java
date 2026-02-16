package Plataforma_streaming;

public class PlanFamiliar extends  Suscripcion{
    public PlanFamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }
    @Override public void mostrarInfo(){
        super.mostrarInfo();
    }
    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Periodo de prueba: 7 días de prueba para cuentas nuevas");
    }
    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición...");
    }
}
