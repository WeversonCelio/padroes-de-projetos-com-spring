package one.digital.inovation.strategy;

public class Test {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defesivo = new comportamentoDefesivo  ();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

    }
    
    
}
