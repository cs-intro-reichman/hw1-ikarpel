// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		double lim = Integer.parseInt(args[0]);
		int num1 = (int) (lim * Math.random());
		int num2 = (int) (lim * Math.random());
		int num3 = (int) (lim* Math.random());
		
		System.out.println(num1+ " " + num2 + " " + num3);

		
	}
}

