package Lanches;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pizza extends Lanche implements PizzaInterface {

	///////// atributos da pizza
	/// os final são constantes, então como o preço não muda são declarados com esse modificador de acesso
	final double PIZZA_P = 24.90;
	final double PIZZA_M = 39.90;
	final double PIZZA_G = 54.90;
	private String tamanho;
	String[] sabores = { "Milho", "Milho com Bacon", "Milho com Frango", "Milho com Parmesão", "Milho com Brócolis" };
	List<String> saborEscolhido = new ArrayList<>();

	public Pizza() {
		System.out.println("Você escolheu pizza!");
		this.fazerPizza();
	}

	/////// método com a rotina de fazer a pizza
	public void fazerPizza() {
		this.escolherTamanho();
		System.out.println("Você escolheu uma pizza de " + getSaborEscolhido() + " tamanho " + getTamanho());
		System.out.println(
				"----------------------------------------------------------------------------------------------------------- ");
		super.fecharPedido();
	}

	//	método para escolher o tamanho da pizza
	//// como o preço depende do tamanho, ao escolher o tamanho já seta o preço
	// ao escolher o tamanho já tem-se quantos sabores pode se escolher (pois depende do tamanho)
	//então o tamanho passa como parâmetro do método escolherSabor
	public void escolherTamanho() {
		int escolhaTamanho;
		Scanner ler = new Scanner(System.in);

		System.out.println("--------------- Escolha o tamanho da pizza ---------------");
		System.out.println(" ");
		System.out.printf("			[ 1 ] - Pequena (4 pedaços - 1 sabor) ...... R$%.2f%n", PIZZA_P);
		System.out.printf("			[ 2 ] - Média (8 pedaços - 2 sabores) ........ R$%.2f%n", PIZZA_M);
		System.out.printf("			[ 3 ] - Grande (12 pedaços - 3 sabores) ...... R$%.2f%n", PIZZA_G);
		System.out.println("Escolha a opção desejada:");
		System.out.println("  ");

		escolhaTamanho = ler.nextInt();

		switch (escolhaTamanho) {
		case 1:
			this.setTamanho("Pequeno");
			super.setPreco(PIZZA_P);
			this.escolherSabor(1);

			break;
		case 2:
			this.setTamanho("Médio");
			super.setPreco(PIZZA_M);
			this.escolherSabor(2);
			break;
		case 3:
			this.setTamanho("Grande");
			this.setPreco(PIZZA_G);
			this.escolherSabor(3);
			break;

		default:
			System.out.println("Número inválido");
		}

	}

	//	método para escolher o sabor da pizza
	public void escolherSabor(int quantSabor) {

		System.out.printf("-------- Escolha até 0%d sabores de Pizza: %n", quantSabor);

		// ordenar o array sabores em ordem alfabética para ser printado na tela
		Arrays.sort(sabores);
		// for pra percorrer todas as posições do array sabores
		for (int i = 0; i < sabores.length; i++) {

			// printar o sabores um por um
			System.out.printf("Sabor %d: %s.%n", i + 1, sabores[i]);
		}

		// rotina para o usuário escolher um dos sabores
		// declaração do scanner que vai ler o dado do teclado
		Scanner lerDados = new Scanner(System.in);
		// variável que vai armazenar o sabor escolhido
		int escolhaDoIngrediente = 10;

		while ((quantSabor != 0) && escolhaDoIngrediente != 0) {

			System.out.println("-------- Digite o número do ingrediente ou [0] para encerrar a escolha.");

			escolhaDoIngrediente = lerDados.nextInt();

			if (escolhaDoIngrediente < sabores.length + 1) {
				for (int i = 0; i < sabores.length; i++) {

					if (i + 1 == escolhaDoIngrediente) {
						this.setSaborEscolhido(sabores[i]);
					}
					
				}
				quantSabor--;
			} else {
				System.out.println("Escolha uma opção válida!");
			}
		}

	}

		///////////// getters and setters
	private List<String> getSaborEscolhido() {
		return saborEscolhido;
	}

	private void setSaborEscolhido(String sabor) {
		saborEscolhido.add(sabor);
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
