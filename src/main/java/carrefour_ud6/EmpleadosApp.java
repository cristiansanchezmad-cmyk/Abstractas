package carrefour_ud6;

import java.util.ArrayList;

public class EmpleadosApp {
    public static void main(String[] args) {
        Cajero jorge=new Cajero(147,"Jorge",1800);


        jorge.mostrarInfo();

        Reponedor carlos= new Reponedor(131, "Carlos", 1900, "1A");

        carlos.mostrarInfo();

        Seguridad raul=new Seguridad(121, "Raul",2000, "Casino");

        raul.crearArmas("navaja");
        raul.crearArmas("glock");

        raul.mostrarInfo();

        Persona manuel= new Cajero(1232,"Manuel",2000);
        ArrayList<Persona> listaEmpleados=new ArrayList<>();

        listaEmpleados.add(manuel);
        listaEmpleados.add(carlos);

        for (Persona persona: listaEmpleados){


        }

        fichar(manuel);
        fichar(carlos);

        jorge.trabajar();
        carlos.trabajar();
    }
    public static void fichar(Persona persona){

        System.out.println("Fichando...");
    }


}
