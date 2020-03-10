package oo;

public class BicicletaMotor extends Veiculo {

    private boolean motorLigado;

    public BicicletaMotor(int velocidadeMaxima) {
        // Chamar o construtor da superclasse
        super(velocidadeMaxima);
    }

    public boolean isMotorLigado() {
        return this.motorLigado;
    }

    public void ligarMotor() {
        if (!motorLigado) {
            this.motorLigado = true;
            super.velocidadeMaxima *= 2;
        }
    }

    public void desligarMotor() {
        if (motorLigado) {
            this.motorLigado = false;
            super.velocidadeMaxima /= 2;
        }
    }

}
