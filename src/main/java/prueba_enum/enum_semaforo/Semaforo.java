package prueba_enum.enum_semaforo;

public enum Semaforo {

    AMARILLO, ROJO, VERDE;



    public Semaforo siguiente() {

        switch (this) {

            case AMARILLO:

                return ROJO;

            case VERDE:
                return AMARILLO;

            case ROJO:
                return VERDE;


        }
return null;

    }
}
