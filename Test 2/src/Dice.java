public class Dice {	
	public double Throw(double user) {	
		double total = 0;
		for (double k = user; k >0; k--){
			int die = (int) (1 + (Math.random() * 6));
			System.out.printf("%d\n", die);
			total = total + die;
		}
			System.out.printf("%s\n", total);
			return total;
	}
}