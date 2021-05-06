/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

package PacoteJava;

import java.util.Scanner;

public class ex5exibeSomaNumUsandoDoWhile {

	public static void main(String[] args) {
		
		int num, res=0;
		
		Scanner leia = new Scanner (System.in);
		
		do
		{
			
		System.out.println("Digite um numero:");
		num = leia.nextInt();
		
		res = res+num;
		
		}
		while(num!=0);
	
		System.out.println("A soma de todos os números digitados é: "+res);

	}

}
