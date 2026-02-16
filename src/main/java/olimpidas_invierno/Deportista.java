package olimpidas_invierno;

import com.sun.jdi.ArrayReference;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Deportista {

    private String nombre;



    private LocalDate fecha_nacimiento;

    private ArrayList<Equipo> listaEquipos;

    private int medallas;
    private Equipo equipo;
    private ArrayList<String> listaModaliades;

    public Deportista(String nombre, int dia, int mes, int año) {
        this.nombre = nombre;
        this.medallas = medallas;



    }

    public int medallasTotales(int medallita) {

        int veces = medallasTotales(medallita);
        System.out.println(nombre + " Ha sido invitado " + veces + " veces");

        return veces;
    }

public void inscribirse(String Modalidades) {

    for (String modalidad : listaModaliades) {

        listaModaliades.add(modalidad);

    }

}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDateTime fecha_nacimiento) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Dime el año que vino el invitado: ");
            int año = teclado.nextInt();

            System.out.println("En que mes vino el invitado:");
            int mes = teclado.nextInt();

            System.out.println("Introduce el dia que vino el invitado:");
            int dia = teclado.nextInt();

            this.fecha_nacimiento = LocalDate.of(año,mes,dia);

    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    public ArrayList<String> getListaModaliades() {
        return listaModaliades;
    }

    public void setListaModaliades(ArrayList<String> listaModaliades) {
        this.listaModaliades = listaModaliades;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }


    @Override
    public String toString() {
        return "Deportista{" +
                "nombre='" + nombre + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", listaEquipos=" + listaEquipos +
                ", medallas=" + medallas +
                ", equipo=" + equipo +
                ", listaModaliades=" + listaModaliades +
                '}';
    }

}
