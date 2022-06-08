package br.ifba.edu.principal;

import javax.swing.JOptionPane;

import br.ifba.edu.lista.Lista;

public class Principal {

	public static void main(String[] args) {

		Lista lista = new Lista();

		lista.adicionaNoComeco("Igor");
		lista.adicionaNoComeco("Maria");
		lista.adicionaNoComeco("Fulano");
		lista.adicionaNoComeco("Sicrano");
		lista.adicionaNoComeco("Jos�");
		lista.adicionaNoComeco("Camila");
		lista.adicionaNoComeco("Helena");

		System.out.println(lista.toString());

		lista.adicionaNoFinal("mateus");
		lista.adicionaNoFinal("lucas");

		System.out.println(lista.toString());

		lista.adicionarPorPosicao(9, "Celina");

		System.out.println(lista.toString());
		lista.removerDoComeco();


		JOptionPane.showMessageDialog(null, lista.toString());
		
		
		System.out.println(lista.toString());

	}

}
