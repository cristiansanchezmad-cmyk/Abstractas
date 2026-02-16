package carrefour_ud6;

public class Reponedor extends Persona {



    private String pasillo;

    public Reponedor(int codigo, String nombre, double sueldo, String pasillo) {
        super(codigo, nombre, sueldo);
        this.pasillo=pasillo;
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }

    @Override public void mostrarInfo(){

        super.mostrarInfo();
        System.out.println("Este reponedor esta asingado al pasillo "+pasillo);


    }

    @Override
    public void trabajar() {
        System.out.println("Reponiendo existencias...");
    }

    @Override
    public String toString() {
        return "Reponedor{" +
                "pasillo=" + pasillo +
                '}';
    }

}

