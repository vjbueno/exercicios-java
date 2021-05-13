package POO.collection.exercicio01;

//biblioteca da fun��o ArrayList
import java.util.ArrayList; 

// biblioteca da fun��o Scanner(leitura de dados)
import java.util.Scanner;

public class SistemaLoja {

	public static void main(String[] args) {
		
		//variaveis
		String nome; //var que armazena o nome do funcionario
		int opcao; //var que armazena a op��o escolhida pelo usuario 
		
		// introduzindo fun��o array
		ArrayList<String> armazenamento = new ArrayList();
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tSISTEMA LOJA JAVALI");
		
		System.out.println("\nDigite seu nome: ");
		nome = leia.next();
		
		System.out.println("\nBEM VINDO, "+nome+"!");
		
		do //fa�a/execute:
		{
			System.out.println("\nESCOLHA UMA DAS OP��ES");
			System.out.println("------------------------");
			System.out.println("\n(1) - Cadastrar novo produto");
			System.out.println("\n(2) - Remover produto existente no estoque");
			System.out.println("\n(3) - Atualizar lista de produtos");
			System.out.println("\n(4) - Mostrar todos os produtos");
			System.out.println("\n(0) - Sair do sistema");
			opcao = leia.nextInt();
			
			switch(opcao)
			{
				case 1: //<caso o usu�rio digite a op��o 1, o "sistema" far�/entrar� neste bloco do c�digo:
					leia.nextLine();// limpando buffer/cache da memoria
					System.out.println("\nDigite o nome do novo produto: ");
					String novoproduto = leia.nextLine();
					armazenamento.add(novoproduto); //< armazenando o produto digitado pelo usuario na variavel novoproduto
					System.out.println("\nProduto "+novoproduto+" cadastrado com sucesso!");
					break; //fim do caso 1
					
					
				case 2: //<caso o usu�rio digite a op��o 2 o "sistema" executara/entrar� neste bloco do c�digo:
					System.out.println("\nDigite o nome do produto que deseja remover do estoque: ");
					String produtoarmazenado = leia.nextLine();
					
					if(armazenamento.contains(produtoarmazenado)) // verifica se o produto digitado pelo funcionario j� esta no estoque
					{
						armazenamento.remove(produtoarmazenado); //removendo os itens armazenados na var produtoarmazenado
					}
					else //se o produto digitado pelo funcionario n�o estiver cadastro no estoque, imprimir: 
					{
						System.out.println("\nProduto n�o localizado no sistema");
					}
					break;//fim do caso 2
					
				case 3: 
					leia.nextLine();
					//<caso o usu�rio digite a op��o 3 o "sistema" executara/entrar� neste bloco do c�digo:
					System.out.println("\nDigite o nome do produto que deseja substituir");
					String substitui = leia.nextLine();
					System.out.println("\nDigite o nome do produto que ser� substituido pelo "+substitui+" : ");
					String novosubstituto = leia.nextLine();
					
					if(armazenamento.add(substitui))
					{
						armazenamento.remove(substitui);
						armazenamento.add(novosubstituto);
					}
					else
					{
						System.out.println("\nEste prdotuo n�o est� cadastrado no estoque");
					}
					break;
				case 4:
					leia.nextLine();
					System.out.println("\nTodos os produtos cadastrados no estoque: ");
					System.out.println(armazenamento);
					break;
					default:
						System.out.println("\nPrograma finalizado");
			}
		
	
		}while(opcao!=0); //enquanto a op��o digitada pelo usuario for diferente de 0
	

	}

}
