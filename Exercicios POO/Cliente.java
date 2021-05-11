package POO.exercicio01;

public class Cliente {
	
	//atributos da minha classe 
	private String Nome;
	private String Endereco;
	private String Sexo;
	private String Email;
	private int Idade;
	private int QtdItens;

	
	//construtor da classe
	public Cliente(String Nome,int Idade,String Endereco,String Sexo,String Email,int QtdItens)
	{
		this.Nome = Nome;
		this.Endereco = Endereco;
		this.Sexo = Sexo;
		this.Email = Email;
		this.Idade = Idade;
		this.QtdItens = QtdItens;
		
	}
	
	//métodos da classe
	public String getMeuCliente()
	{
		String MeuCliente = "\nNome: "+Nome+"\nEndereço: "+Endereco+"\nSexo: "+Sexo+"\nE-mail: "+Email+"Idade: "+Idade+"Quantidade de itens comprados: "+QtdItens;
		return MeuCliente;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public int getQtdItens() {
		return QtdItens;
	}

	public void setQtdItens(int qtdItens) {
		QtdItens = qtdItens;
	}
	
	
	

	

}
