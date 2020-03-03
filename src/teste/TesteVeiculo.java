package teste;

import oo.Motorista;
import oo.Veiculo;

public class TesteVeiculo {

    public static void main(String[] args) {

        Veiculo v = new Veiculo();
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

        System.out.println(v.getMotorista().getNome().toLowerCase());

    }
}
