package POO.heren�a.exercicio01;

//nome da classe:
public class TesteAnimais {
	
	// fun��o Main
	public static void main(String[] args) {
		
		System.out.println("\t01 animal: ");

		// nome da classe + nome do meu objeto + recebendo minha classe + dados a serem impressos ligados a classe Cachorro. Respeitando a ordem de seus construtores 
		Cachorro ralf = new Cachorro("Ralf", 5, "rosna", "pula", "medio", "Pug");
		ralf.impressaocachorro();//<<imprimindo os dados da linha 10; nome do objeto + fun��o respons�vel por imprimir que est� presente na classe cachorro
		
		System.out.println("\n\t02� animal: ");
		
		Cavalo bernardo = new Cavalo("Bernardo", 14, "relicha", "corre", "branco");
		bernardo.impressaocavalo();

		System.out.println("\n\t03� animal: ");
		
		Preguica eliot = new Preguica("Eliot", 3,"pi pi pi", "dormir", "brotos e folhas");
		eliot.impressaopreguica();

	}

}


