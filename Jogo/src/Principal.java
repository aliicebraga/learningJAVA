
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogador j1 = new Jogador("Alice", 25);
		Jogador j2 = new Jogador("Carol", 36);
		Jogador j3 = new Jogador("Rauny", 34);
//		System.out.printf("Jogador 1: %s, %d.%nJogador 2: %s, %d.%nJogador 3: %s, %d.%n", j1.nome,j1.idade, j2.getNome(),j2.getIdade(),j3.nome,j3.idade);
//		while(j1.ativo) {
//			j1.jogar();
//		}
		System.out.println("--------------------");
		System.out.println("Quantidade de jogadores: " + Jogador.quantJogadores);
		
		j1.pontuar(27);
		j2.pontuar(42);
		j3.pontuar(32);
		j2.pontuar(-5);
		
		j1.dados();
		j2.dados();
		j3.dados();
		
	}

}
