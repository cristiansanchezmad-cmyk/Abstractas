package excepciones;

public class EdadValida extends RuntimeException {

    public EdadValida(String message) {

        super("Edad no permitida");
    }
}
