package operacoes;
import java.math.BigDecimal;

//Div é uma função que divide dois inteiros
public class Minus implements Function{
	
	public BigDecimal execute(BigDecimal fator1, BigDecimal fator2){
		return (fator1.subtract(fator2));
	}

	public void print(BigDecimal adtivo, BigDecimal subtrativo){
		BigDecimal result = execute(adtivo, subtrativo);
		System.out.printf("%.3f - %.3f = %.3f ", adtivo, subtrativo, result );
	}

}