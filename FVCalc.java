// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double nrate = (rate/100) +1;


		double b =  Math.pow(nrate, n);
		int futureValue = (int) (currentValue*b);
		System.out.println("After 2 years, $" + currentValue + " saved at " + rate + "% will yield $" + futureValue );
	}
	
}
