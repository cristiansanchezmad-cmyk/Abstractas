package diccionario;

import java.util.*;

public class diccionario {
    static Scanner teclado = new Scanner(System.in);
    static Map<String, String> diccionario = new HashMap<>();
    static Random ale = new Random();

    public static void main(String[] args) {
        int conttrue = 0;
        int contalse = 0;
        int contquest = 0;
        int aciertos = 0;

        System.out.println("*** Diccionario ***");

        while (true) {
            String palabraEsp = palabraAleatoria();

            System.out.println(palabraEsp + " - Pista: " + primeraLetraTraduccion(palabraEsp));
            System.out.println("Indique la respuesta (o 'fin' para salir):");
            String res = teclado.nextLine();

            if (res.equalsIgnoreCase("fin")) {
                break;
            }

            contquest++;
            String correcta = diccionario.get(palabraEsp);

            if (!res.equalsIgnoreCase(correcta)) {
                System.out.println("¡NO! La respuesta correcta es " + correcta);
                contalse++;
            } else {
                System.out.println("Acertaste");
                conttrue++;
            }

            aciertos = ( conttrue / contquest) * 100;
            System.out.println("-----------------------");
        }

        System.out.println("FIN DEL PROGRAMA");
        System.out.println("Total preguntas: " + contquest);
        System.out.println("Total aciertos: " + conttrue);
        System.out.println("Total errores: " + contalse);
        System.out.println("Aciertos: "+aciertos);
    }

    static {
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("tierra", "earth");
        diccionario.put("aire", "air");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("ventana", "window");
        diccionario.put("puerta", "door");
        diccionario.put("coche", "car");
        diccionario.put("calle", "street");
        diccionario.put("ciudad", "city");
        diccionario.put("pueblo", "town");
        diccionario.put("escuela", "school");
        diccionario.put("maestro", "teacher");
        diccionario.put("estudiante", "student");
        diccionario.put("amigo", "friend");
        diccionario.put("familia", "family");
        diccionario.put("padre", "father");
        diccionario.put("madre", "mother");
        diccionario.put("hermano", "brother");
        diccionario.put("hermana", "sister");
        diccionario.put("comida", "food");
        diccionario.put("pan", "bread");
        diccionario.put("leche", "milk");
        diccionario.put("queso", "cheese");
        diccionario.put("carne", "meat");
        diccionario.put("pescado", "fish");
        diccionario.put("fruta", "fruit");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("platano", "banana");
        diccionario.put("dia", "day");
        diccionario.put("noche", "night");
        diccionario.put("mañana", "morning");
        diccionario.put("tarde", "afternoon");
        diccionario.put("semana", "week");
        diccionario.put("mes", "month");
        diccionario.put("año", "year");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");
        diccionario.put("cielo", "sky");
        diccionario.put("mar", "sea");
        diccionario.put("rio", "river");
        diccionario.put("montaña", "mountain");
        diccionario.put("bosque", "forest");
        diccionario.put("camino", "path");
        diccionario.put("llave", "key");
        diccionario.put("papel", "paper");
        diccionario.put("lapiz", "pencil");
        diccionario.put("boligrafo", "pen");
        diccionario.put("ordenador", "computer");
        diccionario.put("telefono", "phone");
        diccionario.put("musica", "music");
        diccionario.put("cancion", "song");
        diccionario.put("pelicula", "movie");
        diccionario.put("juego", "game");
        diccionario.put("deporte", "sport");
        diccionario.put("futbol", "football");
        diccionario.put("baloncesto", "basketball");
        diccionario.put("correr", "run");
        diccionario.put("caminar", "walk");
        diccionario.put("saltar", "jump");
        diccionario.put("hablar", "speak");
        diccionario.put("escuchar", "listen");
        diccionario.put("mirar", "look");
        diccionario.put("ver", "see");
        diccionario.put("pensar", "think");
        diccionario.put("aprender", "learn");
        diccionario.put("enseñar", "teach");
        diccionario.put("trabajar", "work");
        diccionario.put("estudiar", "study");
        diccionario.put("vivir", "live");
        diccionario.put("amar", "love");
        diccionario.put("odiar", "hate");
        diccionario.put("ayudar", "help");
        diccionario.put("abrir", "open");
        diccionario.put("cerrar", "close");
        diccionario.put("entrar", "enter");
        diccionario.put("salir", "leave");
        diccionario.put("empezar", "start");
        diccionario.put("terminar", "finish");
        diccionario.put("comprar", "buy");
        diccionario.put("vender", "sell");
        diccionario.put("pagar", "pay");
        diccionario.put("ganar", "win");
        diccionario.put("perder", "lose");
    }

    public static String palabraAleatoria() {
        ArrayList<String> lista = new ArrayList<>(diccionario.keySet());
        int aleatorio = ale.nextInt(lista.size());
        return lista.get(aleatorio);
    }

    public static String primeraLetraTraduccion(String primera) {
        String traduccion = diccionario.get(primera);
        if (traduccion != null && !traduccion.isEmpty()) {
            return traduccion.substring(0, 1);
        }
        return " ";
    }

    public static void nuevoPar() {
        System.out.println("Introduce tu palabra en español");
        String palabra = teclado.nextLine();
        System.out.println("Introduce tu palabra en inglés");
        String word = teclado.nextLine();
        if (!diccionario.containsKey(palabra)) {
            diccionario.put(palabra, word);
        } else {
            System.out.println("Esta palabra ya existe");
        }
    }

    public static void traducir() {
        System.out.println("Introduce una palabra a traducir");
        String traducida = teclado.nextLine();
        if (diccionario.containsKey(traducida)) {
            System.out.println("Su traduccion es: " + diccionario.get(traducida));
        }
    }
}