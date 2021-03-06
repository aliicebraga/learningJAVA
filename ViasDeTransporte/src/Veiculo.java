
abstract class Veiculo {

	private String marca;
	private String modelo;
	private int qtdePneus;
	private double velocidade = 1;
	private double potencia = 1;
	private double valor;
	
	public Veiculo(String marca, String modelo, double valor) {
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
	}
	
	public void frear() {
		this.velocidade -= this.potencia;
		System.out.println("-----------------------");
		System.out.printf("Velocidade: %.2f km/h%n", this.getVelocidade());
	}
	
	public void acelerar() {
		this.velocidade +=(this.velocidade * this.potencia);
		System.out.println("-----------------------");
		System.out.printf("Velocidade: %.2f km/h%n", this.getVelocidade());
	}
	
	public void dados() {
//		System.out.println("-----------------------");
		System.out.printf("Marca do veículo: %s.%n", this.getMarca());
		System.out.printf("Modelo do veículo: %s.%n", this.getModelo());
		System.out.printf("Valor do veículo: R$%.2f%n", this.getValor());
	}

	public int getQtdePneus() {
		return qtdePneus;
	}

	public void setQtdePneus(int qtdePneus) {
		this.qtdePneus = qtdePneus;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	
	
}
