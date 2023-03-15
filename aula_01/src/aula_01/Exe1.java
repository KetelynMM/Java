package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		Scanner leia = new Scanner(System.in);
		
		float nume1, nume2;
		
		System.out.println("Digite o valor do seu salário atual: ");
		nume1 = leia.nextFloat();
		
		System.out.println("Digite o seu Abono: ");
		nume2 = leia.nextFloat();
		
		System.out.println("\n\tSeu novo salário: " + df.format((nume1 + nume2)));
		
		leia.close();

	}

}
