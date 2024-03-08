package one.digitalinovation.gof.strategy;

public class Robo {
    //o Robo é o contexto da nossa strategy
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
        //posso colocar qualquer implementação do Comportamento
    }

    public void mover() {
        comportamento.mover();
    }
}
