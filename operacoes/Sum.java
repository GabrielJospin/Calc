package operacoes;
import java.math.BigDecimal;
public class Sum implements Function{

	public  BigDecimal execute(BigDecimal parcela1, BigDecimal parcela2) {
		return parcela1.add(parcela2);
	}

	public void print(BigDecimal parcela1, BigDecimal parcela2){
		BigDecimal result = execute(parcela1, parcela2);
		System.out.printf(" %.3f + %.3f = %.3f ", parcela1, parcela2, result );
	}

}