
public class Supervisor2 extends Gerencia implements Supervisor2Interface {
	
	final double BONUS_SUPERVISOR= 500;
	public Supervisor2(String nome, double salario) {
		super(nome, salario);
		super.setCargo("Funcionário Gerente");
		super.setBeneficios(this.BONUS_SUPERVISOR);
	}
	
	//*********** métodos que foram herdados
	public void dados() {
		super.dados();
	}
	
	public void ajustarSalarioGerente(Gerente funcGerente, double valorAumento) {
		super.ajustarSalario(funcGerente, valorAumento);
	}
	
	public void demitirGerente(Gerente funcGerente) {
		super.demitir(funcGerente);
	}
	
	public void pagarSalarioGerente(Gerente funcGerente) {
		super.pagarSalario(funcGerente);
	}
	
	public void supervisionarGerente(Gerente funcGerente) {
		super.supervisionar(funcGerente);
	}
	
	//*********** métodos que são exclusivos do Supervisor2 e estão descritos no Supervisor2Interface
	public void declararPontoFacultativo() {
		System.out.println("Esse método é exclusivo do Supervisor, só ele pode declarar ponto facultativo.");
		
	}
}
