import operacoes.*;

class No{
	Function funcao;
	No prox = null;
	String name;

	public No(Function funcao, String name){
		this.funcao = funcao;
		this.name = name;
	}
}
