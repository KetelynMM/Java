package aula_01;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_teste {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		for (int cor = 0; cor < 5 ; cor ++) {
			System.out.println("Digite alguma cor: ");
			cores.add(leia.nextLine());
		}
		
		System.out.println("Listando todas as cores: ");
		System.out.println(cores);
		
		System.out.println("Ordenando as cores: ");
		cores.sort(null);
		System.out.println(cores);
		
		leia.close();

	}

}
