
public class Salada extends Personalizado {

	final double VALOR_SALADA = 8.70;
	public Salada(String nome, int numPedido) {
		super(nome, numPedido);
		this.setValorUnitario(VALOR_SALADA + (3*this.ADICIONAL));
		this.setValorItem(VALOR_SALADA);
		Pedido.setValorTotal(VALOR_SALADA);
	}

	
}
