package aula_01;

import java.util.Scanner;

public class ExeIf_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome, pergunta;
		boolean doacao = false;
		
		System.out.println("Digite o Nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? (S/N)");
		pergunta = leia.next() .toUpperCase();
		
		if (pergunta == "S")
			doacao = false;
		
		if (idade >= 60 && idade <= 69) {
			if (doacao)
				System.out.println(nome + " não está apto(a) para doar sangue.");
			else
				System.out.println(nome + " está apto(a) para doar!");
		}else if (idade < 18 || idade > 69)
			System.out.println(nome + " não está apto(a) para doar sangue.");
		else
			System.out.println(nome + " está apto(a) para doar!");	
		
	}

}
