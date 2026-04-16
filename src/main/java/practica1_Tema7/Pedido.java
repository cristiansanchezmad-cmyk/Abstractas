package practica1_Tema7;

import java.util.HashMap;

public class Pedido {




    private HashMap<Producto,Integer> pedido;
    private  double importeTotal;


    public Pedido() {
        this.pedido = new HashMap<>();
        this.importeTotal = 0;
    }

    /***
     * @author jorge
     * @param importe
     * En este método actualizaremos el acumulador del importe total del pedido sumándole
     * el precio que le pasemos por parámetro cada vez que se añada un producto.
     */

    public void actualizarImporteTotal(double importe){

        this.importeTotal += importe;


    }
    public static void aplicarPromo3x2(){


    }

    public static void aplicarPromo10(){



    }



    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedido(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    @Override
    public String toString() {
        return "Pedido{" +
                "pedido=" + pedido +
                ", importeTotal=" + importeTotal +
                '}';
    }


}