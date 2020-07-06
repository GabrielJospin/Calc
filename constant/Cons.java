package constant;

public class Cons{

	public static double golden(int n){
		if (n == 0) return 1;
		else return (1+1/golden(n-1));
	}

	public static double pi(int n){
		double result = 4;
		for(int i = 3; i<n  ; i+=2){
			result += (-4/i);
		}
		return result;
	}

}