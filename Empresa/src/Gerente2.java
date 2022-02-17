
public class Gerente2 extends Gerencia implements Gerente2Interface{
	
	final double BONUS_GERENTE = 500;
	public Gerente2(String nome, double salario) {
		super(nome, salario);
		super.setCargo("Funcionário Gerente");
		super.setBeneficios(this.BONUS_GERENTE);
	}
	
	//*********** métodos que foram herdados
	public void dados() {
		super.dados();
	}
	
	@Override
	public void ajustarSalarioPadrao(Padrao funcPadrao, double valorAumento) {
		super.ajustarSalario(funcPadrao, valorAumento);
	}
	
	public void demitirPadrao(Padrao funcPadrao) {
		super.demitir(funcPadrao);
	}
	
	public void pagarSalarioPadrao(Padrao funcPadrao) {
		super.pagarSalario(funcPadrao);
	}
	
	public void supervisionarPadrao(Padrao funcPadrao) {
		super.supervisionar(funcPadrao);
	}
	
	//*********** métodos que são exclusivos do Gerente2 e estão descritos no Gerente2Interface
	public void darFolga() {
		System.out.println("Esse método é exclusivo do Gerente, só ele pode dar folga aos funcionários padrão.");
		
	}

}
