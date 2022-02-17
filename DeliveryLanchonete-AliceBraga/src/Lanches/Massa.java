package Lanches;

import java.util.Scanner;

public abstract class Massa extends Lanche implements MassaInterface{
	
	////////// atributos referentes a massa
	private String molho;
	private int escolhaDoTipoMolho;
	
	/////////// constructor
	public Massa() {

	}
	
	////////// método para escolher o tipo de molho
	public void escolherMolho() {
		System.out.println("--------------- Escolha seu o molho:");
		System.out.println("");
		   
			Scanner ler3 = new Scanner(System.in);
	       
			System.out.println("--------------- Menu de opções ---------------");
			System.out.println("			[ 1 ] - Molho ao Sugo ");
			System.out.println("			[ 2 ] - Molho Branco");
			System.out.println("			[ 3 ] - Molho Bolonhesa");
			System.out.println(" Escolha a opção desejada:");
	       
			escolhaDoTipoMolho = ler3.nextInt();
	       
			switch (escolhaDoTipoMolho) {
				case 1:
					this.setMolho("Molho ao Sugo");
	       			break;
	       		case 2:
	       			this.setMolho("Molho Branco");
	       			break;
	       		case 3:
	       			this.setMolho("Molho Bolonhesa");
	       			break;
	       		default:
	       			System.out.println("Número inválido");
	       }
	}
	
	
	///////////// getters and setters

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	public String getMolho() {
		return this.molho;
	}

	
}
