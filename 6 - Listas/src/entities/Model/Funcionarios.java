package entities.Model;

public class Funcionarios {

    private Integer ID;
    private String nome;
    private Double salario;

    public Funcionarios(Integer ID, Double salario, String nome) {
        this.ID = ID;
        this.salario = salario;
        this.nome = nome;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "ID: " + ID +
                "\nNome: " + nome +
                "\nSalario: " + salario + "\n";
    }

}
