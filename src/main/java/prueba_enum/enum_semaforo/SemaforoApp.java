package prueba_enum.enum_semaforo;

public class SemaforoApp {

    static void main(String[] args) {

        Semaforo color= Semaforo.ROJO;


        for (int i = 0; i < 10; i++) {

            System.out.println(color.name());
            color=color.siguiente();
        }
    }
}
