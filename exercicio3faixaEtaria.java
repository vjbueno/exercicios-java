/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/

package PacoteJava;

import java.util.Scanner;

public class exercicio3faixaEtaria {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println(nome+", você está na categoria infantil!");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println(nome+", você está na categoria juvenil!");
		}
		else if (idade>=18)
		{
			System.out.println(nome+", você está na categoria adulto!");
		}

	}

}
