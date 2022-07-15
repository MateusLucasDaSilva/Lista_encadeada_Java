package primeiraLista;

public class Principal {

	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();
		lista.inserirNoInicio("mateus");
		lista.inserirNoInicio("lucas");
		lista.inserirNoInicio("tiago");
		lista.inserirNoInicio("igor");
		System.out.println("ADICIONANDO NOMES NUMAS LISTA DUPLAMENTE ENCADEADA:");
		System.out.println(" ");

		System.out.println(lista + "-------> Inserindo nomes no inicio");
		
		
		lista.inserirNoFim("joão");
		System.out.println(lista + "-------> Inserindo nome no fim");
		
		lista.inserirNoMeio(2, "ana");
		System.out.println(lista + "-------> Inserindo nome por posicão");
		
		lista.removerNoInicio();
		System.out.println(lista + "-------> Removendo nome do inicio");
		
		lista.retirarDoFim();
		System.out.println(lista+ "-------> Removendo nome do fim");
		
		lista.retirarPorPosicao(2);
		System.out.println(lista+ "-------> Removendo nome por posição");





		
	
		


	}

}
