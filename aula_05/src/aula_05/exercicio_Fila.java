package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio_Fila {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Queue<String> filaBanco = new LinkedList<String>();
		byte opcao = 0;
		String nome;

		do {
			System.out.println("FILA DO BANCO\n");

			System.out.println("Opção Função");
			System.out.println("\n\t1- Adicionar cliente na fila");
			System.out.println("\t2- Listar todos os clientes da fila");
			System.out.println("\t3- Retirar clientes da fila");
			System.out.println("\t4- Sair");

			System.out.println("\nEscolha uma opção: ");
			opcao = leia.nextByte();

			switch (opcao) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				leia.nextLine();
				nome = leia.nextLine();

				filaBanco.add(nome);
				System.out.println("Cliente adicionado com sucesso!\n\n");

				break;

			case 2:
				if (filaBanco.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					System.out.println("\nClientes na fila: ");

					for (String elemento : filaBanco) {
						System.out.println(elemento);
					}

					System.out.println("\n");
				}

				break;

			case 3:
				if (filaBanco.isEmpty()) {
					System.out.println("A fila está vazia!");
				} else {
					filaBanco.poll();
					System.out.println("Cliente chamado com sucesso!\n\n");
				}
				for (String elemento : filaBanco) {
					System.out.println(elemento);
				}

				System.out.println("\n");

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
