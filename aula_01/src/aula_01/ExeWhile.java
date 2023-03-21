package aula_01;

import java.util.Scanner;

public class ExeWhile {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, categoria, desenvolvedorasBack = 0, mulheresFront = 0, maiores40Mobile = 0, mulheresMenores30Full = 0;
		char continua = 'S';

		while (continua == 'S') {

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.println("Digite o seu sexo: (1-Masculino, 2-Feminino, 3-Outros)");
			sexo = leia.nextInt();

			System.out.println("Digite sua categoria (1-Backend, 2-Frontend, 3-Mobile, 4-Fullstack): ");
			categoria = leia.nextInt();

			if (categoria == 1) {
				desenvolvedorasBack++;
			}
			if (sexo == 2 && categoria == 2) {
				mulheresFront++;
			}		
			if (idade > 40 && sexo == 1 && categoria == 3) {
				maiores40Mobile++;
			}
			if (idade < 30 && sexo == 2 &&  categoria == 4) {
				mulheresMenores30Full++;
			}

			System.out.println("Deseja continuar? (S/N)");
			continua = leia.next().toUpperCase().charAt(0);
		}

		System.out.println("O número de pessoas desenvolvedoras Backend: " + desenvolvedorasBack);
		System.out.println("O número de mulheres desenvolvedoras Frontend:" + mulheresFront);
		System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos: " + maiores40Mobile);
		System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos: " + mulheresMenores30Full);

		leia.close();
	}
}
