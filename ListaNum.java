import operacoes.*;
import java.math.BigDecimal;

class ListaNum{
	NoNum cabeca;
	int tamanho;

	public ListaNum(){
		this.cabeca=null;
	}

	public void insere(BigDecimal num){
		NoNum aux = new NoNum(num);
		aux.prox = this.cabeca;
		this.cabeca = aux;
		tamanho ++;
	}
}