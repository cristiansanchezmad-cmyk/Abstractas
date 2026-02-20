package excepciones.CuentaBancaria;

import java.util.Scanner;

public class CajeroApp {
   static Scanner teclado=  new Scanner(System.in);
    static void main(String[] args) {

        CuentaBancaria Cuenta1= new CuentaBancaria(0);
        menuCajero(Cuenta1);

    }
    public static void menuCajero(CuentaBancaria cuentaBancaria){

        System.out.println("=== Cajero Automático ===");
        System.out.println("[1]. Consultar Saldo");
        System.out.println("[2]. Ingresar Dinero");
        System.out.println("[3]. Retirar Dinero");
        System.out.println("[X]. Salir");
        String valor= teclado.next();




           switch (valor.toUpperCase()) {
               case "1":
                   cuentaBancaria.ConsultarSaldo();
                menuCajero(cuentaBancaria);
                   break;
               case "2":
                   System.out.println("Introduce la cantidad a ingresar: ");
                   double ingreso = teclado.nextInt();
                   cuentaBancaria.IngresarDinero(ingreso);
                menuCajero(cuentaBancaria);
                   break;

               case "3":
                   System.out.println("Introduce la cantidad a retirar: ");
                   double retiro = teclado.nextInt();
                   cuentaBancaria.RetirarDinero(retiro);
                menuCajero(cuentaBancaria);
               case "X":
                   System.out.println("Saliendo...");
                   break;
           }
       }
    }


