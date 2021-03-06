package Lanches;

import java.util.Scanner;

// a classe lanche é abstrata, ou seja, não pode ser instanciada. ela é herdada.
// aqui vão todos os métodos que são usados por todas as subclasses, isso evita repetições desnecessárias
public abstract class Lanche implements LancheInterface {
	////////// atributos que são comuns a todas as classes
	private double preco;
	private double distancia;
	private double tempoTotal;
	
	///////// constructor
	public Lanche() {}

	//// método fecharPedido que será utilizado em todas as subclasses instanciadas
	/// aqui é chamado o método mensagemTempoDeEntrega e agradecimento
	public void fecharPedido() {
		mensagemTempoDeEntrega();
		System.out.println("--------------- Seu pedido foi realizado com sucesso ---------------");
		System.out.printf("Seu pedido ficou em: R$%.2f%n", getPreco());
		agradecimento();
	
	}
	
	//// método mensagemTempoDeEntrega será utilizado quando uma das sbuclasses chamarem o método fechar pedido
	public void mensagemTempoDeEntrega() {
		System.out.println("--------------- --------------- --------------- --------------- ");
		System.out.println("Para cálculo do tempo de entrega, precisamos saber a distância até sua casa!");
		System.out.println(" ");
		System.out.println(" Qual a distância da sua casa? (em km)");
		calcularTempo();
	}
	
	/// método para calcular o tempo de entrega, ele será chamado pelo método mensagemTempoDeEntrega
	public void calcularTempo() {
		////////declarando o Scanner para leitura de dados
		Scanner ler = new Scanner(System.in);
		this.setDistancia(ler.nextDouble());
		double inteira,resto;
		this.tempoTotal = (getDistancia() * 10) + 30;
		
		inteira = tempoTotal / 60;
		
		resto = tempoTotal % 60;
		System.out.println("--------------- TEMPO DE ENTREGA --------------- ");
		System.out.println((int)inteira + " hora e " + resto + " minutos" );
		System.out.println("--------------- --------------- --------------- --------------- ");
		
	}
	
	//// método agradecimento será chamado pelo método fecharPedido 
	public static void agradecimento() {
		System.out.println(" _________________________________________________________________________________________ ");
		System.out.println(" ");
		System.out.println("                Agradecemos a sua preferência e desejamos bom apetite!!!");
		System.out.println(" ");
		
	}
	
	
	//////////////////// getters e setters que serão acessados pelas subclasses pois os atributos tem modificadores de acesso private
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

}
	


