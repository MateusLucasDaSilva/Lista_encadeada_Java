package lista_encadeada;

import javax.swing.JOptionPane;

import lista_encadeada.Celula;

public class Lista {

	private Celula cabeca;
	private Celula cauda;

	private int totalElementos = 0;

	public void adicionaNoComeco(Object obj) {

		Celula nova = new Celula(this.cabeca, obj);
		this.cabeca = nova;

		if (totalElementos == 0) {
			this.cauda = nova;

		}
		this.totalElementos++;
	}

	public void adicionaNoFinal(Object obj) {

		if (this.totalElementos == 0) {
			this.adicionaNoComeco(obj);
		} else {
			Celula nova = new Celula(obj);
			this.cauda.setProxima(nova);
			this.cauda = nova;
			this.totalElementos++;
		}
	}

	public void adicionarPorPosicao(int posicao, Object obj) {

		if (posicao == 0) {
			this.adicionaNoComeco(obj);
		} else if (posicao == this.totalElementos) {
			this.adicionaNoFinal(obj);
		} else {
			if (!this.verificarPosicao(posicao)) {
				JOptionPane.showMessageDialog(null, "Posição Invalida", null, JOptionPane.ERROR_MESSAGE);
				throw new IllegalArgumentException("A posição digitada é inválida");
			}

		}

		Celula anterior = this.cabeca;
		for (int cont = 0; cont < posicao - 1; cont++) {
			anterior = anterior.getProxima();
		}
		Celula nova = new Celula(anterior.getProxima(), obj);
		anterior.setProxima(nova);
		this.totalElementos++;

	}

	public String toString() {

		if (this.totalElementos == 0) {
			return "[]";
		}

		StringBuilder listaencadeada = new StringBuilder("[");
		Celula atual = this.cabeca;

		for (int i = 0; i < this.totalElementos - 1; i++) {
			listaencadeada.append(atual.getObjeto());
			listaencadeada.append(",");
			atual = atual.getProxima();
		}

		listaencadeada.append(atual.getObjeto());
		listaencadeada.append("]");

		return listaencadeada.toString();
	}

	public boolean verificarPosicao(int posicao) {
		return posicao >= 0 && posicao < this.totalElementos;
	}
	
	public void removerPrimeira () {				
		Celula aux = this.cabeca;
		this.cabeca = this.cabeca.getProxima();
		aux.setProxima(null);
		this.totalElementos--;
	}
	
	public void removerUltima () {
		Celula aux = this.cauda;
		aux.setProxima(null);
		this.totalElementos--;
	}
	
	public void removerNaPosicao (int posicao) {
		if (posicao == 0) {
			this.removerPrimeira();
		}
		else if (posicao == this.totalElementos) {
			this.removerUltima();
		}
		else if (!this.verificarPosicao(posicao)) {
				JOptionPane.showMessageDialog(null, "Posição Inválida", null, JOptionPane.ERROR_MESSAGE);
				throw new IllegalArgumentException("A posição digitada é inválida");
		}	
		else {
			Celula aux = this.cabeca;
			
			for (int i = 0; i < posicao - 1; i++) {						
				aux = aux.getProxima();			
			}		
			
			aux.setProxima(aux.getProxima().getProxima());
			aux.getProxima();
			this.totalElementos--;
		}
	}

}
