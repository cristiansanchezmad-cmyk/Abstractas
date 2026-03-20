public class Prueba_string {

    static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Calleu");
        sb.append("mantecao").append("Joaquin!!").append("adiós");

        sb.insert(16,"de limón");

        sb.replace(26,35,"Jacobo");

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
