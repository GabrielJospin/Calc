package operacoes;
import java.math.BigDecimal;
 
//Cria-se a interface Function que executa uma função entre 2 inteiros
public interface Function{

	
	BigDecimal execute(BigDecimal termo1, BigDecimal termo2);

	void print(BigDecimal termo1, BigDecimal termo2);

}