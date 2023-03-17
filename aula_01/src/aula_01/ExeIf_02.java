package aula_01;

import java.util.Scanner;

public class ExeIf_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero%2==0 && numero < 0) 
			System.out.println(numero + " é um número par e negativo.");
			else if(numero%2!=0 && numero > 0)
				System.out.println(numero + " é um número ímpar e positivo");
			else if(numero%2==0 && numero >= 0)
				System.out.println(numero + " é um número par e positivo");
			else if(numero%2!=0 && numero < 0)
				System.out.println(numero + " é um número ímpar e negativo");
	}
}
