package practica1_Tema7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MercaDam {

    private Set<Cliente> clientes;



    public MercaDam() {
        clientes = new HashSet<>();
    }

    /***
     * @author jorge
     * En este método generaremos de forma automática 5 clientes con credenciales aleatorias.
     * Utilizaremos un bucle y la clase Random para crear usuarios y contraseñas de 8 caracteres
     * mezclando letras y números, los añadiremos al Set de clientes y los mostraremos por consola.
     */
    public void generarClientes(){

        Random aleatorio = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String user = "";
        String contra ="";
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 8; i++) {
                int num = aleatorio.nextInt(62);
                int num2 = aleatorio.nextInt(62);
                user += caracteres.substring(num,(num+1));
                contra += caracteres.substring(num2,(num2+1));

            }
            Cliente client = new Cliente(user,contra);

            clientes.add(client);
            user = "";
            contra ="";
        }
        for (Cliente c : clientes){
            System.out.println(c);
        }


    }


    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Mercadam{" +
                "clientes=" + clientes +
                '}';
    }

}
