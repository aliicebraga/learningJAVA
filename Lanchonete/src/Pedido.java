
abstract class Pedido {

	private String nome;
	private int numPedido;
	private double valorUnitario;
	private double valorItem;
	static double valorTotal;
	
	public Pedido(String nome, int numPedido) {
		this.nome = nome;
		this.numPedido = numPedido;
	}
	
	public void dados() {
		System.out.printf("------ Pedido # %d%n", this.getNumPedido());
		System.out.printf("O valor total é R$%.2f%n", Pedido.getValorTotal());
		System.out.printf("O valor Item é R$%.2f%n", this.getValorItem());
		System.out.printf("O valor Máximo é R$%.2f%n", this.getValorUnitario());
		System.out.println("----------------------" );
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public static double getValorTotal() {
		return valorTotal;
	}

	public static void setValorTotal(double valorTotal) {
		Pedido.valorTotal += valorTotal;
	}

	public double getValorItem() {
		return valorItem;
	}

	public void setValorItem(double valorItem) {
		this.valorItem = valorItem;
	}
	
}
