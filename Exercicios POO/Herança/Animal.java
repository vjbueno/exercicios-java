package POO.herença.exercicio01;

//nome da superclasse:
public class Animal {
	
	// atributos da superclasse ANIMAL:
	private String nomeAnimal;
	private int idadeAnimal;
	private String somAnimal;
	private String movimentoAnimal;
	
	//constrtutor Dda superclasse ANIMAL:
	public Animal(String nomeAnimal, int idadeAnimal, String somAnimal, String movimentoAnimal)
	{
		this.nomeAnimal = nomeAnimal;
		this.idadeAnimal = idadeAnimal;
		this.somAnimal = somAnimal;
		this.movimentoAnimal = movimentoAnimal;
	}

	//getters e setters (busca e alteração)
	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public String getSomAnimal() {
		return somAnimal;
	}

	public void setSomAnimal(String somAnimal) {
		this.somAnimal = somAnimal;
	}

	public String getMovimentoAnimal() {
		return movimentoAnimal;
	}

	public void setMovimentoAnimal(String movimentoAnimal) {
		this.movimentoAnimal = movimentoAnimal;
	}
	
	//método/ações da minha classe ANIMAL
	
	
	}


