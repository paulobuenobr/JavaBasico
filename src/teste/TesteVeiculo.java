package teste;

import oo.Cidade;
import oo.Estado;
import oo.Motorista;
import oo.Veiculo;

public class TesteVeiculo {

    public static void main(String[] args) {

        Veiculo v = new Veiculo();
        v.setMarca("VW");
        v.setModelo("FOX");
        v.setAno(2020);
        v.setPlaca("HGB-8989");
        v.setVelocidadeMaxima(200);
        v.acelerar(10);
        System.out.println(v.getVelocidade());
        v.acelerar(50);
        System.out.println(v.getVelocidade());
        v.acelerar(300);
        System.out.println(v.getVelocidade());

        Motorista m = new Motorista();
        m.setNome("João da Silva");
        m.setCnh("ALSKJ987342983");

        v.setMotorista(m);

        Estado e = new Estado();
        e.setNome("Santa Catarina");
        e.setSigla("SC");

        Cidade c = new Cidade();
        c.setNome("Florianópolis");
        c.setEstado(e);

        m.setCidade(c);

        System.out.println(v.getMotorista().getCidade().getEstado().getSigla());

    }
}
