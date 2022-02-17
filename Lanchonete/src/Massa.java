
public class Massa extends Pedido implements MassaInterface{
	
	final double VALOR_MASSA = 25.50;
	
	public Massa(String nome, int numPedido, String tipoMassa) {
		super(nome, numPedido);
		this.escolherMassa(tipoMassa);
	}

	@Override
	public void escolherMassa(String tipoMassa) {
		Pedido.setValorTotal(VALOR_MASSA);
		System.out.printf("Você escolheu a massa %s no valor de R$%.2f%nO valor total do pedido é R$%.2f%n", tipoMassa, VALOR_MASSA,Pedido.getValorTotal());
		
	}

}
