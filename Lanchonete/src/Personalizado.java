
abstract class Personalizado extends Pedido implements PersonalizadoInterface{
	final double ADICIONAL = 3;
	public Personalizado(String nome, int numPedido) {
		super(nome, numPedido);
		
	}

	public void adicionarIngrediente() {
		if(this.getValorUnitario() > this.getValorItem()) {
		this.setValorItem(this.getValorItem() + this.ADICIONAL);
		Pedido.setValorTotal(this.ADICIONAL);
		System.out.printf("O valor atual do item é R$%.2f%n", this.getValorItem());
		}else {
			System.out.println("Você não pode adicionar mais ingredientes.");
		}
	}
}
