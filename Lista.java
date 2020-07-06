import operacoes.*;

//Cria-se a Lista de Fun

class Lista{
	No cabeca;
	int tamanho;

	public Lista(){
		this.cabeca=null;
	}

	public void insere(Function funcao, String name){
		No aux = new No(funcao, name);
		aux.prox = this.cabeca;
		this.cabeca = aux;
		tamanho ++;
	}

	public Function pesquisa(String func){
		No ref;
		String name;
		for(int i = 0; i<=tamanho+1; i++ ){
			ref=this.cabeca;
			for(int j = 0; j<tamanho; j++ ){
				if(func.equals(ref.name)){
					return ref.funcao;						
				}
				ref = ref.prox;			
			}
		}
		return null;
	}

}