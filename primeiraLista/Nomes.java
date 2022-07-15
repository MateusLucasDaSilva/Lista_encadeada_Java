package primeiraLista;

public class Nomes {
	private String nome;

	public Nomes() {
	}

	public Nomes(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nomes [nome=" + nome + "]";
	}
	
	
	

}
