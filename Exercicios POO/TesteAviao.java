package POO.exercicio02;

public class TesteAviao {

	public static void main(String[] args) {
		
		System.out.println("LISTA DE NAVES");
		System.out.println("--------------------");
		
		Aviao aviao1 = new Aviao ("Azul","Air China",2021,"Sikorsky Ilya Muromets","Bueno");
		System.out.println(aviao1.getMeuAviao());
		
		System.out.println("--------------------");
		
		Aviao aviao2 = new Aviao ("Preto","Iberia",2021,"Junkers F13","Angela");
		System.out.println(aviao2.getMeuAviao());
		
		System.out.println("--------------------");
		
		Aviao aviao3 = new Aviao ("Amarelo","Emirates",2019,"Handley Page Type W","Dalva");
		System.out.println(aviao3.getMeuAviao());

	}

}
