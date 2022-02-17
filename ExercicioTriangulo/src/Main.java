
public class Main {

	public static void main(String[] args) {
//		se quiser pedir os valores tem que descomentar lá na class Triangulo
//		Triangulo t1 = new Triangulo();
//		Triangulo t2 = new Triangulo();
//		Triangulo t3 = new Triangulo();
		
		Triangulo t1 = new Triangulo(3,4);
		Triangulo t2 = new Triangulo(5,6);
		Triangulo t3 = new Triangulo(7,5);
		System.out.printf("O primeiro triângulo tem %dm de base, %dm de altura e %dm² de área.%n",t1.getBase(), t1.getAltura(), t1.areaTriangulo());
		System.out.printf("O segundo triângulo tem %dm de base, %dm de altura e %dm² de área.%n",t2.getBase(), t2.getAltura(), t2.areaTriangulo());
		System.out.printf("O terceiro triângulo tem %dm de base, %dm de altura e %dm² de área.%n",t3.getBase(), t3.getAltura(), t3.areaTriangulo());
	}

}
