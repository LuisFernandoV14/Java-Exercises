package application;

import java.util.Scanner;
import entities.Alunos;

public class CalcularNota {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Alunos A1 = new Alunos();
		
		System.out.print("Digite o nome do aluno: ");
		A1.nome = sc.nextLine();
		
		System.out.println("Digite as três notas do aluno:");
		A1.n1 = sc.nextDouble();
		A1.n2 = sc.nextDouble();
		A1.n3 = sc.nextDouble();
		
		A1.checarResultados();
		
		sc.close();		
	}

}