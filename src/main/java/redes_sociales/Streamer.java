package redes_sociales;

public class Streamer extends  Usuario{




    private int numero_retranmisiones;
    private int horas_directo;
    public Streamer(String nombre, int edad, String nombre_usuario, int seguidores, int numero_retranmisiones, int horas_directo) {

        super(nombre, edad, nombre_usuario, seguidores);
        this.numero_retranmisiones=numero_retranmisiones;
        this.horas_directo=horas_directo;
    }


    public int getNumero_retranmisiones() {
        return numero_retranmisiones;
    }

    public void setNumero_retranmisiones(int numero_retranmisiones) {
        this.numero_retranmisiones = numero_retranmisiones;
    }
    public int getHoras_directo() {
        return horas_directo;
    }

    public void setHoras_directo(int horas_directo) {
        this.horas_directo = horas_directo;
    }

    @Override public void mostrarInfo(){

        super.mostrarInfo();
        System.out.println("Retransmisiones realizadas "+numero_retranmisiones );
        System.out.println("Horas en directo: "+horas_directo);
    }


    @Override
    public String toString() {
        return "Streamer{" +
                "numero_retranmisiones=" + numero_retranmisiones +
                '}';
    }

}
