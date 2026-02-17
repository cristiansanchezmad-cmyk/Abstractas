package interfaces;

public class Superman extends SuperHeroe implements Volador, Ataques{



    @Override
    public void volar() {
        System.out.println("Sobrevolando la ciudad vigilando a los malos...");
    }

    @Override
    public void rayoLaser() {
        System.out.println("Disparando laser con los ojos");
    }

    @Override
    public void alientoHielo() {
        System.out.println("Ais frio yelo...");
    }
}
