package dia11;

import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
		// construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário
		// irá digitar um número e o programa deve exibir na tela a posição deste número
		// no vetor. Caso o número não seja encontrado, a mensagem: “Não foi
		// encontrado!” deve ser exibida na tela.

		// 1º declarar as variáveis

		boolean encontrei = false;
		int vetorInteiros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero = 0; // numero recebe 0
		Scanner ler = new Scanner(System.in);

		System.out.println(" Digite um número");
		numero = ler.nextInt();

		// 2º criar a condição - lógica
		// laço de repetição - vagão por vagão
		for (int contador = 0; contador < vetorInteiros.length; contador++) {// passando de vagão por vagão
			if (numero == vetorInteiros[contador]) { // referência - o meu vetor na posição x tem esse número?
				System.out.println(" Achei o número digitado na posição: " + contador); // informando o nº do vagão
				encontrei = true; // 9
			}
		}
		if (encontrei == false) {// 40
			System.out.println("Número não foi encontrado");
		}
	} 
}

//com operador logico 
	// or (int contador = 0; contador < vetorInteiros.length; contador++) {
	//if (numero == vetorInteiros[contador]) {
		//System.out.println("Achei o número digitado na posição: " + contador);

	//if(numero != vetorInteiros[contador] && vetorInteiros[contador] == 9) {
		//System.out.println("nao foi encontrado");	


