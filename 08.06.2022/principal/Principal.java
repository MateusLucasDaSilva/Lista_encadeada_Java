package br.ifba.edu.principal;

import br.ifba.edu.lista.Lista;

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

		lista.adicionarPorPosicao(9, "Celina");

		System.out.println(lista.toString());

	}

}
