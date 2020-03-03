package oo;

public class Veiculo {

    private String marca; // null
    private String modelo; // null
    private String placa; // null
    private int ano; // 0
    private double preco; // 0
    private boolean novo; // false
    private int velocidade; // 0
    private int velocidadeMaxima; // 0
    private Motorista motorista;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public void acelerar(int aceleracao) {
        if (this.velocidadeMaxima>(this.velocidade+aceleracao)) {
            this.velocidade += aceleracao;
        } else {
            this.velocidade = this.velocidadeMaxima;
        }
    }

    // lá em cima
    private static final int VELOCIDADE_MINIMA = 0;

    public void frear(int frenagem) {
        if (this.velocidade-frenagem>VELOCIDADE_MINIMA) {
            this.velocidade -= frenagem;
        } else {
            this.velocidade = VELOCIDADE_MINIMA;
        }
    }



}
