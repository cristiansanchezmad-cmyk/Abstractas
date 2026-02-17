package interfaces;

public class SpiderMan extends SuperHeroe  implements  Volador
{
    @Override
    public void volar() {
        System.out.println("Saltando edificios con la tela de araña!!");
    }
}
