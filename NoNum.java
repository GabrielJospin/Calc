import operacoes.*;
import java.math.BigDecimal;

class NoNum{
	BigDecimal num;
	NoNum prox = null;
	int pos = 0;

	public NoNum(BigDecimal num){
		this.num = num;
		pos++;
	}
}