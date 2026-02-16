package olimpidas_invierno;

public class JuegosInviernoApp {


    public static void main(String[] args) {


        Deportista olivia_smart = new Deportista("Olivia Smart", 1, 4, 1997);
        olivia_smart.inscribirse("Patinaje artístico");
        Deportista nil_llop = new Deportista("Nil Llop", 20, 9, 2002);
        nil_llop.inscribirse("Patinaje velocidad");
        Deportista nora_cornell = new Deportista("Nora Cornell", 2, 9, 2005);
        nora_cornell.inscribirse("Snowboard");
        nora_cornell.inscribirse("Big Air");
        Equipo espanya = new Equipo("ESPAÑA");

//        espanya.inscribirDeportista("Olivia Smart", 1, 4, 1997);
    }
}
//            espanya.inscribirDeportista(olivia_smart);
//            espanya.inscribirDeportista(nora_cornell);
//            espanya.inscribirDeportista(nil_llop)

