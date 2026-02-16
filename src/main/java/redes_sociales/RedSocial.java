package redes_sociales;

public class RedSocial {

    static void main(String[] args) {
        Usuario Ana=new Usuario("Ana", 30,"@ana",231);
        System.out.println("Informacion del Usuario: ");
        Ana.mostrarInfo();
        System.out.println();
        Influencer Luis= new Influencer("Luis",25,"@luis_influencer",50000);
        Luis.crearColaboraciones("MediaMarkt");
        Luis.crearColaboraciones("Yoigo");
        Luis.crearColaboraciones("Temu");

        System.out.println("Informacion del Influencer: ");
        Luis.mostrarInfo();
        System.out.println();
        System.out.println("Información del Streamer: ");
        Streamer Carlos= new Streamer("Carlos",27,"@carlos_stream",2550,150,2000);
        Carlos.mostrarInfo();

        System.out.println();
        System.out.println("Información de la Persona Normal: ");
        Basico Pedro=new Basico("Pedro", 22,"@pedro123", 455);
        Pedro.mostrarInfo();

    }


}
