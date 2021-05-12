package POO.heren�a.exercicio01;

public class Preguica extends Animal {

		//atributo da classe PREGUICA:
		private String alimento;
		
		public Preguica (String nomeAnimal, int idadeAnimal, String somAnimal, String movimentoAnimal, String alimento)
		{
			//construtores que s�o da superclasse ANIMAL:
			super(nomeAnimal, idadeAnimal, somAnimal, movimentoAnimal);
			
			//construtor exclusivo da classe PREGUICA:
			this.alimento = alimento;
			
		}
		
		//m�todos/a��o da classe PREGUICA:
		public void impressaopreguica()
		{
			System.out.println("\nNome do bicho pregui�a: "+getNomeAnimal()+"\nIdade do bicho pregui�a: "+getIdadeAnimal()+"\nSom que ele faz: "+getSomAnimal()
			+"\nMovimento favorito do bicho pregui�a: "+getMovimentoAnimal()+"\n se alimenta de: "+alimento);
		}

		public String getAlimento() {
			return alimento;
		}

		public void setAlimento(String alimento) {
			this.alimento = alimento;
		}

	

}
