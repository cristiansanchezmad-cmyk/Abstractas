package olimpidas_invierno;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Equipo {



        private String pais;
        private ArrayList<Deportista> listaDeportistas;
        public Equipo(String pais){

            this.pais=pais;

        }






    public void  inscribirDeportista(String nombre, int dia, int mes, int año){

        for (Deportista inscrito:listaDeportistas){
            if (inscrito.getNombre().equals( nombre)){
                System.out.println("EL deportista llamado "+inscrito+" ya existe");
                return;
            }
        }
        Deportista inscrito= new Deportista (nombre, dia, mes, año);
        listaDeportistas.add(new Deportista (nombre,dia,mes,año));
        System.out.println("Deportista "+nombre+ " añadido");


    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Deportista> getListaDeportistas() {
        return listaDeportistas;
    }

    public void setListaDeportistas(ArrayList<Deportista> listaDeportistas) {
        this.listaDeportistas = listaDeportistas;
    }





    @Override
    public String toString() {
        return "Equipo{" +
                "pais='" + pais + '\'' +
                ", listaDeportistas=" + listaDeportistas +
                '}';
    }


}



