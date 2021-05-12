package POO.herença.exercicio01;

public class Preguica extends Animal {

		//atributo da classe PREGUICA:
		private String alimento;
		
		public Preguica (String nomeAnimal, int idadeAnimal, String somAnimal, String movimentoAnimal, String alimento)
		{
			//construtores que são da superclasse ANIMAL:
			super(nomeAnimal, idadeAnimal, somAnimal, movimentoAnimal);
			
			//construtor exclusivo da classe PREGUICA:
			this.alimento = alimento;
			
		}
		
		//métodos/ação da classe PREGUICA:
		public void impressaopreguica()
		{
			System.out.println("\nNome do bicho preguiça: "+getNomeAnimal()+"\nIdade do bicho preguiça: "+getIdadeAnimal()+"\nSom que ele faz: "+getSomAnimal()
			+"\nMovimento favorito do bicho preguiça: "+getMovimentoAnimal()+"\n se alimenta de: "+alimento);
		}

		public String getAlimento() {
			return alimento;
		}

		public void setAlimento(String alimento) {
			this.alimento = alimento;
		}

	

}
