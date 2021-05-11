package POO.exercicio03;

public class Produto {
	
	//atributos da classe PRODUTO
	private String categoriaProduto;
	private String nomeProduto;
	private String dataFabricacao;
	private String modeloProduto;
	
	
	// construtor da classe PRODUTO
	public Produto (String categoriaProduto, String nomeProduto, String dataFabricacao, String modeloProduto)
	{
		
		this.categoriaProduto = categoriaProduto;
		this.nomeProduto = nomeProduto;
		this.dataFabricacao = dataFabricacao;
		this.modeloProduto = modeloProduto;
		
	}
	
	// métedo da classe PRODUTO
	public String getMeuProduto()
	{
		//método do tipo string que se chama MeuProduto
		String MeuProduto = "Categoria do produto: "+categoriaProduto+"\nNome do produto: "+nomeProduto+"\nData de fabricação do produto: "+dataFabricacao
				+"\nModelo do produto: "+modeloProduto;
		return MeuProduto;
			
	}

	public String getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(String categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public String getModeloProduto() {
		return modeloProduto;
	}

	public void setModeloProduto(String modeloProduto) {
		this.modeloProduto = modeloProduto;
	}
	

}
