package testes;

public class array_Vetore_Matrizes {

	public static void main(String[] args) {

		/**
		 * String vetorString[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky
		 * Siberiano", "Corgi" };
		 * 
		 * System.out.println("1º Número: " + vetorString[0]); System.out.println("2º
		 * Número: " + vetorString[1]); System.out.println("3º Número: " +
		 * vetorString[2]); System.out.println("4º Número: " + vetorString[3]);
		 * System.out.println("5º Número: " + vetorString[4]);
		 * 
		 * System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * for (int indice = 0; indice < 5; indice++) { System.out.println((indice + 1)
		 * + "º Número: " + vetorString[indice]); }
		 * 
		 * System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * int vetorInteiros[] = new int[5]; Scanner leia = new Scanner(System.in);
		 * 
		 * for (int indice = 0; indice < 5; indice++) { System.out.println("Digite o " +
		 * (indice + 1) + "º Número: "); vetorInteiros[indice] = leia.nextInt(); }
		 * 
		 * System.out.println("\nOs números digitados foram: \n");
		 * 
		 * for (int indice = 0; indice < 5; indice++) { System.out.println((indice + 1)
		 * + "º número: " + vetorInteiros[indice]); }
		 * 
		 * System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * String vetor_cachorros[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky
		 * Siberiano", "Corgi" };
		 * 
		 * System.out.println("Itens dentro do vetor: \n");
		 * 
		 * for (int indice = 0; indice < vetor_cachorros.length; indice++) {
		 * System.out.println(vetor_cachorros[indice]); }
		 * 
		 * System.out.println("\nO tamanho do seu vetor é: " + vetor_cachorros.length);
		 * 
		 * System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * String array_nomes[] = { "Samantha", "Amanda", "Vinicius", "Cauê", "Leonardo"
		 * };
		 * 
		 * Arrays.sort(array_nomes);
		 * 
		 * System.out.println("Array em Ordem Crescente \n"); for (int indice = 0;
		 * indice < array_nomes.length; indice++) {
		 * System.out.println(array_nomes[indice]); }
		 * 
		 * Arrays.sort(array_nomes, Collections.reverseOrder());
		 * 
		 * System.out.println("\nArray em Ordem Decrescente \n"); for (int indice = 0;
		 * indice < array_nomes.length; indice++) {
		 * System.out.println(array_nomes[indice]); }
		 * 
		 * System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * int vetorInteiros2[] = { 3, 2, 1, 6, 5, 10, 7, 4, 9, 8 };
		 * 
		 * Arrays.sort(vetorInteiros2);
		 * 
		 * System.out.println("Array de primitivos em Ordem Crescente \n"); for (int
		 * indice = 0; indice < vetorInteiros2.length; indice++) {
		 * System.out.println(vetorInteiros2[indice]); }
		 * 
		 * System.out.println("\nArray de primitivos em Ordem Decrescente \n");
		 * 
		 * int[] reverseArray = new int[vetorInteiros2.length];
		 * 
		 * for (int indice = 0; indice < vetorInteiros2.length; indice++) {
		 * reverseArray[indice] = vetorInteiros2[(vetorInteiros2.length - 1) - indice];
		 * }
		 * 
		 * for (int indice = 0; indice < vetorInteiros2.length; indice++) {
		 * System.out.println(reverseArray[indice]); }
		 * System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * String grupoA[] = { "Amanda", "Elen", "Vinicius" }; String grupoB[] = {
		 * "Samantha", "Letícia", "Alan" };
		 * 
		 * System.out.println("Os Arrays são iguais? ");
		 * 
		 * if (Arrays.equals(grupoA, grupoB)) { System.out.println("Sim, são iguais.");
		 * } else { System.out.println("Não, são diferentes."); }
		 * System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * int vetorInteiros4[] = { 1, 2, 3, 4, 5, 10, 7, 6, 9, 8 };
		 * 
		 * // Ordena o Vetor Arrays.sort(vetorInteiros4);
		 * 
		 * System.out.println("\nVetor Ordenado");
		 * 
		 * for (int indice = 0; indice < vetorInteiros4.length; indice++) {
		 * System.out.println(vetorInteiros4[indice]); }
		 * 
		 * System.out.println("\nO elemento 10 Existe? Qual é a posição?");
		 * 
		 * int posicao = Arrays.binarySearch(vetorInteiros4, 10);
		 * 
		 * // Se a posição for positiva = Encontrou if (posicao >= 0)
		 * System.out.println("\nO elemento foi Encontrado e está na Posição: " +
		 * posicao); else System.out.println("\nElemento não encontrado!");
		 * 
		 * System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * int matrizInteiros5[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150
		 * } };
		 * 
		 * for (int indiceLinha = 0; indiceLinha < 3; indiceLinha++) { for (int
		 * indiceColuna = 0; indiceColuna < 3; indiceColuna++) { System.out.println("O
		 * valor armazenado na posição [" + indiceLinha + "][" + indiceColuna + "] é: "
		 * + matrizInteiros5[indiceLinha][indiceColuna]);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * int[][] matrizInteiros6 = new int[3][3];
		 * 
		 * for (int linha = 0; linha < 3; linha++) { for (int coluna = 0; coluna < 3;
		 * coluna++) { System.out.println( "Digite um valor para a posição [" + linha +
		 * "][" + coluna + "]: "); matrizInteiros6[linha][coluna] = leia.nextInt(); } }
		 * 
		 * for (int linha = 0; linha < 3; linha++) { for (int coluna = 0; coluna < 3;
		 * coluna++) { System.out.println( "O valor armazenado na posição [" + linha +
		 * "][" + coluna + "] é: " + matrizInteiros6[linha][coluna]); } }
		 *
		 * 
		 * System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * int soma = 0; int vetorSoma[] = new int[4]; // Cria um vetor de 4 posições
		 * int[][] matrizInteiros7 = new int[5][4]; // Cria uma Matriz 5x4
		 * 
		 * Scanner leia = new Scanner(System.in);
		 * 
		 * // Insere os dados na matriz for (int linha = 0; linha < 5; linha++) { for
		 * (int coluna = 0; coluna < 4; coluna++) {
		 * 
		 * System.out.println("Digite um valor para a posição [" + linha + "][" + coluna
		 * + "]: "); matrizInteiros7[linha][coluna] = leia.nextInt(); } }
		 * 
		 * // Como desejamos somar as colunas, invertemos os índices nos laços de
		 * repetição // Compare com os laços de repetição acima for (int coluna = 0;
		 * coluna < 4; coluna++) { for (int linha = 0; linha < 5; linha++) {
		 * 
		 * // Armazena a soma dos elementos da coluna na variável soma +=
		 * matrizInteiros7[linha][coluna]; }
		 * 
		 * // Guarda a soma no vetor auxiliar vetorSoma[coluna] = soma;
		 * 
		 * // Zera a variável soma, para receber a soma dos elementos da próxima coluna
		 * soma = 0; }
		 * 
		 * // Mostra na tela o resultado da soma dos elementos de cada coluna da Matriz
		 * for (int coluna = 0; coluna < 4; coluna++) { System.out.println("Soma de
		 * todos os elementos da coluna " + (coluna + 1) + " é: " + vetorSoma[coluna]);
		 * }
		 * 
		 * 
		 * System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 * 
		 * String[][] matrizNomes = new String[2][3]; Scanner leia = new
		 * Scanner(System.in);
		 * 
		 * // Sem Utilizar o Método length for (int linha = 0; linha < 2; linha++) { for
		 * (int coluna = 0; coluna < 3; coluna++) {
		 * 
		 * System.out.println("Digite um nome para a posição [" + linha + "][" + coluna
		 * + "]: "); matrizNomes[linha][coluna] = leia.next(); } }
		 * 
		 * // Utilizando o Método length for (int linha = 0; linha < matrizNomes.length;
		 * linha++) { for (int coluna = 0; coluna < matrizNomes[linha].length; coluna++)
		 * { System.out.println("O nome armazenado na posição [" + linha + "][" + coluna
		 * + "] é: " + matrizNomes[linha][coluna]); } }
		 * 
		 * System.out .println("\nSua Matriz tem " + matrizNomes.length + " linhas e " +
		 * matrizNomes[0].length + " colunas.");
		 * 
		 * String alunes[] = { "Felipe", "Jonas", "Julia", "Marcos" };
		 * 
		 * for(int i = 0; i < alunes.length; i++) { System.out.println(alunes[i]); }
		 * 
		 * for (String alune : alunes) { System.out.println(alune); }
		 **/
		String alunes[][] = { { "Felipe", "Jonas", "Julia" }, { "Mariana", "Carlos", "Juliana" },
				{ "Augusto", "Sabrina", "Julius" } };

		for (String[] linha : alunes) {
			for (String alune : linha) {
				System.out.println(alune);
			}
		}

	}
}