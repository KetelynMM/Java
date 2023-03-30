package testes;

import java.util.Scanner;

public class LacosDeRepetição_teste {

	public static void main(String[] args) {

		String nome1, nome2, nome3;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o 1º nome: ");
		nome1 = leia.nextLine();
		System.out.println("O 1º nome é: " + nome1);

		System.out.println("\nDigite o 2º nome: ");
		nome2 = leia.nextLine();
		System.out.println("O 2º nome é: " + nome2);

		System.out.println("\nDigite o 3º nome: ");
		nome3 = leia.nextLine();
		System.out.println("O 3º nome é: " + nome3);
		
		//---
		int numero, contador;

        System.out.println("Digite a Tabuada que você deseja calcular: ");
        numero = leia.nextInt();

        for (contador = 1; contador <= 10; contador++) {
            System.out.println(numero + " x " + contador + " = " + numero * contador);
        }
        
        //---
        
        String continua = "s";
        int numero1, numero2, resultado;

        while (!continua.equals("n")) {
            System.out.println("Digite primeiro valor: ");
            numero1 = leia.nextInt();

            System.out.println("Digite segundo valor: ");
            numero2 = leia.nextInt();

            resultado = numero1 + numero2;

            System.out.println("O resultado da soma é: " + resultado);

            System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
            System.out.println("\nDeseja somar dois valores?");
            System.out.println("\nDigite s para sim OU digite n para não: ");
            continua = leia.next();
            System.out.println("++++++++++++++++++++++++++++++++++");
        }
        
        int resultado0, numero0, contador0 = 1;

        while (contador0 < 4) {
            System.out.println("Digite o " + contador0 + "º número:");
            numero0 = leia.nextInt();

            resultado0 = numero0 * 3;
            System.out.println(numero0 + " x 3 = " + resultado0);
            System.out.println(
                "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
            contador0++;
        }
        System.out.println("\t\t_________Fim do programa_________");
        
        // do...while -> while: exemplo 05 (não irá funcionar pq o contador é maior do que 2)
        
        int numero3, resultado3, contador3 = 3;
        
        while (contador3 <= 2) {
            System.out.println("\nDigite um número inteiro: ");
            numero3 = leia.nextInt();
            resultado3 = numero3 * 5;
            System.out.println("\nO resultado da multiplicação é: " + resultado3);
        }
        
        // exemplo 06 -> do...while
        
        int numero4, resultado4, contador4 = 3;

        do {
            System.out.println("\nDigite um número inteiro: ");
            numero4 = leia.nextInt();

            resultado4 = numero4 * 5;

            System.out.println("\nO resultado da multiplicação é: " + resultado4);

        } while (contador4 <= 2);

	}

}
