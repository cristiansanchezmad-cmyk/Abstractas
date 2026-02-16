package carrefour_ud6;

import java.util.ArrayList;

public class Seguridad extends Persona {



    private String empresa;
    ArrayList<String> armas;

    public Seguridad(int codigo, String nombre, double sueldo, String empresa) {
        super(codigo, nombre, sueldo);
        this.empresa=empresa;
        armas=new ArrayList<>();
    }


    public ArrayList<String> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<String> armas) {
        this.armas = armas;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

public void crearArmas(String arma){

        armas.add(arma);

}

    @Override public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El seguridad viene de la empresa "+empresa);
        System.out.println("El seguridad tiene las siguientes armas: ");
        for (String arma:armas){

            System.out.println(arma);

        }

    }

    @Override
    public void trabajar() {
        System.out.println("Vigilar sospechosos");
    }

    @Override
    public String toString() {
        return "Seguridad{" +
                "empresa='" + empresa + '\'' +
                ", armas=" + armas +
                '}';
    }

}
