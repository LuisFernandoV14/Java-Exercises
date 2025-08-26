package entities;

public class Alunos {
	
	public String nome;	
	public double n1;
	public double n2;
	public double n3;
	
	public void checarResultados() {
		double pontosFaltantes = 60 - (n1 + n2 + n3);
		
		if (pontosFaltantes > 0) {
			
			System.out.printf("Nota Final = %.2f\nEstão faltando %.2f pontos\nREPROVADO", n1 + n2 + n3, pontosFaltantes);
			
		} else {
			
			System.out.printf("Nota Final = %.2f\nAPROVADO", n1 + n2 + n3);
			
		}
			
	}

}
