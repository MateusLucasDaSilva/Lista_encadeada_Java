package primeiraLista;

public class ListaDupla {
	No inicio;
	No fim;
	int tamanho;

	public void inserirNoInicio(String info) {
		No no = new No();
		no.info = info;
		no.anterior = null;
		no.proximo = inicio;
		if (inicio != null) {
			inicio.anterior = no;
		}
		inicio = no;
		if (tamanho == 0) {
			fim = no;
		}
		tamanho++;

	}

	public String removerNoInicio() {
		if (inicio == null) {
			return null;
		}
		String out = inicio.info;
		inicio = inicio.proximo;
		if (inicio != null) {
			inicio.anterior = null;
		} else {
			fim = null;
		}
		tamanho--;
		return out;
	}

	public void inserirNoFim(String info) {
		No no = new No();
		no.info = info;
		no.proximo = null;
		no.anterior = fim;
		if (fim != null) {
			fim.proximo = no;

		}
		fim = no;
		if (tamanho == 0) {
			inicio = fim;
		}
		tamanho++;
	}
	
	public String retirarDoFim() {
		if(fim == null) {
			return null;
		}
		String out = fim.info;
		fim = fim.anterior;
		if(fim != null) {
			fim.proximo = null;
		}else {
			inicio = null;
		}
		tamanho--;
		return out;
	}
	public void inserirNoMeio(int posicao, String info) {
		if (posicao <= 0) {
			inserirNoInicio(info);
		}else if (posicao >= tamanho) {
			inserirNoFim(info);
		} else {
			No local = inicio;
			for(int i = 0; i< posicao -1; i++) {
				local = local.proximo;
			}
			No no = new No();
			no.info = info;
			no.anterior = local;
			no.proximo = local.proximo;
			local.proximo = no;
			no.proximo.anterior = no;
			tamanho ++;
			
			
			
		}
			
	}
	
	public String retirarPorPosicao(int posicao) {
		if (posicao < 0 || posicao >= tamanho || inicio == null) {
			return null;
		}else if(posicao == 0) {
			return removerNoInicio();
		}else if(posicao == tamanho -1) {
			return retirarDoFim();
		}
		No local = inicio;
		for(int i = 0; i< posicao -1; i++) {
			local = local.proximo;
		}
		local.anterior.proximo = local.proximo;
		local.proximo.anterior = local.anterior;
		tamanho --;
		return"";
	}
	
	public String toString() {
		String str = "{" + tamanho + "} ";
		No local = inicio;
		while (local != null) {
			str += local.info + " ";
			local = local.proximo;
			
		}
		return str;
	}

}
