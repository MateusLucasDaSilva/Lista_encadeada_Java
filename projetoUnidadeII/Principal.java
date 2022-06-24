package projetoUnidadeII;

public class Principal {
public static void main(String[] args) {
	
	ListaSimples lista = new ListaSimples();
	
	Funcionario fun0 = new Funcionario(); 
	fun0.setNome("mateus");
	fun0.setCpf("123456789");
	fun0.setRg("369852147");
	fun0.setIdade(20);
	lista.adicionaNoComeco(fun0);
	
	Funcionario fun1 = new Funcionario(); 
	fun1.setNome("lucas");
	fun1.setCpf("123456789");
	fun1.setRg("369852147");
	fun1.setIdade(19);
	lista.adicionaNoComeco(fun1);
	
	Funcionario fun2 = new Funcionario(); 
	fun2.setNome("igor");
	fun2.setCpf("123456789");
	fun2.setRg("369852147");
	fun2.setIdade(35);
	lista.adicionaNoComeco(fun2);

	System.out.println(lista.toString());
	
	Funcionario fun4 = new Funcionario(); 
	fun4.setNome("leonardo");
	fun4.setCpf("862453197");
	fun4.setRg("986574123");
	fun4.setIdade(37);
	lista.adicionaNoFinal(fun4);
	System.out.println(lista.toString());
	
	
	Funcionario fun5 = new Funcionario(); 
	fun5.setNome("tiago");
	fun5.setCpf("987628932");
	fun5.setRg("685321479");
	fun5.setIdade(44);
	lista.adicionarPorPosicao(1, fun5);
	System.out.println(lista.toString());
	
	lista.removerDoInicio();
	System.out.println(lista.toString());

	lista.RemoverDoFinal();
	System.out.println(lista.toString());
	
	lista.RemoverPorPosicao(1);
	System.out.println(lista.toString());
	
	}

}
