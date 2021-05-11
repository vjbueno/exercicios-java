package POO.exercicio03;

public class TesteProduto {

	public static void main(String[] args) {
		
		System.out.println("\tLISTA DE PRODUTOS");
		System.out.println("---------------------------------");
		
		
		Produto produto1 = new Produto("Celulares","SmartPhone Motorola G3","04/05/2016","G3");
		System.out.println(produto1.getMeuProduto());
		
		System.out.println("---------------------------------");
		
		Produto produto2 = new Produto("Eletrodomésticos","Geladeira/Refrigerador","05/06/2020","Evolution RT46");
		System.out.println(produto2.getMeuProduto());
		
		System.out.println("---------------------------------");
		
		Produto produto3 = new Produto("Informática","Notebook Lenovo Ideapad","08/09/2019","81V70008BR");
		System.out.println(produto3.getMeuProduto());
			

	}

}

