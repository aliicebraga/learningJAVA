package Lanches;

import java.util.Scanner;

public class SalgadoFrito extends Salgado implements SalgadoFritoInterface{
	
	/////////// atributo do salgado frito
	private String frito;
	
	////////// constructor
	public SalgadoFrito() {
		System.out.println("Você escolheu salgado frito.");
		this.fazerFrito();
	}
	
	///////// rotina para fazer o salgado frito, os outros métodos são chamados aqui
	public void fazerFrito() {
		this.escolherFrito();
		super.escolherTipoMassaSalgado();
		System.out.println("Você escolheu um " + getFrito() + " com " + super.getTipoMassaSalgado());
   	 	System.out.println("----------------------------------------------------------------------------------------------------------- ");
		super.setPreco(5.90);
   	 	super.fecharPedido();
	}
	
	
	//////////////// método para escolher o tipo do salgado frito
	public void escolherFrito() {
		int escolhaFrito;
		Scanner ler = new Scanner(System.in);

		System.out.println("--------------- Escolha o salgado frito ---------------");
		System.out.println(" ");
		System.out.println("			[ 1 ] - Bolinha de Queijo");
		System.out.println("			[ 2 ] - Coxinha");
		System.out.println("			[ 3 ] - Enroladinho de Vina");
		System.out.println("			[ 4 ] - Kibe");
		System.out.println("Escolha a opção desejada:");
		System.out.println("  ");
		
		escolhaFrito = ler.nextInt();

		switch (escolhaFrito) {
		case 1:
			this.setFrito("Bolinha de Queijo");
			break;
		case 2:
			this.setFrito("Coxinha");
			break;
		case 3:
			this.setFrito("Enroladinho de Vina");
			break;
		case 4:
			this.setFrito("Kibe");
			break;

		default:
			System.out.println("Número inválido");
		}
		
	}
	

	/////////////////////////// getters and setters
	public String getFrito() {
		return frito;
	}


	public void setFrito(String frito) {
		this.frito = frito;
	}
}
