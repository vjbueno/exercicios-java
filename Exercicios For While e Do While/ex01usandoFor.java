/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11(FOR)
obtemos resto = 5.
 * 
 */

package PacoteJava;

import java.util.Scanner;

public class ex01usandoFor {
	
	public static void main(String[] args) {
	
		int contador; //var contador
		
		//delimitando que meu contador se inicia em 1000(contador=1000) e que vai até 1999(menor ou igual (<=1999)) 
		for(contador=1000; contador<=1999;contador++) 
		{
			//se o numero dentro do meu contador for divido(%) por 11 e seu resultado dessa divisão for igual a 5 (==5)
			if (contador%11==5)
			{
				//imprima na tela os valores de do meu contador.
				System.out.println(contador);
			}
		}

	}
	

}
