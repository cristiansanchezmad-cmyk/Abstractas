package practica1_Tema7;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class AppClientes {





    /***
     * @author jorge
     * clase principal donde tendremos la mayor parte de la actividad y el main.
     * parametros static el
     * atributo Cliente llamado cliente donde guardaremos el cliente creado de forma automatica que haya pasado por el metodo autenticacion
     * Scanner para la entrada de datos en toda la clase
     */
        static Cliente cliente;
        static Scanner entrada = new Scanner(System.in);

        /***
         * Metodo main donde haremos la mayor parte de las llamadas a los diferentes metodos de la practica
         *
         */
        public static void main(String[] args) {

            MercaDam mercadam = new MercaDam();

            mercadam.generarClientes();


            autenticacion(mercadam.getClientes());
            Producto producto = Producto.valueOf(entrada.nextLine().toUpperCase());
            cliente.insertarProducto(producto);
            imprimirResumen();
            mostrarOpciones();
        }

        /***
         * @author jorge
         * @param clientes
         * en este metodo pasaremos un objeto cliente donde realizaremos una autentificacion del cliente, veremos si existe entre los que hemos generado
         * tendremos 3 intentos para acertar el usuario y la contraseña del cliente y si no es el caso mostraremos un mensaje y si acierta guardaremos el cliente en el atributo anteriormente mencionado cliente
         * e iniciaremos el metodo iniciarCompra
         */

        public static void autenticacion (Set<Cliente> clientes){

            int intentos = 3;
            boolean es = false;
            while(!es && intentos != 0) {
                System.out.println("=== COMPRA ONLINE EN MERCADAM ===");
                System.out.println("usuario: ");
                String usu = entrada.nextLine();
                System.out.println("contraseña: ");
                String contra = entrada.nextLine();

                Cliente cl = new Cliente(usu, contra);
                boolean en = false;
                for (Cliente c : clientes) {
                    if (c.getUsuario().equalsIgnoreCase(usu) && c.getContrasenya().equalsIgnoreCase(contra)) {
                        cliente = c;
                        iniciarCompra();
                        es = true;
                        en = true;
                        break;
                    }
                }
                if (!en){
                    intentos--;
                    System.out.println("Credenciales no validas. Intentos: " + intentos);

                }

                if (intentos == 0) {
                    System.out.println("ERROR DE AUTENTICACION");
                }
            }

        }


        /***
         * author jorge
         * En este metodo haremos una llamada a crearPedido en la clase Cliente que crea un pedido vacio, para tenerlo ya. y luego llamaremos al metodo imprimirProductos.
         */
        public static void iniciarCompra(){

            System.out.println("Bienvenido, " + cliente.getUsuario());

            cliente.crearPedido();

            imprimirProductos();


        }
        /***
         * @author jorge
         * En este metodo mostraremos por pantalla todos los productos disponibles en el enumerado Producto.
         * Utilizaremos un bucle for para recorrer todos los valores del enum e imprimirlos, y finalmente
         * pediremos al usuario que elija uno de ellos para continuar con su compra.
         */

        public static void imprimirProductos(){

            System.out.println("Elige un producto de la lista...");
            for (Producto p : Producto.values()){
                System.out.println(p);
            }
            System.out.println("=================");
            System.out.println("Elige un producto: ");

        }

        /***
         * @author jorge
         * En este método mostraremos por pantalla el contenido actual del carrito del cliente.
         * Recorreremos el HashMap del pedido para mostrar el número de producto y su cantidad,
         * precedido por un encabezado de "Resumen de tu carrito".
         */

        public static void imprimirResumen(){
            int num = 1;
            System.out.println("=== RESUMEN DE TU CARRITO DE LA COMPRA === ");
            System.out.println("Productos");
            for (Map.Entry<Producto,Integer> m : cliente.getPedido().getPedido().entrySet()){
                System.out.println(num + " " + m);
                num++;
            }

        }
        /***
         * @author jorge
         * En este método mostraremos un mensaje final de agradecimiento al cliente confirmando
         * que su pedido ha sido procesado. Además, le informaremos de que lo recibirá en la
         * dirección que tiene guardada en su ficha de cliente.
         */
        public static void imprimirDespedida(){

            System.out.println("=== GRACIAS POR SU PEDIDO  === ");
            System.out.println("Lo recibira en unos dias en la direccion " + cliente.getDireccion());

        }

        /***
         * @author jorge
         * En este método gestionaremos el menú final de la compra donde el usuario elige entre
         * aplicar promociones, ver el resumen ordenado o finalizar el pedido.
         * Si elige la opción 1, calcularemos el 3x2 y el 10% de descuento sobre el importe total
         * (si no se han aplicado ya) y si elige la 3, llamaremos a imprimirDespedida.
         */

        public static void mostrarOpciones(){

            System.out.println("¿Que desea hacer?");
            System.out.println("[1] Aplciar promos");
            System.out.println("[2] Mostrar resumen ordenado por uds");
            System.out.println("[3] Terminar pedido");
            String res = entrada.nextLine();
            switch (res){
                case "1":

                    cliente.getPedido().setImporteTotal(0);
                    if (!cliente.isPromociones()){

                        for (Map.Entry<Producto,Integer> m : cliente.getPedido().getPedido().entrySet()){

                            if (m.getValue()%3 == 0){
                                int cant = (m.getValue()/3)*2;
                                for (Producto p : Producto.values()){

                                    if (m.getKey() == p){
                                        cliente.getPedido().setImporteTotal(p.getPrecio()*cant);
                                    }

                                }
                            }


                        }

                        System.out.println("===========================");
                        System.out.println("PROMO 3x2 y 10% DESC. APLICADAS");
                        System.out.println("===========================");

                        cliente.getPedido().setImporteTotal(cliente.getPedido().getImporteTotal()*0.9);
                        imprimirResumen();

                    }else {
                        System.out.println("Ya has aplicado todas tus promociones: ");
                    }

                    break;
                case "2":

                    break;

                case "3":
                    imprimirDespedida();
                    break;
                default:
                    System.out.println("No existe esa opcion");
            }

        }
    }

