package one.digital.inovation.strategy;

public enum Robo {

    private Comportamento comportamento;
    
  
    public void setComportamento(Comportamento comportamento){
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }

    
}

