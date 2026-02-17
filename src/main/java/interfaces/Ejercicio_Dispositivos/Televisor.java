package interfaces.Ejercicio_Dispositivos;

public class Televisor extends Dispositivo implements  ControlRemoto{
    public Televisor(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto");
    }

    @Override
    public void encender() {

        System.out.println("Encendiendo televisor...");
    setEstado(true);
    }
}
