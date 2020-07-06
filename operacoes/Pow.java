package operacoes;
import java.math.*;

//Cria-se a interface Function que executa uma função entre 2 inteiros
public class Pow implements Function{

	
	public BigDecimal execute(BigDecimal base, BigDecimal expoente){
		double aux = expoente.doubleValue();
		return new BigDecimal(Math.pow(base.doubleValue(),aux));
	}

	public void print(BigDecimal base, BigDecimal expoente){
		BigDecimal result = execute(base, expoente);
		System.out.printf(" %.3f ^ %.3f = %.3f ", base, expoente, result );
	}

}