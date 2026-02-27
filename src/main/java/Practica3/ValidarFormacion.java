package Practica3;

public class ValidarFormacion extends RuntimeException {
    public ValidarFormacion() {
        super(
                "La formacion escogida no cumple con el formato establecido");
    }
}