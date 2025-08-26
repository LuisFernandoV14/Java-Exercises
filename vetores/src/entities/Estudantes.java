package entities;

public class Estudantes {

    private String nome;
    private String email;
    private int quarto_alugado;

    public Estudantes(String nome, String email, int quarto_alugado) {
        this.nome = nome;
        this.email = email;
        this.quarto_alugado = quarto_alugado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuarto_alugado() {
        return quarto_alugado;
    }

    public void setQuarto_alugado(int quarto_alugado) {
        this.quarto_alugado = quarto_alugado;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Email: " + email + "\n"
                + "Quarto alugado: " + quarto_alugado + "\n";
    }
}
