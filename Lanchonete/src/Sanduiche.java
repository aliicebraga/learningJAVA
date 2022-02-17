
public class Sanduiche extends Personalizado {

	final double VALOR_SANDUICHE = 13.00;
	public Sanduiche(String nome, int numPedido) {
		super(nome, numPedido);
		this.setValorUnitario(VALOR_SANDUICHE + (3*this.ADICIONAL));
		this.setValorItem(VALOR_SANDUICHE);
		Pedido.setValorTotal(VALOR_SANDUICHE);
	}
	

}
