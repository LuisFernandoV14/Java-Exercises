package entities;

public class PessoaFisica extends Pessoa {

    private double gastosSaude;
    private String CPF;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude, String CPF) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
        this.CPF = CPF;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public double calcularDivida() {

        if (rendaAnual < 20000.00) {
            dividaImposto = rendaAnual * 0.15;
            dividaImposto -= gastosSaude * 0.5;
        }

        if (rendaAnual > 20000.00) {
            dividaImposto = rendaAnual * 0.25;
            dividaImposto -= gastosSaude * 0.5;
        }
        return dividaImposto;
    }

    @Override
    public void mostrarDados() {

        System.out.println("\nNome: " + nome
                + "\nCPF: " + CPF
                + "\nRenda anual: " + rendaAnual
                + "\nGastos com saude: " + gastosSaude
                + "\nDivida: ");
        System.out.printf("R$%.2f\n", calcularDivida());
    }

}
