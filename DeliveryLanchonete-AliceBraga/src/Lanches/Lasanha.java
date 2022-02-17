package Lanches;

import java.util.Scanner;

public class Lasanha extends Massa implements LasanhaInterface{
	
	/////////////// atributos da Lasanha
	private String proteina;
	
	///////////// constructor
	public Lasanha() {
		System.out.println("Você escolheu lasanha!");
		this.fazerLasanha();
	}

	///////// método que chama as rotinas para fazer a lasanha
	public void fazerLasanha() {
		this.escolherProteina();
		super.escolherMolho();
		System.out.println("Você escolheu uma lasanha de " + getProteina() + " com " + getMolho());
   	 	System.out.println("----------------------------------------------------------------------------------------------------------- ");
		super.fecharPedido();
	}
	
	///////// método para escolher a proteina da lasasnha
	public void escolherProteina() {
		int escolhaDoTipoMassa;
		Scanner ler = new Scanner(System.in);

		System.out.println("--------------- Escolha a proteína ---------------");
		System.out.println(" ");
		System.out.println("			[ 1 ] - Queijo ...... R$ 27,80");
		System.out.println("			[ 2 ] - Frango ........... R$ 22,50");
		System.out.println("			[ 3 ] - Carne ....... R$ 78,90");
		System.out.println("Escolha a opção desejada:");
		System.out.println("  ");
		
		escolhaDoTipoMassa = ler.nextInt();

		switch (escolhaDoTipoMassa) {
		case 1:
			this.setProteina("Queijo");
			super.setPreco(27.80);

			break;
		case 2:
			this.setProteina("Frango");
			super.setPreco(22.50);
			break;
		case 3:
			this.setProteina("Carne");
			this.setPreco(78.90);
			break;

		default:
			System.out.println("Número inválido");
		}
		
	}
	
	////////////////getters and setters

	public String getProteina() {
		return proteina;
	}

	public void setProteina(String proteina) {
		this.proteina = proteina;
	}
	


}
