
public class ContaCorrente extends Conta{
	
	private final String atendimento ="Sem prioridades";

	public ContaCorrente(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
		// TODO Auto-generated constructor stub
	}
	public void dados() {
//		importou da super classe o método dados através do super
		super.dados();
		System.out.println("Atendimento : "+ this.getAtendimento());
		
	}
	public String getAtendimento() {
		return atendimento;
	}
	
	public void sacar(double valor) {
		System.out.println("-----------------");
		if(valor <= this.getSaldo()) {
			this.saldo -= valor;
			System.out.printf("Olá, %s, seu saque de R$%.2f foi realizado com sucesso. Seu novo saldo é de R$%.2f.%n",this.titular, valor,this.saldo);
		} else {
			System.out.printf("Olá, %s. Você possui o saldo de R$%.2f. Seu saldo é insuficiente para o saque.%n", this.titular,this.saldo);
		}
	}
	
	public void depositar(double valor) {
		System.out.println("-----------------");
		this.saldo += valor;
		System.out.printf("Olá, %s, seu depósito de R$%.2f foi realizado com sucesso. Seu novo saldo é de R$%.2f.%n",this.titular,valor, this.saldo);
		
	}
}
