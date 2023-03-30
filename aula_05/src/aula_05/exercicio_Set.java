package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class exercicio_Set {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		HashSet<Integer> setInteiros = new HashSet<Integer>();

		System.out.println("Digite 10 números inteiros sem repeti-los.");

		for (int num = 0; num < 10; num++) {
			System.out.println("\n\tDigite um número: ");
			setInteiros.add(leia.nextInt());
		}

		Iterator<Integer> numsetInteiros = setInteiros.iterator();

		while (numsetInteiros.hasNext()) {
			System.out.println(numsetInteiros.next());
		}

		leia.close();

	}

}
