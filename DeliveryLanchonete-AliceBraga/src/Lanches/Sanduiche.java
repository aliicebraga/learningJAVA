package Lanches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sanduiche extends Lanche implements SanduicheInterface {

	/////////// atributos do sanduiche
	List<String> ingredientes = new ArrayList<>();

	///////// constructor
	public Sanduiche() {
		System.out.println("Você escolheu sanduiche!");
		this.fazerSanduba();
	}
	
	/////// rotina de preparo do sanduiche
	public void fazerSanduba() {
		System.out.println("--------------- Para o sanduíche precisa escolher entre os ingredientes ---------------");
		System.out.println(" ");
		this.escolherIngredientes();
		System.out.println("Você escolheu um sanduíche com " + getIngrediente());
   	 	System.out.println("----------------------------------------------------------------------------------------------------------- ");
   	 	super.fecharPedido();
	}
	
	
	//////// método escolherIngredientes
	//// com esse método os ingredientes são apresentados na tela e o usuário pode escolher até 10 para colocar no sanduiche
	public void escolherIngredientes() {
		int escolhaDoIngrediente = 11, contador = 0;
		double quantIngrediente = -1;
		Scanner lerDados = new Scanner(System.in);

		System.out.println("			1 - queijo        2 - presunto       3 - bacon          4 - alface ");
		System.out.println("			5 - tomate        6 - catupiry       7 - maionese       8 - abacaxi ");
		System.out.println("			9 - batata Palha  10 - mostarda      0 - para encerrar a escollha");
		System.out.println(" ");
		System.out.println("--------------- Você pode escolher até 10 ingredientes: ");

		
		while ((contador < 10) && escolhaDoIngrediente != 0) {

			System.out
					.println("--------------- Digite o número do ingrediente ou [0] para encerrar a escolha ");

			escolhaDoIngrediente = lerDados.nextInt();

			switch (escolhaDoIngrediente) {
			case 1:
				this.setIngrediente("queijo");
				break;
			case 2:
				this.setIngrediente("preseunto");
				break;
			case 3:
				this.setIngrediente("bacon");
				break;
			case 4:
				this.setIngrediente("alface");
				break;
			case 5:
				this.setIngrediente("tomate");
				break;
			case 6:
				this.setIngrediente("catupiry");
				break;
			case 7:
				this.setIngrediente("maionese");
				break;
			case 8:
				this.setIngrediente("abacaxi");
				break;
			case 9:
				this.setIngrediente("batata palha");
				break;
			case 10:
				this.setIngrediente("mostarda");
				break;
			case 0:
				break;
			default:
				System.out.println("Número inválido");
			}
			contador++;
			quantIngrediente++;
			System.out.println("--------------- --------------- --------------- ---------------");
			System.out.println("Você escolheu os ingredientes: " + this.getIngrediente());
			this.getIngrediente();
			System.out.println(" ");

		}
		this.setPreco(10 + quantIngrediente * 2);

	}

	
	///////////////////// getters and setters
	
	public void setIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente);

	}

	public List<String> getIngrediente() {
		return this.ingredientes;
		

	}

}
