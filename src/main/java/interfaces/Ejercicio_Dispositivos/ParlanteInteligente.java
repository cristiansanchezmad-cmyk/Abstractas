package interfaces.Ejercicio_Dispositivos;

public class ParlanteInteligente extends Dispositivo{
    public ParlanteInteligente(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void encender() {
        if (!isEstado()) {
            System.out.println("Activando parlante con comando de voz");
        }else{
            System.out.println("El parlante ya está encendido");
        }
    }
}
