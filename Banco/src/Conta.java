
public class Conta {

	public int numero;
	public String titular;
	public double saldo;
	static int quantContas;
	
	public Conta(String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		quantContas++;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}
	
	public void dados() {
		System.out.println("-----------------");
		System.out.println("Titular : "+ this.getTitular());
		System.out.println("Conta : "+ this.getNumero());
		System.out.printf("Saldo : R$%.2f%n", this.getSaldo());
	}
	
}
