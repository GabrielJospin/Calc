import operacoes.*;

//Cria Todas as funções e adiciona elas em listas com seus reespectivos

class CriaOperacoes{

	public Function soma = new Sum();
	public Function mult = new Mult();
	public Function minus  = new Minus(); 
	public Function div = new Div(); 
	public Function pow = new Pow(); 
	public Function root = new Root();
	public Function max = new Max();
	public Function min = new Min();
	
	public Lista lista = new Lista();
	
	CriaOperacoes(){
		
		lista.insere(soma, "Sum");
		lista.insere(mult, "Mult");
		lista.insere(minus, "Minus");
		lista.insere(div, "Div");
		lista.insere(pow, "Pow");
		lista.insere(root, "Root");
		lista.insere(max, "Max");
		lista.insere(min, "Min");
	}
}