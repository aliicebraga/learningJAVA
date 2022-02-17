
public class ContaEspecial extends Conta{
	private final String atendimento = "Com prioridades";
	public double chequeEspecial;

	public ContaEspecial(String titular, int numero, double saldo, double chequeEspecial) {
		super(titular, numero, saldo);
		this.chequeEspecial = chequeEspecial;
	}
	


	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public String getAtendimento() {
		return atendimento;
	}
	
	public void dados() {
//		importou da super classe o método dados através do super
		super.dados();
		System.out.println("Atendimento : "+ this.getAtendimento());
		System.out.printf("Cheque Especial: R$%.2f%n", this.getChequeEspecial());
	}
	
	public void sacar(double valor) {
		System.out.println("-----------------");
		if(this.getSaldo() >= valor) {
			this.saldo -= valor;
			System.out.printf("Olá, %s, seu saque de R$%.2f foi realizado com sucesso. Seu novo saldo é de R$%.2f.%n",this.titular, valor,this.saldo);
		} else if((this.getSaldo()+this.getChequeEspecial()>=valor)) {
			System.out.printf("Olá, %s, seu saldo disponível não é suficiente, você entrará no limite especial.%n", this.titular);
			this.chequeEspecial -= (valor - this.getSaldo());
			this.saldo -= valor;
			System.out.printf("Seu saque de R$%.2f foi realizado com sucesso. Seu novo saldo é de R$%.2f. Seu novo limite é de R$%.2f%n", this.saldo, valor,this.getChequeEspecial());
		} else if(this.getSaldo() < 0 && this.getChequeEspecial() >= valor ) {
			this.chequeEspecial -= valor ;
			this.saldo -= valor;
			System.out.printf("Seu saque de R$%.2f foi realizado com sucesso. Seu novo saldo é de R$%.2f. Seu novo limite é de R$%.2f%n", this.saldo, valor,this.getChequeEspecial());
		}
		
		else {
			System.out.println("Saque não realizado. Limite indispotível.");
		}
	}
	
	public void depositar(double valor) {
		System.out.println("-----------------");
		 if(this.saldo < 0 && (this.saldo *-1) >= valor) { 
			 this.chequeEspecial += valor;
			 this.saldo+= valor;
			 
		 } else if(this.saldo < 0 && (this.saldo *-1) < valor) {
			 this.chequeEspecial += (this.saldo * -1);
			 this.saldo+= valor;
		 }
		 else {
			 this.saldo += valor;
		 }
		
		System.out.printf("Olá, %s, seu depósito de R$%.2f foi realizado com sucesso. Seu novo saldo é de R$%.2f. E seu limite foi reestabelecido para R$%.2f%n",this.titular, valor,this.saldo, this.getChequeEspecial());
		
	}
		
}
