//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 
package PacoteJava;

import java.util.Scanner;

public class exercicio01numMaior {

	public static void main(String[] args) {
		
		//declarando minhas variaveis do tipo inteiro
		int n1,n2,n3; // exemplo: n1 = 5; n2 = 7; n3 = 9
		
		// Função Scanner para ler o numero digitado pelo usuário
		Scanner leia = new Scanner (System.in);
		
		//Exibindo mensagem na tela do usuário
		System.out.println("Digite um numero: ");
		
		//Armazenando o valor digitado pelo usuário
		n1 = leia.nextInt();
		
		//Exibindo mensagem na tela do usuário
		System.out.println("\nDigite um segundo número: ");
		
		//Armazenando o valor digitado pelo usuário
		n2 = leia.nextInt();
		
		//Exibindo mensagem na tela do usuário
		System.out.println("\nDigite um terceiro número: ");
		
		//Armazenando o valor digitado pelo usuário
		n3 = leia.nextInt();
		
		//incluindo minhas condições
		if(n1>n2 && n1>n3)
		{
			System.out.println("\nO maior numero é "+n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("\nO maior numero é: "+n2);
		}
		else if (n3>n1 && n3>n2)
		{
			System.out.println("\nO maior numero é: "+n3);
		}
		

	}

}
