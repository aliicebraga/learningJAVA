
public class Padrao extends Funcionario implements PadraoInterface{

	public Padrao(String nome, double salario) {
		super(nome, salario);
		super.setCargo("Funcionário Padrão");
	}

	public void trabalhar() {
		super.trabalhar();
	}
	
	public void dados() {
		super.dados();
		System.out.printf("Cargo: %s.%n",  this.getCargo());
	}

	public void baterPonto() {
		System.out.println("Você cumpriu a sua carga horária do dia.");
		
	}
	
	
}
