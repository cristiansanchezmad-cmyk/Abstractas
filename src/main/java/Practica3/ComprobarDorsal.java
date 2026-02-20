package Practica3;

public class ComprobarDorsal extends RuntimeException {
    public ComprobarDorsal() {
        super("El dorsal ya existe, debes elegir otro");
    }
}
