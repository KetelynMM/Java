package aula_04;

import java.util.Scanner;

public class vetores1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		boolean resposta = false;

			System.out.println("\n\tDigite o número que você deseja encontrar:");
			numero = leia.nextInt();

			for (int contador = 0; contador < 10; contador++) {
				if (vetorInteiros[contador] == numero) {
					System.out.println("O número " + numero + " está na posição [" + contador + "]");
					resposta = true;
				}
			}
				if (resposta == false) {
						System.out.println("O número " + numero + " não foi encontrado!");
					}
					
				leia.close();
				}

	}
