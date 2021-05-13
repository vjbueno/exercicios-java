package POO.polimorfismo.exercicio01;

public class TesteAnimal {

	public static void main(String[] args) {
		
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		Animal animal = null;
		
		int x = (int)(Math.random()*3.0);
		System.out.println("\nNúmero escolhido: "+x);
		
		switch(x)
		{
		case 0: animal = cachorro;break;
		case 1: animal = cavalo;break;
		case 2: animal = preguica;break;
		default: System.out.println("Erro !");
		}
		
		if(animal!=null)
		{
			animal.som("pru");
		}
	}

}
