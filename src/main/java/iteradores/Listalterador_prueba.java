package iteradores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Listalterador_prueba {
    static void main(String[] args) {
        ArrayList<String> ias = new ArrayList<>(Arrays.asList("ChatGPT", "Gemini","Deepseek","Perplexity","Copilot","Qwen"));
        ListIterator<String> it =  ias.listIterator();

        while (it.hasNext()){

            System.out.println(it.nextIndex());
            String ia = it.next();
            System.out.println(it.nextIndex());
            System.out.println(ia);


        }

        while (it.hasPrevious()){

            String ia = it.previous();
            if (ia.equalsIgnoreCase("Qwen")){
                it.add("Deepseek");

            }
            System.out.println(ia);

        }
    }
}
