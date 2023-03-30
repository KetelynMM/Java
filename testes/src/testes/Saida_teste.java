package testes;

public class Saida_teste {

	public static void main(String[] args) {
		System.out.print("Olá Mundo!");
		
		byte bit = 127;
		short valor = 254;
		int quantidade = 1000;
		long identificador = 10000l;
		float altura = 25.4f; 
		double area = 45.4567;
		char tipo = 'A';
		boolean resposta = true;
		String palavra = "Generation";
		
		System.out.println(bit);
		System.out.println(valor);
		System.out.println(quantidade);
		System.out.println(identificador);
		System.out.println(altura);
		System.out.println(area);
		System.out.println(tipo);
		System.out.println(resposta);
		System.out.println(palavra);
		
		int quantidade3 = 1000;
		long identificador3 = 10000l;
		float altura3 = 25.4f; 
		double area3 = 45.4567;
		double tamanho2 = 650000000.00;
		char tipo3 = 'A';
		String palavra3 = "Generation";
		 
		System.out.printf("Variável quantidade = %d", quantidade3);
		System.out.printf("Variável identificador = %d", identificador3);
		System.out.printf("Variável altura = %.2f", altura3);
		System.out.printf("Variável area = %.2f", area3);
		System.out.printf("Variável tamanho = %e", tamanho2);
		System.out.printf("Variável tamanho = %E", tamanho2);
		System.out.printf("Variável tipo = %c", tipo3);
		System.out.printf("Variável palavra = %s", palavra3);
		
		int quantidade2 = 1000;
		long identificador2 = 10000l;
		float altura2 = 25.4f; 
		double area2 = 45.4567;
		double tamanho = 650000000.00;
		char tipo2 = 'A';
		String palavra2 = "Generation";
		 
		System.out.printf("Variável quantidade = %d", quantidade2);
		System.out.printf("\nVariável identificador = %d", identificador2);
		System.out.printf("\nVariável altura = %.2f", altura2);
		System.out.printf("\nVariável area = %.2f", area2);
		System.out.printf("\nVariável tamanho = %e", tamanho);
		System.out.printf("\nVariável tamanho = %E", tamanho);
		System.out.printf("\nVariável tipo = %c", tipo2);
		System.out.printf("\nVariável palavra = %s", palavra2);


	}

}
