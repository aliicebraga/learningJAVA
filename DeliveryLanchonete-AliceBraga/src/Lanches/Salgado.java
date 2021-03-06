package Lanches;

import java.util.Scanner;

public abstract class Salgado extends Lanche implements SalgadoInterface{
	
	/////////////// atributo do salgado
	private String tipoMassaSalgado;
	
	////////// constructor
	public Salgado() {}
	
	
	////////// método para escolher o tipo de massa do salgado
	/// as opções de massa são apresentadas ao usuário e ele escolhe dentre as opções
	@Override
	public void escolherTipoMassaSalgado() {
			int escolhaTipo;
			Scanner ler = new Scanner(System.in);

			System.out.println("--------------- Escolha o tipo da massa do salgado ---------------");
			System.out.println(" ");
			System.out.printf("			[ 1 ] - Massa de Batata%n");
			System.out.printf("			[ 2 ] - Massa de Mandioca%n");
			System.out.printf("			[ 3 ] - Massa Integral%n");
			System.out.println("Escolha a opção desejada:");
			System.out.println("  ");

			escolhaTipo = ler.nextInt();

			switch (escolhaTipo) {
			case 1:
				this.setTipoMassaSalgado("Massa de Batata");

				break;
			case 2:
				this.setTipoMassaSalgado("Massa de Mandioca");
				break;
			case 3:
				this.setTipoMassaSalgado("Massa Integral");
				break;

			default:
				System.out.println("Número inválido");
			}

	}

	///////////////////// getters and setters
	
	public String getTipoMassaSalgado() {
		return tipoMassaSalgado;
	}

	public void setTipoMassaSalgado(String tipoMassaSalgado) {
		this.tipoMassaSalgado = tipoMassaSalgado;
	}

}
