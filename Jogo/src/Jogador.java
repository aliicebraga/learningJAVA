
public class Jogador {
	public String nome = "";
	public int idade = 0;
	public int vidas = 3;
	public boolean ativo = true;
	public int pontos;
	static int quantJogadores;
	
	public Jogador(String nomeParametro, int idadeParametro) {
		this.nome = nomeParametro;
		this.idade = idadeParametro;
		this.vidas = 3;
		this.ativo = true;
		this.pontos= 0;
//		pra saber quantos jogadores foram criados
		quantJogadores++;
		System.out.println("Jogador criado!");
	}
	
//	métodos gets são acessados pelas outras classes e tem retorno
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
//	métodos set não tem retorno
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void ganhaVida() {
		this.vidas++;
	}
	public void perdeVida() {
		if(this.ativo) {
			if(this.vidas == 1) {
				System.out.println("game over x.x");
				setAtivoFalse();
				
			} else {
				this.vidas--;
				System.out.println("Dano, sua vida atual: " + this.vidas);
			}
		}else {
			System.out.println("você não tem mais permissão para jogar.");
		}
	}
	public int getVidas() {
		return this.vidas;
	}

	public void setAtivoFalse() {
		this.ativo = false;
	}
	
	public void jogar() {
		if(this.getVidas()>=0) {
			this.perdeVida();
		}
	}
	
	public void dados() {
		System.out.println("--------------------");
		System.out.println("Nome do jogador: " + this.nome);
		System.out.println("Idade do jogador: " + this.getIdade());
		System.out.println("Vidas do jogador: " + this.getVidas());
		System.out.println("Pontos do jogador: " + this.pontos);
		
	}
	
	public void pontuar(int pontos) {
		this.pontos += pontos;
	}
	
}
