package Plataforma_streaming;


import java.util.Random;

public class bus {

    public static final int TAM = 97;

    public static void main(String[] args) throws InterruptedException {

        int a = 0;
        int b = 0;
        int c= 0;
        System.out.println("\n<<<<<<<<<< AUTOBUSITO >>>>>>>>>>");
        Thread.sleep(3000);

        while (a < TAM && b < TAM  && c<TAM)  {
                Random ale = new Random();
              int num=  ale.nextInt(3)+1;
            if (num==1){

               a++;

            } else if (num==2) {

                b++;
            } else if (num==3) {
                c++;

            }





            limpiarPantalla();

            if (a < TAM && b < TAM  && c<TAM) {
                System.out.println(dibujarCarrera(a,b,c));


                Thread.sleep(70);
            }

        }

        System.out.println("\033[32m" + "EL AUTOBUSITO HA LLEGADO A SU DESTINO!!" + "\033[0m");

    }

    public static String dibujarCarrera(int n1, int n2, int n3) {

        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("________________    ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|   Yorch  |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117));

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n2)).append("________________    ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|  Raul  |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append("_".repeat(117));

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n3)).append("________________    ").append(" ".repeat(TAM - n3)).append("|\n");
        sb.append(" ".repeat(n3)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n3)).append("|\n");
        sb.append(" ".repeat(n3)).append("|  Christian |)").append(" ".repeat(TAM - n3)).append("|\n");
        sb.append(" ".repeat(n3)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n3)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }


}

