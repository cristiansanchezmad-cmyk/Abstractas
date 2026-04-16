package practica1_Tema7;


import java.util.Scanner;

public class Cliente {
    static Scanner entrada = new Scanner(System.in);

    private String usuario;
    private String contrasenya;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        this.direccion = "Calle falsa, 123";
        this.promociones = false;
    }

    public  void crearPedido(){

        this.pedido = new Pedido();

    }
    /***
     * @author jorge
     * @param producto
     * En este método gestionamos la entrada de productos al carrito. Comprobaremos si el producto
     * existe en el catálogo; si existe, lo añadiremos al pedido o sumaremos uno a la cantidad si
     * ya estaba, actualizando también el importe total.
     * Si el usuario introduce algo mal, llamaremos a imprimirProductos para que elija de nuevo
     * y al final preguntaremos si quiere seguir comprando (S/N).
     */

    public void insertarProducto(Producto producto){

        boolean existe = false;
        boolean estado = true;
        while (estado) {
            for (Producto p : Producto.values()) {
                if (p.equals(producto)) {
                    existe = true;
                }
            }
            if (existe) {
                if (pedido.getPedido().containsKey(producto)) {
                    pedido.getPedido().put(producto, pedido.getPedido().get(producto) + 1);
                    estado = false;
                    pedido.actualizarImporteTotal(producto.getPrecio());

                } else {
                    pedido.getPedido().put(producto, 1);
                    estado = false;
                    pedido.actualizarImporteTotal(producto.getPrecio());
                }
            } else {
                System.out.println("Producto no reconocido. Elige otro...");
                AppClientes.imprimirProductos();
                producto = Producto.valueOf(entrada.nextLine().toUpperCase());

            }
            if (!estado){
                System.out.println("Has añadido " + producto + " con un precio de " + producto.getPrecio());
                System.out.println("Importe total del pedido: " + pedido.getImporteTotal());

                System.out.println("¿Quieres añadir mas productos (S/N)?");
                String res = entrada.nextLine();
                if (res.equalsIgnoreCase("s")){
                    estado = true;
                    AppClientes.imprimirProductos();
                    producto = Producto.valueOf(entrada.nextLine().toUpperCase());
                }
            }
        }

    }



    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isPromociones() {
        return promociones;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}