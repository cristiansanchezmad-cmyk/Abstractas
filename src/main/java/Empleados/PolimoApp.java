package Empleados;

import java.util.ArrayList;

public class PolimoApp {

    static void main(String[] args) {

        Desarrollador d1=new Desarrollador();

        Gerente g1= new Gerente();


        ArrayList<Empleado> listaEmpleados= new ArrayList<>();

        listaEmpleados.add(d1);
        listaEmpleados.add(g1);

        System.out.println("=== Usando el array polimórfico ===");
        for (Empleado empleado: listaEmpleados){

            empleado.realizarTarea();
        }
for (Empleado e: listaEmpleados){
    asignarTarea(e);

}
    }



    public static void asignarTarea(Empleado empleado){

        System.out.println("Asignando tarea a empleado...");
         empleado.realizarTarea();
    }
}
