package POO.exercicio02;

public class Aviao {
	
	//atributos da minha classe
	private String cor;
	private String marca;
	private int ano;
	private String modelo;
	private String piloto;
	
	public Aviao(String cor, String marca, int ano, String modelo, String piloto)
	{
		this.cor = cor;
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
		this.piloto = piloto;
		
	}
	
	public String getMeuAviao()
	{
		String MeuAviao = "\nCor: "+cor+"\nMarca: "+marca+"\nano: "+ano+"\nmodelo: "+modelo+"Piloto: "+piloto;
		return MeuAviao;
	}
	
	//metedos da classe
	public String getCor() {
		
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	
	
	
	

}
