package oo;

public class Moto extends Veiculo {

    private boolean bau;

    public Moto(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public boolean isBau() {
        return bau;
    }

    public void setBau(boolean bau) {
        this.bau = bau;
    }
}
