package excepciones.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancaria {
    Scanner teclado= new Scanner(System.in);
    private double saldo;

    public CuentaBancaria(double saldo){

        this.saldo=saldo;
    }

    public void IngresarDinero(double ingreso){

        if (ingreso>3000){

        throw new LimiteDiario();
        }else if (ingreso<=0 ) {
            throw new ImporteValido();
        }else{
            saldo += ingreso;
            System.out.println("Cantidad ingresada: " + ingreso);
            System.out.println("Saldo total " + saldo);
        }

    }
    public void RetirarDinero(double retiro){
        if (retiro>saldo){
            throw new SaldoInsufiente();

        } else if (retiro>600) {
            throw new LimiteDiario();
        } else if (retiro<=0) {
            throw new ImporteValido();
        }else {
            saldo -= retiro;
            System.out.println("Cantidad retirada: " + retiro);
            System.out.println("Saldo total: " + saldo);
        }
        }

    public void ConsultarSaldo(){

        System.out.println("Tu saldo es de "+saldo+" euros.");
    }
}
