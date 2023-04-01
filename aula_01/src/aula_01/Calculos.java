package aula_01;

import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			Calculos calc = new Calculos();
			
			int opcao;
			double numero1, numero2;
			
			while(true) {
			
				System.out.println("1-Soma");
				System.out.println("2-Subtração");
				System.out.println("3-Multiplicação");
				System.out.println("4-Divisão");			
				System.out.println("Qual a operação?");
				opcao = leia.nextInt();
				
				if (opcao == 0) {
					sobre();
					leia.close();
					System.exit(0);
				}
				
				System.out.println("Digite o 1º numero");
				numero1 = leia.nextDouble();
				
				System.out.println("Digite o 2º numero");
				numero2 = leia.nextDouble();
				
				switch(opcao) {
					case 1 -> System.out.println("Soma: " + calc.soma(numero1, numero2));
					case 2 -> System.out.println("Subtração: " + calc.subtracao(numero1, numero2));
					case 3 -> System.out.println("Miltiplicação: " + calc.multiplicacao(numero1, numero2));
					case 4 -> System.out.println("Divisão: " + calc.divisao(numero1, numero2));
					default -> System.out.println("Opção inválida!");
				}
			}
			
		}

		private String soma(double numero1, double numero2) {
		// TODO Auto-generated method stub
		return null;
	}

		private String subtracao(double numero1, double numero2) {
		// TODO Auto-generated method stub
		return null;
	}

		private String multiplicacao(double numero1, double numero2) {
		// TODO Auto-generated method stub
		return null;
	}

		private String divisao(double numero1, double numero2) {
		// TODO Auto-generated method stub
		return null;
	}

		public static void sobre() {
			System.out.println("Calculadora com Métodos");
			System.out.println("Rafael Queiróz");
		}

	}

