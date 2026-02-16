package Plataforma_streaming;

public class PlanPremium extends Suscripcion{
    public PlanPremium(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    @Override public void mostrarInfo(){
        super.mostrarInfo();
    }
    @Override
    public void obtenerPeriodoPrueba() {
        System.out.println("Period de prueba: 14 días de prueba gatuita ");
    }
    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso todo el contenido en calidad en alta definción y decargas offline...");
    }
}
