package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		
DecimalFormat df = new DecimalFormat("###,###,##0.0");
		
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4;
		
		System.out.println("\t1 Número: ");
		n1 = leia.nextFloat();
		
		System.out.println("\t2 Número: ");
		n2 = leia.nextFloat();
		
		System.out.println("\t3 Número: ");
		n3 = leia.nextFloat();
		
		System.out.println("\t4 Número: ");
		n4 = leia.nextFloat();
		
		System.out.println("\n\tDiferença entre os produtos: " + df.format((n1 * n2) - (n3 * n4)));
		
		leia.close();

	}

}
