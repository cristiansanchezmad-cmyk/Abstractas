package Plataforma_streaming;

import java.util.ArrayList;

public class PlataformasStreaming {
    static void main(String[] args) {


        ArrayList<Suscripcion> listaSuscripcion= new ArrayList<>();

        PlanGratis p1= new PlanGratis("Gratis", 0);
        PlanBasico pb1= new PlanBasico("Basico", 10);
        PlanPremium pprem1=new PlanPremium("Premium",50);
        PlanFamiliar pf1=new PlanFamiliar("Familiar",40);

        listaSuscripcion.add(p1);
        listaSuscripcion.add(pb1);
        listaSuscripcion.add(pprem1);
        listaSuscripcion.add(pf1);

        for (Suscripcion suscripcion: listaSuscripcion){


            suscripcion.mostrarInfo();
            suscripcion.obtenerBeneficios();
            suscripcion.obtenerPeriodoPrueba();

        }

    }
}
