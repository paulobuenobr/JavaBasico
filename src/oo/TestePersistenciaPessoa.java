package oo;

public class TestePersistenciaPessoa {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Juvenal Pereira");
        pf.incluir();

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("ACME Ltda");
        pf.incluir();
    }

}
