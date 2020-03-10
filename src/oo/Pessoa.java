package oo;

// Classe abstrata não gera objetos e pode ter métodos abstratos
public abstract class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // métodos abstratos não contém implementação, devendo obrigatoriamente
    // ser implementados nas sub-classes
    public abstract void validarRegistro();
}
