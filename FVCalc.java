// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]);
		double nrate = rate/100;

		for (int i = 0; i <= n; i++) {
			currentValue = currentValue + (currentValue * rate); 
		}
		System.out.println("future value:" + currentValue);
		
	}
	j
}
