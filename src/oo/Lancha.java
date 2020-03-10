package oo;

public class Lancha extends Veiculo {

    private boolean cabine;
    private boolean turbo;

    public Lancha(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    public boolean isCabine() {
        return cabine;
    }

    public void setCabine(boolean cabine) {
        this.cabine = cabine;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    // Polimorfismo de método
    @Override
    public void acelerar(int aceleracao) {
        if (turbo) {
            aceleracao*=2;
        }
        super.acelerar(aceleracao);
    }
}
