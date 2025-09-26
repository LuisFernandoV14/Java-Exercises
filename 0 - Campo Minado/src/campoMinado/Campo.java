/* 
* Essa é a tentativa 1 de tentar criar um campo minado em Java, vou parar por aqui por que eu decidi
* que é melhor fazer as minas serem uma classe e que tenham os atributos "mina" e "minasProximas" para
* mostrar pro jogador se a coordenada possui uma mina e quantas minas proximas tem dessa coordenada
* 
* Mas eu nao sei usar classe ainda :(((( vou continuar fazendo o curso
* 
* Esse código só printa um monte de 1s e 0s no console, a ideia era que os 1s fossem onde tem minas
*/

package campoMinado;

import java.util.Scanner;
import java.util.Random;

public class Campo {

	public static void main(String[] args) {
		
		Scanner escolha = new Scanner(System.in); // escolha do usuário
		Random semente = new Random(); // variavel que eu vou usar para gerar aleatoriamente as minas
		
		// criação da matriz //
		int i, j;
		System.out.println("Qual é a largura do campo que você deseja jogar?");
		i = escolha.nextInt();
		System.out.println("Qual é a altura do campo que você deseja jogar?");
		j = escolha.nextInt();
		
		
		String[][] campoDeMinas = new String[i][j];
		
		for(int a = 0 ; a < campoDeMinas.length; a++) {
			for(int b = 0; b < campoDeMinas[a].length; b++) {
				
				campoDeMinas[a][b] = (semente.nextInt(2) == 1) ? "1" : "0";
				
			}
			
		}
		
		
		for(int a = 0 ; a < campoDeMinas.length; a++) {
			for(int b = 0; b < campoDeMinas[a].length; b++) {
				
				System.out.print(campoDeMinas[a][b] + " ");
				
			}
			System.out.printf("\n");
			
		}
		
		
		
	}

}
