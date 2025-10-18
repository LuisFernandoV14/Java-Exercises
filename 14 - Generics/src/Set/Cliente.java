package Set;

import java.time.LocalDateTime;
import java.util.Objects;

public class Cliente implements Comparable<Cliente>{

    private String nome;
    private LocalDateTime dataAcesso;

    public Cliente(String nome, String dataAcesso) {
        this.nome = nome;
        this.dataAcesso = LocalDateTime.parse(dataAcesso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataAcesso() {
        return dataAcesso;
    }

    public void setDataAcesso(LocalDateTime dataAcesso) {
        this.dataAcesso = dataAcesso;
    }

    @Override
    public int compareTo(Cliente o) {

        if (o.getNome() == null) {
            return 0;
        }

        return this.nome.compareTo(o.getNome());

    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataAcesso);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;

        return Objects.equals(nome, cliente.nome);
    }

    @Override
    public String toString() {
        return "Cliente [nome = " + nome + ", dataAcesso = " + dataAcesso + "]";
    }
}
