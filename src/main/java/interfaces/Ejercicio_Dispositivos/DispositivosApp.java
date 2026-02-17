package interfaces.Ejercicio_Dispositivos;

import java.util.ArrayList;

public class DispositivosApp {
    static void main(String[] args) {
        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        Televisor t1= new Televisor("LG ", false);
        ParlanteInteligente p1= new ParlanteInteligente("Boost", false);
        AireAcondicionado a1= new AireAcondicionado("Siemens", false);
        listaDispositivos.add(t1);
        listaDispositivos.add(p1);
        listaDispositivos.add(a1);

        for (Dispositivo dispositivo: listaDispositivos){
            dispositivo.encender();
            dispositivo.mostrarEstado();
            dispositivo.apagar();
       if (dispositivo instanceof  ControlRemoto) {

           ((ControlRemoto) dispositivo).sincronizar();
       }

        }
    }
}
