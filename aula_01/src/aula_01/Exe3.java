package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		Scanner leia = new Scanner(System.in);
		
		float salariob, adicionaln, horase, des;
		
		System.out.println("\tSalário Bruto: ");
		salariob = leia.nextFloat();
		
		System.out.println("\tAdicional Noturno: ");
		adicionaln = leia.nextFloat();
		
		System.out.println("\tHoras Extras: ");
		horase = leia.nextFloat();
		
		System.out.println("\tDescontos: ");
		des = leia.nextFloat();
		
		System.out.println("\n\tSalário Líquido: " + df.format((salariob + adicionaln + (horase * 5) - des)));
		
		leia.close();

	}

}
