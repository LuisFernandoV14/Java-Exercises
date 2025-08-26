package entities;

import java.util.Scanner;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	public Scanner sc = new Scanner(System.in);
	
	public void NetSalary() {
	
		System.out.println("\nEmpregado: " + name + ", $" + (grossSalary - tax) + "0"); // fiquei com preguiça de usar printf
		System.out.print("\nQual é a porcentagem que o salário de " + name + " vai aumentar? ");
		double percentage = sc.nextDouble();
		this.IncreaseSalary(percentage);
		
	}
	
	public void IncreaseSalary(double percentage) {
		
		grossSalary += grossSalary * percentage / 100;
		System.out.println("\nDados atualizados: " + name + ", $" + (grossSalary - tax) + "0"); // ainda to com preguiça de usar printf
		
	}
	
}
