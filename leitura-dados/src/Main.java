import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		
			String x;
			System.out.println("Digite algo: ");
			//capturar o que o usuário irá digitar
			x = sc.next();
			//imprimir o que foi escrito
			System.out.println("Você digitou: " + x);
			//fechar a variável de entrada de dados
			sc.close();

	}

}
