package models;
// classe que vai funcionar só para herança, não pode chamar direto no Main(Program)
// precisa estender para classe que quer ter esses atributos
public abstract class FuncionarioPJ {
    protected String nome;
    protected String documento;
    protected  Endereco endereco;
    protected Double valorSalario;
    protected Integer horasTrabalhadas;
    protected Double valorHora;
    protected Double valorRemunerocao;


    public void calculaRemuneracao(){
        this.valorRemunerocao = this.horasTrabalhadas * this.valorHora;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public FuncionarioPJ() {
    }

    public FuncionarioPJ(String nome, String documento, Endereco endereco, Double valorSalario, Integer horasTrabalhadas, Double valorHora, Double valorRemunerocao) {
        this.nome = nome;
        this.documento = documento;
        this.endereco = endereco;
        this.valorSalario = valorSalario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.valorRemunerocao = valorRemunerocao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }



    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemunerocao() {
        return valorRemunerocao;
    }

    public void setValorRemunerocao(Double valorRemunerocao) {
        this.valorRemunerocao = valorRemunerocao;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }
}
