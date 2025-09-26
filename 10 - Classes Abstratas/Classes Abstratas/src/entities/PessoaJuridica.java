package entities;

public class PessoaJuridica extends Pessoa {

    private int numeroFuncionarios;
    private String CNPJ;

    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios, String CNPJ) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
        this.CNPJ = CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public double calcularDivida () {
        dividaImposto = (numeroFuncionarios > 10) ? rendaAnual * 0.14 : rendaAnual * 0.16;

        return dividaImposto;
    }

    @Override
    public void mostrarDados() {
        System.out.print("\nNome da Empresa: " + nome
                + "\nCNPJ: " + CNPJ
                + "\nRenda anual: R$" + rendaAnual
                + "\nNúmeros de funcionários: " + numeroFuncionarios
                + "\nDivida: ");
        System.out.printf("R$%.2f\n", calcularDivida());
    }

}
