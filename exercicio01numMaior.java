//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 
package PacoteJava;

import java.util.Scanner;

public class exercicio01numMaior {

	public static void main(String[] args) {
		
		//declarando minhas variaveis do tipo inteiro
		int n1,n2,n3; // exemplo: n1 = 5; n2 = 7; n3 = 9
		
		// Fun��o Scanner para ler o numero digitado pelo usu�rio
		Scanner leia = new Scanner (System.in);
		
		//Exibindo mensagem na tela do usu�rio
		System.out.println("Digite um numero: ");
		
		//Armazenando o valor digitado pelo usu�rio
		n1 = leia.nextInt();
		
		//Exibindo mensagem na tela do usu�rio
		System.out.println("\nDigite um segundo n�mero: ");
		
		//Armazenando o valor digitado pelo usu�rio
		n2 = leia.nextInt();
		
		//Exibindo mensagem na tela do usu�rio
		System.out.println("\nDigite um terceiro n�mero: ");
		
		//Armazenando o valor digitado pelo usu�rio
		n3 = leia.nextInt();
		
		//incluindo minhas condi��es
		if(n1>n2 && n1>n3)
		{
			System.out.println("\nO maior numero � "+n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("\nO maior numero �: "+n2);
		}
		else if (n3>n1 && n3>n2)
		{
			System.out.println("\nO maior numero �: "+n3);
		}
		

	}

}
