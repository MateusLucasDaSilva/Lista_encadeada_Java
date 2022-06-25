package lista_encadeada;

import javax.swing.JOptionPane;

import lista_encadeada.Lista;

public class Principal {

	public static void main(String[] args) {

		Lista lista = new Lista();

		lista.adicionaNoComeco("Igor");
		lista.adicionaNoComeco("Maria");
		lista.adicionaNoComeco("Fulano");
		lista.adicionaNoComeco("Sicrano");
		lista.adicionaNoComeco("José");
		lista.adicionaNoComeco("Camila");
		lista.adicionaNoComeco("Helena");

		System.out.println(lista.toString());

		lista.adicionaNoFinal("mateus");
		lista.adicionaNoFinal("lucas");
		System.out.println(lista.toString());

		lista.adicionarPorPosicao(3, "Celina");

		System.out.println(lista.toString());
		lista.removerPrimeira();

		JOptionPane.showMessageDialog(null, lista.toString());
		System.out.println(lista.toString());
		
		lista.removerUltima();
		System.out.println(lista.toString());
		
		lista.removerNaPosicao(1);
		System.out.println(lista.toString());

	}

}
