
abstract class Gerencia extends Funcionario implements GerenciaInterface{

	public Gerencia(String nome, double salario) {
		super(nome, salario);
		
	}
	
	public void ajustarSalario(Funcionario func, double valorAumento) {
		func.setSalario(func.getSalario() + valorAumento) ;
		System.out.println("------------------------------------------------------------");
		System.out.printf("%s, você agora terá um reajuste de: R$ %.2f%n", func.getNome(), valorAumento);
		System.out.printf("O seu novo salário é de: R$ %.2f%n", func.getSalarioTotal() );
	}
	
	public void demitir(Funcionario func) {
		System.out.println("------------------------------------------------------------");
		if(func.isAtivo()) {
			func.setAtivo(false);
			func.setTrabalho(false);
			System.out.printf("%s, foi demitido%n", func.getNome());
		}else {
			System.out.printf("%s, já não esta ativo.%n", func.getNome());
		}
	}
	
	public void pagarSalario(Funcionario func) {
		System.out.println("------------------------------------------------------------");
		if(func.isTrabalho()) {
			System.out.printf("%s, seu pagamento foi realizado. %n", func.getNome());
		}else {
			System.out.printf("%s, o pagamento não pode ser realizado. %n", func.getNome());
		}
	}
	
	public void supervisionar(Funcionario func) {
		System.out.println("------------------------------------------------------------"); 
		if(func.isTrabalho()) {
			System.out.printf("%s, parabéns trabalho sendo realizado.%n",func.getNome());
		}else {
			System.out.printf("%s, você ainda não cumpriu com suas atividades%n", func.getNome());
		}
	}

}
