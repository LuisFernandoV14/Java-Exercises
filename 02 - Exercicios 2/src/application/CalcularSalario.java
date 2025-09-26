package application;

import java.util.Scanner;
import entities.Employee;

public class CalcularSalario {

	public static void main(String[] args) {
		
		Scanner vasco =  new Scanner(System.in);
		Employee T1 = new Employee();
		
		System.out.print("Digite o nome do trabalhador: ");
		T1.name = vasco.nextLine();
		
		System.out.print("Digite o salário do trabalhador: ");
		T1.grossSalary = vasco.nextDouble();
		
		System.out.print("Digite o imposto: ");
		T1.tax = vasco.nextDouble();
		
		T1.NetSalary();
		
		vasco.close();
		
	}

}
