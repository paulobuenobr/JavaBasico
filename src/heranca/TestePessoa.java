package heranca;

import oo.Cidade;

public class TestePessoa {

    public static void main(String[] args) {

        Cidade c = new Cidade();
        c.setNome("Florianópolis");

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Paulo Bueno");
        pf.setCidade(c);
        // L ao final faz o Java entender que é um long e não um int
        pf.setCpf(5858585828L);

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Logikee Ltda.");
        pj.setCidade(c);
        // L ao final faz o Java entender que é um long e não um int
        pj.setCnpj(980237409823L);
    }

}
