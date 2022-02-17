//classe abstrata não pode ser instanciada, ela é herdada
abstract class Funcionario {
	//***** modificadores de acesso PRIVATE não são acessíveis por outras classes
	//***** modificadores de acesso DEFAULT são acessíveis apenas pelo mesmo pacote
	//***** modificadores de acesso PROTECTED são acessíveis por subclasses e classes do mesmo pacote
	//***** modificadores de acesso PUBLIC são acessíveis por todas as classes
	
	protected String nome;
	protected String cargo;
	private double salario;
	private double beneficios;
//	private double salarioTotal;
	private boolean filhos;
	private boolean ativo;
	private boolean trabalho;
	final double BONUS_FAMILIA = 350.50;


	// **********constructor**************
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
//		this.salarioTotal = salario;
		this.ativo = true;
	}
	
	// *********** métodos comuns a todos funcionários
	
	public void dados() {
		System.out.println("------------- Dados do funcionário -------------");
		System.out.printf("Nome: %s.%n", this.getNome());
		System.out.printf("Cargo: %s.%n",  this.getCargo());
		System.out.printf("Salário: R$%.2f%n", this.getSalarioTotal());
		System.out.printf("O funcionário tem filhos? %s.%n",(this.isFilhos()? "Sim" : "Não"));
		System.out.printf("O funcionário está ativo? %s.%n", (this.isAtivo()? "Sim" : "Não"));
	
	}
	
	public void informarFilho() {
		if(this.isFilhos()) {
			System.out.println("Você já informou anteriormente que tem filhos.");
		}else {
			this.setFilhos(true);
			this.setBeneficios(this.BONUS_FAMILIA);
//			this.setSalarioTotal(this.getSalario() + this.getBeneficios());
			System.out.printf("------------- Inclusão do bônus família no valor de R$%.2f -------------%n", this.BONUS_FAMILIA);
			System.out.printf("Nome: %s.%n", this.getNome());
			System.out.printf("Novo salário: R$%.2f%n", this.getSalarioTotal());
		}
	}
	


	public void trabalhar() {
		this.setTrabalho(true);
		System.out.printf("Olá, %s seu trabalho foi registrado com sucesso!", this.getNome());
	
	}
	
	// ***********getters and setters**********
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public boolean isFilhos() {
		return filhos;
	}

	public void setFilhos(boolean filhos) {
		this.filhos = filhos;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public boolean isTrabalho() {
		return trabalho;
	}

	public void setTrabalho(boolean trabalho) {
		this.trabalho = trabalho;
	}

	public double getBONUS_FAMILIA() {
		return BONUS_FAMILIA;
	}
	public double getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(double beneficios) {
		this.beneficios += beneficios;
	}

	public double getSalarioTotal() {
		return this.getSalario() + this.getBeneficios();
	}

//	public void setSalarioTotal(double salarioTotal) {
//		this.salarioTotal = salarioTotal;
//	}
}
