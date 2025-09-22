package app;

import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

    public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica("Mulher Maravilha", 50000, 2000, "123.456.789-00");
        PessoaFisica pf2 = new PessoaFisica("Super Homem", 75000, 1500, "987.654.321-00");

        PessoaJuridica pj1 = new PessoaJuridica("Jogando Games.CO", 500000, 9, "12.345.678/0001-00");
        PessoaJuridica pj2 = new PessoaJuridica("A lendaria", 400000, 200, "98.765.432/0001-00");

        pf1.mostrarDados();
        pf2.mostrarDados();
        System.out.println("\n-----------------------------------------------------------");
        pj1.mostrarDados();
        pj2.mostrarDados();

    }

}
