package application;

import models.Endereco;
import models.Gerente;
import models.OperadorDeCaixa;
import models.Vendedor;

public class Program {
    public static void main(String[] args) {

        /*Endereco endereco = new Endereco();
        endereco.setRua("Endereço para essa rua");
        System.out.println(endereco.getRua());*/

        Endereco endereco = new Endereco(" tal", " tal", " tal");
        System.out.println(endereco);

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Daiane");
        vendedor.setDocumento("123456");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("DaianeOp", "123456", 2000d, endereco);
        System.out.println(operadorDeCaixa);
        System.out.println("-------");

        Gerente gerente = new Gerente();
        gerente.setNome("Lala");
        gerente.setDocumento("4545454");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);
        System.out.println(gerente);
    }

}
