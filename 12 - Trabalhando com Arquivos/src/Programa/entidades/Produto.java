package Programa.entidades;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Produto {

    private String nome;
    private Integer qnt;
    private Double preco;
    private Double total;

    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    private DecimalFormat DDeci = new DecimalFormat("#.00", symbols);

    // Construtor -----------------------------------------------------------------------------------

    public Produto(String nome, Integer qnt, Double preco) {
        this.nome = nome;
        this.qnt = qnt;
        this.preco = preco;
    }

    // Getter e Setter -------------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQnt() {
        return qnt;
    }

    public void setQnt(Integer qnt) {
        this.qnt = qnt;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getTotal() {
        return total;
    }

    // Métodos Implementados -------------------------------------------------------------------------

    @Override
    public String toString() {
        return getNome() + ", R$" + DDeci.format(getPreco()) + ", " + getQnt() + "\n"; // Imprime do jeito que tá no arquivo
    }

    public String imprimir() {
        return getNome() + ", R$" + DDeci.format(calcularTotal()) + "\n"; // Imprime o nome e o preço total
    }

    public Double calcularTotal(){
        total = preco * qnt;
        return total;
    }

}
