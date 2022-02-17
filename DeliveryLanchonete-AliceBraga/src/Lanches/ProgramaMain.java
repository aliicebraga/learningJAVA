package Lanches;

import java.util.Scanner;

public class ProgramaMain {

	////// MAIN - aqui vai a rotina de escolha do lanche
	public static void main(String[] args) {
		////////declarando o Scanner para leitura de dados
		Scanner ler = new Scanner(System.in);
		/////// declarando a variável para armazenar o lanche escolhido
		int escolhaDoTipoLanche;

		/////////// Informações printadas na tela para escolha do lanche -
		///////// dependendo da opção escolhida uma classe é instanciada
		System.out.println("--------------- Bem-vindos do Delivery do Java Express ---------------");
		System.out.println("");
		System.out.println("--------------- Menu de opções ---------------");
		System.out.println("		[ 1 ] - Bolos .......... R$ 40,90");
		System.out.println("		[ 2 ] - Massas ......... R$ (depende do tipo escolhido)");
		System.out.println("		[ 3 ] - Pizza .......... R$ (depende do tamanho escolhido)");
		System.out.println("		[ 4 ] - Salgados ....... R$ (depende do tipo escolhido)");
		System.out.println("		[ 5 ] - Sanduíches ..... R$ 10,00 + 2,00 por ingrediente escolhido");
		System.out.println("Escolha a opção desejada:");
		//leitura do número inserido pelo usuário via teclado
		escolhaDoTipoLanche = ler.nextInt();
		//dependendo do número escolhido, uma ação é tomada
		switch (escolhaDoTipoLanche) {
		//caso 1 - cria-se um novo objeto bolo e dá se continuidade pelo respectivo constructor
		case 1:
			Bolo bolo = new Bolo();
			break;
		//caso 2 - com a massa selecionada a função escolher tipo é chamada para escolher entre os tipos macarrão e lasanha
		case 2:
			System.out.println("--------------- Você escolheu Massa. Dentre as massas, você pode escolher entre: ");
			System.out.println(" ");
			escolherTipo("massa");
			break;
		//caso 3 - cria-se um novo objeto pizza e dá se continuidade pelo respectivo constructor
		case 3:
			Pizza pizza = new Pizza();
			break;
		//caso 4 - com o salgado selecionado a função escolher tipo é chamado novamente para escolher entre os tipos assado e frito
		case 4:
			System.out.println("--------------- Você escolheu Salgado. Dentre os salgados, você pode escolher entre: ");
			System.out.println(" ");
			escolherTipo("salgado");
			break;
		//caso 5 - cria-se um novo objeto sanduba e dá se continuidade pelo respectivo constructor
		case 5:
			Sanduiche sanduba = new Sanduiche();
			break;
		//se selecionar uma opção que não existe, aparece uma mensagem informativa
		default:
			System.out.println("Número inválido");
		}


	}
	
	//quando uma opção de lanche tem mais de um tipo de escolha é chamada essa função escolherTipo
	//para saber qual opção se tem um parâmetro que será setado na hora da escolha
	//com isso é feita uma nova verificação para saber qual opção foi escolhida
	public static void escolherTipo(String tipo) {
		////////declarando o Scanner para leitura de dados
		Scanner ler = new Scanner(System.in);
		int escolhaDoTipoLanche;
		//se o parâmetro for massa, é feita a rotina de escolha entre as opções macarrao e lasanha
		if (tipo == "massa") {
			System.out.println("--------------- Menu de opções ---------------");
			System.out.println(" ");
			System.out.println("			[ 1 ] - Macarrão ..........R$ (escolher o tipo)");
			System.out.println("			[ 2 ] - Lasanha ...........R$ (escolher proteína)");
			System.out.println("  ");
			System.out.println("--------------- Escolha a opção desejada:");
			System.out.println("  ");
			escolhaDoTipoLanche = ler.nextInt();
			switch (escolhaDoTipoLanche) {
			// caso 1 - cria-se um novo objeto macarrao1 e dá se continuidade pelo respectivo constructor
			case 1:
				Macarrao macarrao1 = new Macarrao();
				break;
			// caso 2 - cria-se um novo objeto lasanha1 e dá se continuidade pelo respectivo constructor
			case 2:
				Lasanha lasanha1 = new Lasanha();
				break;
			//se selecionar uma opção que não existe, aparece uma mensagem informativa
			default:
				System.out.println("Número inválido");
			}
			//se o parâmetro for outro, ou seja, salgado. é feita a rotina de escolha entre as opções assado e frito
		} else {
			System.out.println("--------------- Menu de opções ---------------");
			System.out.println(" ");
			System.out.println("			[ 1 ] - Assado .........R$ 7.90");
			System.out.println("			[ 2 ] - Frito ..........R$ 5.90");
			System.out.println("  ");
			System.out.println("--------------- Escolha a opção desejada:");
			System.out.println("  ");
			escolhaDoTipoLanche = ler.nextInt();
			switch (escolhaDoTipoLanche) {
			// caso 1 - cria-se um novo objeto assado1 e dá se continuidade pelo respectivo constructor
			case 1:
		       	 SalgadoAssado assado1 = new SalgadoAssado();
				break;
			// caso 2 - cria-se um novo objeto frito1 e dá se continuidade pelo respectivo constructor
			case 2:
		    	 SalgadoFrito frito1 = new SalgadoFrito();
				break;
			//se selecionar uma opção que não existe, aparece uma mensagem informativa
			default:
				System.out.println("Número inválido");
			}
		}
	}

	

}