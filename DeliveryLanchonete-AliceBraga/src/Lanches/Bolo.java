package Lanches;

import java.util.Scanner;

public class Bolo extends Lanche implements BoloInterface{
	

	private String massa;
	private String recheio;
	private String cobertura;
	final double VALOR_BOLO = 40.90;
	Scanner ler = new Scanner(System.in);
	
	public Bolo() {
		System.out.println("Aqui você pode personalizar seu bolo como quiser!");
		this.fazerBolo();
	}
	
	public void fazerBolo() {
		this.escolherMassa();
		this.escolherRecheio();
		this.escolherCobertura();
		
   	 	System.out.println("Você escolheu um bolo com massa de: " + getMassa() + ", recheio de: " + getRecheio() + " e cobertura de:" + getCobertura());
   	 	System.out.println("----------------------------------------------------------------------------------------------------------- ");
   	 	super.setPreco(VALOR_BOLO);
   	 	super.fecharPedido();
	}
	
	
	@Override
	public void escolherMassa() {
		System.out.println("--------------- Qual a massa do bolo?");
		this.setMassa(ler.nextLine()); 
		
	}


	@Override
	public void escolherRecheio() {
		System.out.println("--------------- Qual o recheio do bolo?");
		this.setRecheio(ler.nextLine()); 
		
	}


	@Override
	public void escolherCobertura() {
		System.out.println("--------------- Qual a cobertura do bolo?");
		this.setCobertura(ler.nextLine()); 
		
	}


	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}


	

	
	

}