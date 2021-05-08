//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package PacoteJava;

import java.util.Scanner;

public class ex3MatrizValorMaiorque10 {

	public static void main(String[] args) {
		
		int [][] nota = new int [3][3];
		
		int linha, coluna,numeros=0;
		
		//primeira posição linha segunda posição coluna
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;linha++)
			{
				System.out.println("Digite um numero: ");
				nota[linha][coluna]=leia.nextInt();
				
				if(nota[linha][coluna]>10)
				{
					numeros++;
				}
			}
		}
	
		System.out.println("Os numeros maiores que 10 são: "+numeros);

	}

}
