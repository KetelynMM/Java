package testes;

public class operadores_teste {

	public static void main(String[] args) {
	
		int x = 4;
		int y = 2;
		int z = 3;
		int w = -5;
		
		System.out.println("Soma (4+2): " + (x + y));
		System.out.println("\nSoma com numero negativo (4 + (-5)): " + (x + w));
		System.out.println("\nSubtração (4-2): " + (x - y));
		System.out.println("\nMultiplicação (4*2): " + (x * y));
		System.out.println("\nDivisão (4/2): " + (x / y));
		System.out.println("\nMódulo (resto da divisão): " + (x % 2));
		System.out.println("\nMódulo (resto da divisão): " + (z % 2));
		
		String texto01 = "Generation";
		String texto02 = "Brasil";
		String texto03 = " ";
				
		System.out.println("Concatenar texto01 e texto02: " + texto01 + texto02);
		System.out.println("\nConcatenar texto02 e texto01: " + texto02 + texto01);
		System.out.println("\nConcatenar texto01, texto03 e texto02: " + texto01 + texto03 + texto02);
		

		int x2 = 10;
		int y2 = 8;
		int z2 = 6;
		int w2 = 4;
		int i = 40;
		int j = 30;
		int k = 20;
		int l = 10;
		int m = 5;

		System.out.println("\nTransformar em Número negativo: " + (-m));

		System.out.println("\nPré Incrementar: x = ++ y");

		x2 = ++ y2;

		System.out.println("\nValor de X: " + x2);
		System.out.println("\nValor de Y: " + y2);

		System.out.println("\nPré Decrementar: z = -- w");

		z2 = -- w2;

		System.out.println("\nValor de Z: " + z2);
		System.out.println("\nValor de W: " + w2);

		System.out.println("\nPós Incrementar: i = j ++");

		i = j ++;
		
		System.out.println("\nValor de I: " + i);
		System.out.println("\nValor de J: " + j);
		
		System.out.println("\nPós Decrementar: k = l --");

		k = l --;

		System.out.println("\nValor de K: " + k);
		System.out.println("\nValor de L: " + l);
		
		int x3 = 4;
		int y3 = 2;
		int z3 = 1;

		z3 = y3;
		System.out.println("Atribuição simples (z = y): " + z3);

		x3 += y3;
		System.out.println("\nAtribuição com soma (x = x + y): " + x3);

		x3 -= z3;
		System.out.println("\nAtribuição com subtração (x = x - z): " + x3);

		x3 *= y3;
		System.out.println("\nAtribuição com multiplicação (x = x * y): " + x3);

		x3 /= y3;
		System.out.println("\nAtribuição com divisão (x = x / y): " + x3);

        x3 %= y3;
        System.out.println("\nAtribuição com o Módulo (x = x % y): " + x3);
        
        int x4 = 10;
		int y4 = 5;
		int z4 = 20;
		int w4 = 5;
		boolean resposta;

		resposta = x4 > y4;
		System.out.println("O valor de x é maior do que o valor de y? " + resposta);
		
		resposta = z4 >= y4;
		System.out.println("\nO valor de z é maior ou igual ao valor de y? " + resposta);

		resposta = x4 < z4;
		System.out.println("\nO valor de x é menor do que o valor de z? " + resposta);
		
		resposta = z4 <= w4;
		System.out.println("\nO valor de z é menor ou igual ao valor de w? " + resposta);

		resposta = x4 == z4;
		System.out.println("\nO valor de x é igual ao valor de z? " + resposta);
		
		resposta = z4 != w4;
		System.out.println("\nO valor de z é diferente do valor de w? " + resposta);

	}

}
