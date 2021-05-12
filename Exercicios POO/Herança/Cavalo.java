package POO.herença.exercicio01;

//nome desta classe; ligando ela a superclasse ANIMAL utilizando o extends 
public class Cavalo extends Animal {

	// atributo da classe CAVALO:
	private String cor;
	
	//construtores da classe CAVALO(enfatizando os construtores presentes na superclasse ANIMAL + o atributo desta classe CAVALO:
	public Cavalo (String nomeAnimal, int idadeAnimal, String somAnimal, String movimentoAnimal,String cor)
	{
		//construtores que são da superclasse ANIMAL:
		super(nomeAnimal, idadeAnimal, somAnimal, movimentoAnimal);
		
		//construtor exclusivo da classe CAVALO:
		this.cor = cor;
		
	}
	
	//método/ação exclusivo da classe CAVALO:
	
	public void impressaocavalo()//<< impressaocavalo é o nome da função responsáel por imprimir na tela tudo que esta ligado a classe cavalo
	{
		//dados ligados a função impressaocavalo a serem impressos 
		System.out.println("\nNome do cavalo: "+getNomeAnimal()+"\nIdade do cavalo: "+getIdadeAnimal()+"\nSom que o cavalo faz: "+getSomAnimal()
		+"\nMovimento que o cavalo faz: "+getMovimentoAnimal()+"\nCor do cavalo: "+cor);
	}
	
	// getters e setters
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
