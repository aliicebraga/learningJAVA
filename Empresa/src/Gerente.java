
public class Gerente extends Funcionario implements GerenteInterface {

	final double BONUS_GERENTE = 500;

	public Gerente(String nome, double salario) {
		super(nome, salario);
		super.setCargo("Funcionário Gerente");
		super.setBeneficios(this.BONUS_GERENTE);
	}

	// ********** métodos comums a todos funcionarios
	public void dados() {
		super.dados();
	}

	// ********** métodos específicos do gerente
	public void ajustarSalarioPadrao(Padrao funcPadrao, double salario) {
		System.out.printf("---------Ajuste de salário do Funcionário %s ----------%n", funcPadrao.getNome());
		if(funcPadrao.getSalario()>= salario) {
			System.out.println("O salário base não pode ser reduzido.");
		} else {
			funcPadrao.setSalario(salario);
			System.out.printf("O salário base foi alterado para R$%.2f%nNovo salário total é de R$%.2f%n", funcPadrao.getSalario(), funcPadrao.getSalarioTotal());
		}
	}

	public void demitirPadrao(Padrao funcPadrao) {
		System.out.printf("---------Demissão do Funcionário %s ----------%n", funcPadrao.getNome());
		if(!funcPadrao.isAtivo()) {
			System.out.println("O funcionário já não está ativo.");
		} else {
			funcPadrao.setAtivo(false);
			System.out.println("A demissão foi feita com sucesso.");
		}

	}

	public void pagarSalarioPadrao(Padrao funcPadrao) {
		System.out.println("------------------------------------------------------------");
		if(funcPadrao.isTrabalho()) {
			System.out.printf("%s, seu pagamento foi realizado. %n", funcPadrao.getNome());
		}else {
			System.out.printf("%s, o pagamento não pode ser realizado. %n", funcPadrao.getNome());
		}

	}

	public void supervisionarPadrao(Padrao funcPadrao) {
		System.out.println("------------------------------------------------------------"); 
		if(funcPadrao.isTrabalho()) {
			System.out.printf("%s, parabéns trabalho sendo realizado.%n",funcPadrao.getNome());
		}else {
			System.out.printf("%s, você ainda não cumpriu com suas atividades%n", funcPadrao.getNome());
		}

	}

}
