package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2; 
		String nome;
		
		System.out.println("\nDigite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("\nDigite o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.println("\n\tSoma: " + df.format((numero1 + numero2)));
		System.out.println("\n\tSubtração: " + df.format((numero1 - numero2)));
		System.out.println("\n\tMultiplicação: " + df.format((numero1 * numero2)));
		System.out.println("\n\tDivisão: " + df.format((numero1 / numero2)));
		System.out.println("\n\tPotência: " + df.format(Math.pow(numero1, numero2)));
		System.out.println("\n\tRaíz Quadrada: " + df.format(Math.sqrt(numero1)));
		
		System.out.println("\nNome: " + nome);
		
		leia.close();
		
	}

}
