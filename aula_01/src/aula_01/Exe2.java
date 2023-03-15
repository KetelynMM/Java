package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.0");
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("\tPrimeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("\tSegunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("\tTerceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\tQuarta nota: ");
		nota4 = leia.nextFloat();
		
		System.out.println("\n\tSua Média Final: " + df.format((nota1 + nota2 + nota3 + nota4)/4));
		
		leia.close();


	}

}
