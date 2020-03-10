package oo;

public class Automovel extends Veiculo {

    private int numeroPortas;

    public Automovel(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
