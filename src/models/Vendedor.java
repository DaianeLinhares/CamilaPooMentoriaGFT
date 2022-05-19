package models;

public class Vendedor extends  FuncionarioCLT implements ICalculaBonificacao{
private Double valorDaBonitifacao;

    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco +
                ", bonificação" + valorDaBonitifacao +
                '}';
    }

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorDaBonitifacao = this.valorSalario * (porcentagemBonificacao/100d);
    }
}
