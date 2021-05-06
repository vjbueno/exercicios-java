/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE) */

package PacoteJava;

import java.util.Scanner;

public class ex3qtdPessoasIdadeMenor21Maior50Whiele {

	public static void main(String[] args) {
	
		
		//minhas variaveis
		int idade, p21=0, p50=0;
		
		Scanner leia = new Scanner(System.in);
		
		//solicitando a idade do usuario (pela 01º vez)
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		//enquanto idade for diferente de -99
		while(idade != -99)
		{
			if(idade<=21)
			{
				System.out.println("\nVocê tem: "+idade+" anos de idade");
				idade = p21;
				p21++; //valor da var p21 = p21 + 1 
				
			}
			
			if(idade>50)
			{
				System.out.println("\nVocê tem "+idade+" anos de idade");
				idade = p50;
				p50++; //valor da var p50 = p50 + 1
			}
			
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
		}
		System.out.println("Quantidade de pessoas com menos de 21 anos: "+p21+" pessoas");
		System.out.println("Quantidade pessoas com mais de 50 anos: "+p50+" pessoas");
	}

}
