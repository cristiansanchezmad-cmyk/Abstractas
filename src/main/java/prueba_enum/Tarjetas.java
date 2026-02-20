package prueba_enum;

public enum Tarjetas {
    VISA(0), MAESTRO(1.5), MASTECARD(5);


    private final double comision;

    Tarjetas(double comision){
        this.comision=comision;
    }
    public double getComision() {
        return comision;
    }

}
