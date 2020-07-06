package operacoes;
import java.math.BigDecimal;

//Mult é uma função que multiplica dois inteiros
public class Mult implements Function{
	
	public BigDecimal execute(BigDecimal fator1, BigDecimal fator2){
		return fator1.multiply(fator2);
	}

	public void print(BigDecimal fator1, BigDecimal fator2){
		BigDecimal result = execute(fator1, fator2);
		System.out.printf(" %.3f x %.3f = %.3f ", fator1, fator2, result );
	}

}