
public class Main {

	public static void main(String[] args) {
		int x,y;
		double result;
		x = 5;
		y = 2;
		//WITHOUT o casting
		result = x/y;
		System.out.printf("O resultado de %d / %d = %.2f%n", x,y,result);
		//WITH casting
		result = (double) x/y;
		System.out.printf("O resultado de %d / %d = %.2f%n", x,y,result);

		int b;
		double a;
		a = 5.0;
		b= (int) a;
		System.out.println(b);
		
	}

}
