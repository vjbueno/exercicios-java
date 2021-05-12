package POO.heren�a.exercicio01;

//nome desta classe; ligando ela a superclasse ANIMAL utilizando o extends 
public class Cachorro extends Animal {
	
	// atributos classe CACHORRO
	private String porte;
	private String racao;
	
	//construtores da classe CACHORRO (enfatizando os construtores presentes na superclasse ANIMAL + os dois atributos desta classe CACHORRO
	public Cachorro(String nomeAnimal, int idadeAnimal, String somAnimal, String movimentoAnimal, String porte, String racao) 
	{
		//construtores que s�o da superclasse ANIMAL:
		super(nomeAnimal, idadeAnimal, somAnimal, movimentoAnimal);
		
		//construtores exclusivos da classe CACHORRO:
		this.porte = porte;
		this.racao = racao;	
	}
	
	//m�todos/a��es da classe CACHORRO:
	public void impressaocachorro()//<< impressaocachorro � o nome da fun��o, respons�el por imprimir na tela tudo que esta ligado a classe cachorro
	{
		//dados a ser impressos
		System.out.println("\nNome do cachorro: "+getNomeAnimal()+"\nIdade do cachorro: "+getIdadeAnimal()+"\nSom que emite: "+getSomAnimal()
		+"\nMovimento: "+getMovimentoAnimal()+"\nporte: "+porte+"\nra�a: "+racao);
	}

	////getters e setters (busca e altera��o)
	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getRacao() {
		return racao;
	}

	public void setRacao(String racao) {
		this.racao = racao;
	}
	


}
