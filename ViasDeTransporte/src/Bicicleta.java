
public class Bicicleta extends Veiculo{

	private int qtdeMarchas;
	private boolean bagageiro;
	
	public Bicicleta(String marca, String modelo, double valor, int qtdeMarchas) {
		super(marca, modelo, valor);
		this.qtdeMarchas = qtdeMarchas;
		this.setQtdePneus(2);
		this.setPotencia(1.3);
	}
	
	public void informarBAgageiro() {
		this.bagageiro = true;
	}
	
	public void dados() {
		System.out.println("--------------BICICLETA--------------");
		super.dados();
		System.out.printf("Quantidade de marchas: %d.%n", this.qtdeMarchas);
		System.out.printf("Tem bagageiro? %s%n", (this.isBagageiro()? "Sim.": "Não."));
	
	}

	public boolean isBagageiro() {
		return bagageiro;
	}

}
