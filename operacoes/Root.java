package operacoes;
import java.math.*;

//Cria-se a interface Function que executa uma função entre 2 inteiros
public class Root implements Function{

	
	public BigDecimal execute(BigDecimal radical, BigDecimal indice){
		double aux = 1/(indice.doubleValue());
		return new BigDecimal(Math.pow(radical.doubleValue(),aux));
	}

	public void print(BigDecimal radical, BigDecimal indice){
		BigDecimal result = execute(radical, indice);
		System.out.printf(" %.10f ^/( %.10f ) = %.10f ", indice, radical, result );
	}

}