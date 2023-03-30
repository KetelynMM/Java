package testes;

import java.util.Scanner;

public class LacoCondicionais_teste {

	public static void main(String[] args) {

		boolean x = true;
		boolean y = false;

		if (x == true) {
			System.out.println("X é verdadeiro");
		}

		if (y) {
			System.out.println("Y é verdadeiro");
		}
		// ---

		int n1 = 4, n2 = 3, n3 = 4;

		if (n1 < 5) {
			System.out.println("O número 1 é menor do que 5.");
		}

		if (n1 < n2) {
			System.out.println("O número 1 é menor do que o número 2.");
		}

		if (n1 == n3)
			System.out.println("O número 1 e o número 3 são iguais.");
		// ----

		int idade = 18;
		boolean carteiraM = true;

		if (idade >= 18 && carteiraM == true) {
			System.out.println("Você pode dirigir.");
		}

		//

		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();

		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();

		media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.println("Parabéns, você foi aprovade!");
		} else {
			System.out.println("Infelizmente você foi reprovade...");
		}

		// --

		float nota01, nota02, media0;

		System.out.println("Digite a primeira nota: ");
		nota01 = leia.nextFloat();

		System.out.println("Digite a segunda nota: ");
		nota02 = leia.nextFloat();

		media0 = (nota01 + nota02) / 2;

		if (media0 >= 6) {
			System.out.println("Parabéns, você foi aprovade!");
		} else if (media0 == 5) {
			System.out.println("Alune de exame!");
		} else {
			System.out.println("Infelizmente você foi reprovade...");
		}
		
		//--
		
		int opcao;

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
		System.out.println("--Digite 2 para ver ler uma Frase Motivacional--");
		System.out.println("--Digite 3 para receber uma Indicação de música--");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Livro: O Alquimista");
			break;
		case 2:
			System.out.println(
                "Frase motivacional: Se você cair, levante! Não dá para andar deitado.");
			break;
		case 3:
			System.out.println("Música: AURORA - No Cure For Me.");
			break;
			//default:
			//System.out.println("Opção inválida!");
		}

	}

}
