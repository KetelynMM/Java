package aula_04;

import java.util.Scanner;

public class Matriz_Nota {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float[][] matriz = new float [2][4];
		float[] media = new float [2];
		float soma = 0.0f;
		
		for(int linha = 0; linha < matriz.length; linha ++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna ++) {
				
				System.out.printf("Digite a %dº nota do %dº participante: ", coluna + 1, linha + 1);
				matriz[linha][coluna] = leia.nextFloat();
				
				soma += matriz[linha][coluna];
				
			}
			
			media[linha] = soma/matriz[linha].length;
			
			soma = 0.0f;
			
		}
		
		for(float nota : media) {
			System.out.println(nota);
		}

	}

}
