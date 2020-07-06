/***********************************/
/**        <Calculadora>          **/
/**                               **/
/**   <Funções>                   **/
/**   <Sum><a+b>                  **/
/**   <Minus><a-b>                **/ 
/**   <Mult><a*b>                 **/
/**   <Div><a/b>                  **/
/**   <Pow><a^b>                  **/
/**   <Root><a^/b>                **/
/**   <Min><a or b>               **/
/**   <Max><a or b>               **/
/**                               **/
/***********************************/


import java.util.Scanner;
import java.math.BigDecimal;
import operacoes.*;
import constant.*;




public class Calc implements Constant {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "Insira a fucao " );
	
		String funcIn = scanner.next();
		
		CriaOperacoes operacoes = new CriaOperacoes();

		Function funcao = operacoes.lista.pesquisa(funcIn);

		ListaNum numeros = new ListaNum();

		String scann = " ";

		while (scanner.hasNext()) {
			try{
				scann = scanner.next();
				numeros.insere(new BigDecimal(scann));
			} catch (Exception e) {
				if (scann.equals("e")) numeros.insere(new BigDecimal(E));
				else if(scann.equals("pi")) numeros.insere(new BigDecimal(PI));
				else if(scann.equals("Phi")) numeros.insere(new BigDecimal(PHI));
				else break;
			}		
		}

		NoNum ref = numeros.cabeca;
		BigDecimal result = ref.num;
		while(ref.prox != null){
			ref = ref.prox;
			result = funcao.execute(result, ref.num);
		}

		System.out.print(result);
	}

}