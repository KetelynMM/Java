package aula_01;

import java.util.Scanner;

public class ExeSw_02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float n1, n2;
		int operacao;

		System.out.println("Digite um número: ");
		n1 = leia.nextFloat();

		System.out.println("Digite outro número: ");
		n2 = leia.nextFloat();

		System.out.println("1\tSoma +");
		System.out.println("2\tSubtração -");
		System.out.println("3\tMulriplicação *");
		System.out.println("4\tDivisão /");

		System.out.println("Digite o número da operação que deseja fazer na conta: ");
		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Total: " + (n1 + n2));
			break;
		case 2:
			System.out.println("Total: " + (n1 - n2));
			break;
		case 3:
			System.out.println("Total: " + (n1 * n2));
			break;
		case 4:
			System.out.println("Total: " + (n1 / n2));
			break;
		default:
			System.out.println("Operação Inválida");
			break;

		}

	}

}
