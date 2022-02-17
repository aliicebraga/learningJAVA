
public class ContaPoupanca extends Conta{
	private final String atendimento = "Com prioridade.";
	public double qntdDepositos;

	public ContaPoupanca(String titular, int numero, double saldo) {
		super(titular, numero, saldo);
		this.qntdDepositos++;
	}
	
	
	public String getAtendimento() {
		return atendimento;
	}
	
	public void dados() {
		super.dados();
		System.out.println("Atendimento : "+ this.getAtendimento());
	}


	public void sacar(double valor) {
		System.out.println("-----------------");
		if(valor <= this.getSaldo()) {
			this.saldo -= valor;
			System.out.printf("Olá, %s, seu saque de R$%.2f foi realizado com sucesso. Seu novo saldo é de R$%.2f.%n",this.titular,valor, this.saldo);
		} else {
			System.out.printf("Olá, %s. Você possui o saldo de R$%.2f. Seu saldo é insuficiente para o saque.%n", this.titular,this.saldo);
		}
	}
	
	public void depositar(double valor) {
		
		System.out.println("-----------------");
		this.saldo += valor + rendimento(valor);
		System.out.printf("Olá, %s, seu depósito de R$%.2f foi realizado com sucesso. Seu novo saldo é de R$%.2f.%n",this.titular,valor, this.saldo);
		
	}
	
	public double rendimento(double valor) {
		return valor * (++this.qntdDepositos/100);
	}
}
