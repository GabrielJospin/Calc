package operacoes;
import java.math.BigDecimal;
public class Max implements Function{

	public  BigDecimal execute(BigDecimal termo1, BigDecimal termo2) {
	return termo1.max(termo2);
	}

	public void print(BigDecimal termo1, BigDecimal termo2){
		BigDecimal result = execute(termo1, termo2);
		System.out.printf(" o maximo entre %.3f e %.3f = %.3f ", termo1, termo2, result );
	}

}