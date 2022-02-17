import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring an int variable and printing it
		int y = 32;
		System.out.print("Imprimindo variável int: ");
		System.out.println(y);
		
//		declaring a double variable and printing it normally and with specific cases
		double x = 10.27725;
		System.out.print("Imprimindo variável double sem formatação: ");
		System.out.println(x);
		System.out.print("Imprimindo variável double com formatação: ");
		//eclipse takes the computer location, so it prints with ','
		System.out.printf("%.2f%n", x);
		//to change printf formation to '.' insert Locale
		Locale.setDefault(Locale.US);
		System.out.print("Imprimindo variável double com formatação US: ");
		System.out.printf("%.2f%n", x);
		
//		without line brake
		System.out.print("Hello World!");
//		with line brake
		System.out.println("Hello World!");
		
//		concatenating with println
		System.out.println("resultado = " + x + " metros");
//		concatenating with printf
		System.out.printf("resultado é %.2f metros%n", x);
		String nome = "resultado";
		System.out.printf("%s é %d e %.2f %n", nome,y,x);
		
		
		
	}

}
