package POO.herença.exercicio01;

//nome da classe:
public class TesteAnimais {
	
	// função Main
	public static void main(String[] args) {
		
		System.out.println("\t01 animal: ");

		// nome da classe + nome do meu objeto + recebendo minha classe + dados a serem impressos ligados a classe Cachorro. Respeitando a ordem de seus construtores 
		Cachorro ralf = new Cachorro("Ralf", 5, "rosna", "pula", "medio", "Pug");
		ralf.impressaocachorro();//<<imprimindo os dados da linha 10; nome do objeto + função responsável por imprimir que está presente na classe cachorro
		
		System.out.println("\n\t02º animal: ");
		
		Cavalo bernardo = new Cavalo("Bernardo", 14, "relicha", "corre", "branco");
		bernardo.impressaocavalo();

		System.out.println("\n\t03º animal: ");
		
		Preguica eliot = new Preguica("Eliot", 3,"pi pi pi", "dormir", "brotos e folhas");
		eliot.impressaopreguica();

	}

}


