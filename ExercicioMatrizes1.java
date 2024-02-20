package dia11;

import java.util.Scanner;

public class ExercicioMatrizes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em
		// seguida, mostre na tela:
		// Todos os elementos da Diagonal Principal
		// Todos os elementos da Diagonal Secundária
		// A Soma de todos os elementos da Diagonal Principal
		// A Soma de todos os elementos da Diagonal Secundária

		// Na construção do Algoritmo, utilize os seguintes conteúdos:
		// Entrada e Saída de dados
		// Laços Condicionais
		// Laços de Repetição
		// Matrizes

		// 1º declarar as variáveis
		int somaPrincipal = 0;
		int somaSecundaria = 0;
		int matriz[][] = new int[3][3]; // criando uma matriz com 3 linhas x 3 colunas
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		matriz[1][0] = 4;
		matriz[1][1] = 5;
		matriz[1][2] = 6;
		matriz[2][0] = 7;
		matriz[2][1] = 8;
		matriz[2][2] = 9;
		Scanner ler = new Scanner(System.in);

		// 2º criar a condição - lógica

//		for (int linha = 0; linha < 2; linha++) { // passando a primeira linha
//
//			for (int coluna = 0; coluna < 2; coluna++) { // passando a coluna
//				System.out.println(" Digite o número na posição: " + linha + "," + coluna);
//				matriz[linha][coluna] = ler.nextInt(); // informo o que a matriz vai receber
//			} 
//		} 

		// Todos os elementos da Diagonal Principal
		// A Soma de todos os elementos da Diagonal Principal

		System.out.println("Elementos da diagonal principal: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			somaPrincipal = somaPrincipal + matriz[linha][linha];
			System.out.print(matriz[linha][linha] + " ");
		}
		System.out.println();

		System.out.println(" A Soma de todos os elementos da Diagonal Principal: " + somaPrincipal);

		// Todos os elementos da Diagonal Secundária
		// A Soma de todos os elementos da Diagonal Secundária
		
		System.out.println("Elementos da diagonal secundária: ");
		for (int linha = 0; linha < matriz.length; linha++) {
			somaSecundaria = somaSecundaria + matriz[linha][3 - 1 - linha];
			System.out.print(matriz[linha][3 - 1 - linha] + " ");
		}
		System.out.println();
		
		System.out.println(" A Soma de todos os elementos da Diagonal Secundaria: " + somaSecundaria);

	}

}
