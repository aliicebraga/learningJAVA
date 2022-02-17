
public class Supervisor extends Funcionario implements SupervisorInterface{
	
	final double BONUS_SUPERVISOR = 800;
	public Supervisor(String nome, double salario) {
		super(nome, salario);
		this.setCargo("Funcionário Supervisor");
		super.setBeneficios(this.BONUS_SUPERVISOR);
	
	}

//nesse caso passa só o valor do aumento
	public void ajustarSalarioGerente(Gerente funcGerente, double valor) {
		funcGerente.setSalario(funcGerente.getSalario() + valor) ;
		System.out.println("------------------------------------------------------------");
		System.out.printf("%s, você agora terá um reajuste de: R$ %.2f%n", funcGerente.getNome(), valor);
		System.out.printf("O seu novo salário é de: R$ %.2f%n", (funcGerente.getSalario() + funcGerente.getBeneficios()));
		
	}


	public void demitirGerente(Gerente funcGerente) {
	
		System.out.println("------------------------------------------------------------");
		if(funcGerente.isAtivo()) {
			funcGerente.setAtivo(false);
			funcGerente.setTrabalho(false);
			System.out.printf("%s, foi demitido%n", funcGerente.getNome());
		}else {
			System.out.printf("%s, já não esta ativo.%n", funcGerente.getNome());
		}
		
	}


	public void pagarSalarioGerente(Gerente funcGerente) {
	
		System.out.println("------------------------------------------------------------");
		if(funcGerente.isTrabalho()) {
			System.out.printf("%s, seu pagamento foi realizado. %n", funcGerente.getNome());
		}else {
			System.out.printf("%s, o pagamento não pode ser realizado. %n", funcGerente.getNome());
		}
		
	}


	public void supervisionarGerente(Gerente funcGerente) {
		
		System.out.println("------------------------------------------------------------"); 
		if(funcGerente.isTrabalho()) {
			System.out.printf("%s, parabéns trabalho sendo realizado.%n",funcGerente.getNome());
		}else {
			System.out.printf("%s, você ainda não cumpriu com suas atividades%n", funcGerente.getNome());
		}
		
	}

}
