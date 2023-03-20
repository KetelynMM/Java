package aula_01;

import java.util.Scanner;

public class ExeSw_01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigo, quantidade, total;

		System.out.println("Cardápio: \n");
		System.out.println("1\tCachorro-Quente: \tR$ 10,00");
		System.out.println("2\tX-Salada: \t\tR$ 15,00");
		System.out.println("3\tax-Bacon: \t\tR$ 18,00");
		System.out.println("4\tBauru: \t\t\tR$ 12,00");
		System.out.println("5\tRefrigerante: \t\tR$  8,00");
		System.out.println("6\tSuco de Laranja: \tR$ 13,00\n\n");

		System.out.println("Digite o Código do seu produto: ");
		codigo = leia.nextInt();
		System.out.println("Quantas unidades você gostaria de levar desse produto? ");
		quantidade = leia.nextInt();

		switch (codigo) {
		case 1:
			System.out.println("\n\tO valor total da sua compra é: " + quantidade*10 + " reais");
			break;
		case 2:
			System.out.println("\n\tO valor total da sua compra é: " + quantidade*15 + " reais");
			break;
		case 3:
			System.out.println("\n\tO valor total da sua compra é: " + quantidade*18 + " reais");
			break;
		case 4:
			System.out.println("\n\tO valor total da sua compra é: " + quantidade*12 + " reais");
			break;
		case 5:
			System.out.println("\n\tO valor total da sua compra é: " + quantidade*8 + " reais");
			break;
		case 6:
			System.out.println("\n\tO valor total da sua compra é: " + quantidade*13 + " reais");
			break;
		default:
			System.out.println("\n\tProduto inválido!");
			break;

		}
	}
}
