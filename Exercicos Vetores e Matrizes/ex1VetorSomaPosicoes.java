/*1- Faça um programa que possua um vetor denominado A que armazene 6 números
inteiros. O programa deve executar os seguintes passos:

(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

package PacoteJava;

public class ex1VetorSomaPosicoes {

	public static void main(String[] args) {
	
		int[] A = {1, 0, 5, -2, -5, 7};
		
		int soma;
		
		soma = A[0] + A[1] + A[5];
	
		System.out.println("Somando os valores do vetor; valores das posições 0, 1 e 5");
		
		System.out.println("\nA soma dos vetores de posição 0, 1 e 5 é: "+soma);
		
		//alterando o valor do meu vetor de posição 4 para 100
		A[4]=100;
		
		System.out.println("\nO valor do vetor de posição 4 passou a ser: "+A[4]);
		
	}

}
