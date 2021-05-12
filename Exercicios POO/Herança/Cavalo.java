package POO.heren�a.exercicio01;

//nome desta classe; ligando ela a superclasse ANIMAL utilizando o extends 
public class Cavalo extends Animal {

	// atributo da classe CAVALO:
	private String cor;
	
	//construtores da classe CAVALO(enfatizando os construtores presentes na superclasse ANIMAL + o atributo desta classe CAVALO:
	public Cavalo (String nomeAnimal, int idadeAnimal, String somAnimal, String movimentoAnimal,String cor)
	{
		//construtores que s�o da superclasse ANIMAL:
		super(nomeAnimal, idadeAnimal, somAnimal, movimentoAnimal);
		
		//construtor exclusivo da classe CAVALO:
		this.cor = cor;
		
	}
	
	//m�todo/a��o exclusivo da classe CAVALO:
	
	public void impressaocavalo()//<< impressaocavalo � o nome da fun��o respons�el por imprimir na tela tudo que esta ligado a classe cavalo
	{
		//dados ligados a fun��o impressaocavalo a serem impressos 
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
