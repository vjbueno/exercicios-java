//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

package PacoteJava;

import java.util.Scanner;

public class exercicio2numCrescente {

	public static void main(String[] args) {
		
		int n1,n2,n3; 
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seu primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite seu segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite seu terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1<=n2 && n2<=n3)
		{
			System.out.println("Ordem dos numeros: "+n1+", "+n2+", "+n3);
		}
		else if (n2<=n1 && n2<=n3)
		{
			System.out.println("Ordem dos numeros: "+n2+", "+n3+", "+n1);
		}
		else if (n3<=n1 && n3<=n2)
		{
			System.out.println("Ordem dos numeros: "+n3+", "+n2+", "+n1);
		}

	}

}
