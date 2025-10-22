package Map;

import java.util.Objects;

public class Candidato implements Comparable<Candidato>{

    private String nome;
    private Integer votos;
    private Integer numeroUrna;

    public Candidato(String nome, Integer numeroUrna) {
        this.nome = nome;
        this.numeroUrna = numeroUrna;
        votos = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public Integer getNumeroUrna() {
        return numeroUrna;
    }

    public void setNumeroUrna(int numeroUrna) {
        this.numeroUrna = numeroUrna;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Candidato candidato = (Candidato) o;

        // Candidato vai ser igual se tiver o nome e o número pra votação iguais
        return getNome().equals(candidato.getNome()) && getNumeroUrna().equals(candidato.getNumeroUrna());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getVotos());
    }

    @Override
    public int compareTo(Candidato o) {
        return this.equals(o) ? 0 : 1 ;
    }

    @Override
    public String toString() {
        return  "Candidato {" + "nome = " + nome + ", número de urna = " + numeroUrna +  ", votos = " + votos + " }";
    }

}
