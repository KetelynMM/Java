package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class exercico_Pilha {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> pilhaBanco = new Stack<String>();
		byte opcao = 0;
		String livro;

		do {
			System.out.println("PILHA DE LIVROS\n");

			System.out.println("Opção Função");
			System.out.println("\n\t1- Adicionar livro na pilha");
			System.out.println("\t2- Listar todos os livros da pilha");
			System.out.println("\t3- Retirar livro da pilha");
			System.out.println("\t4- Sair");

			System.out.println("\nEscolha uma opção: ");
			opcao = leia.nextByte();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do livro: ");
				leia.nextLine();
				livro = leia.nextLine();

				pilhaBanco.add(livro);
				System.out.println("Livro adicionado com sucesso!\n\n");
				
				for (String elemento : pilhaBanco) {
					System.out.println(elemento);
				}

				System.out.println("\n");

				break;

			case 2:
				if (pilhaBanco.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("\nLivros na pilha: ");

					for (String elemento : pilhaBanco) {
						System.out.println(elemento);
					}

					System.out.println("\n");
				}

				break;

			case 3:
				if (pilhaBanco.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					pilhaBanco.pop();
					System.out.println("Livro removido com sucesso!\n\n");
				}

				break;

			default:
				if (opcao != 4) {
					System.out.println("Opção Inválida!");
				}
			}

		} while (opcao != 4);

		System.out.println("Programa finalizado!");

		leia.close();

	}

}
