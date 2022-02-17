import java.util.Scanner;

public class Triangulo {
	Scanner scan = new Scanner(System.in);
	public int base = 0;
	public int altura = 0;
	
//	se quiser pedir os valores pelo scan
//	public Triangulo() {
//		System.out.println("Digite o valor da base: ");
//		this.base = scan.nextInt();
//		System.out.println("Digite o valor da altura: ");
//		this.altura = scan.nextInt();
//	}
	
	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public int getBase() {
		return this.base;
	}
	public int getAltura() {
		return this.altura;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int areaTriangulo() {
		return (this.getBase()*this.getAltura())/2;
	}
}
