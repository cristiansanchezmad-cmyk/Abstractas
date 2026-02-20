package prueba_enum.Dificultad;

public enum Dificultado {
    FACIL(2), MEDIO(4), DIFICIL(8), EXPERTO(10);



    private  final int multiplicador;

    Dificultado(int multiplicador) {
        this.multiplicador = multiplicador;

    }
    public int getMultiplicador() {
        return multiplicador;
    }

}
