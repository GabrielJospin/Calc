package operacoes;
import java.math.*;

//Div é uma função que divide dois inteiros
public class Div implements Function{
	
	public BigDecimal execute(BigDecimal divisor, BigDecimal dividendo){
		return (divisor.divide(dividendo,3,RoundingMode.DOWN));
	}

	public void print(BigDecimal divisor, BigDecimal dividendo){
		BigDecimal result = execute(divisor, dividendo);
		System.out.printf(" %.3f / %.3f = %.3f ", divisor, dividendo, result );
	}
}