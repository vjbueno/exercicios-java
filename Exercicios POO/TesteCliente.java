package POO.exercicio01;

public class TesteCliente {

	public static void main(String[] args) {
		
		System.out.println("LISTA DE CLIENTES");
		System.out.println("--------------------");
		
		Cliente cliente1 = new Cliente ("Bueno",21," Rua 123","Masculino","bueno@hotmail.com",5);
		System.out.println(cliente1.getMeuCliente());
		
		System.out.println("--------------------");
		
		Cliente cliente2 = new Cliente ("Angela",22," Rua Robru","Feminino","angela@hotmail.com",10);
		System.out.println(cliente2.getMeuCliente());
		
		System.out.println("--------------------");
		
		Cliente cliente3 = new Cliente ("Dalva",51," Rua Correa","Feminino","Dalva@hotmail.com",3);
		System.out.println(cliente3.getMeuCliente());
		

	}

}
