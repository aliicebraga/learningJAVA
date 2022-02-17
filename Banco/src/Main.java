
public class Main {

	public static void main(String[] args) {
//		a instancia de conta foi a titulo de verificação se estava funcionando
//		Conta c1 = new Conta("Alice Braga",227, 80000);
//		Conta c2 = new Conta("Caroline Korndorfer",449, 200000);
//		Conta c3 = new Conta("Rauny Lima",788, 99999.99);
//		
//		c1.dados();
//		c2.dados();
//		c3.dados();
//		///////////////////////////////////
		
		
		
//		instanciar o objeto ContaCorrente e/ou ContaEspecial
		
		
		ContaEspecial ce1 = new ContaEspecial("Alice Braga",227, 8000, 3000);
		ContaPoupanca cp2 = new ContaPoupanca("Caroline Korndorfer",449, 2000);
		ContaCorrente cc3 = new ContaCorrente("Rauny Lima",788, 4500);
		
		System.out.println("-------------------------------CONTA ESPECIAL");
		ce1.dados();
		ce1.sacar(7000);
		ce1.sacar(1200);
		ce1.sacar(800);
		ce1.depositar(800);
		
		System.out.println("-------------------------------CONTA POUPANÇA");
		cp2.dados();
		cp2.sacar(1500);
		cp2.depositar(1000);
		
		System.out.println("-------------------------------CONTA CORRENTE");
		cc3.dados();
		cc3.sacar(5000);
		cc3.depositar(5000);
		
		
	}
	
//	public void mostrarDados(){
//		for(int i = 0; i < Conta.quantContas; i++) {
//						
//			conta.dados();
//		}
//	}
	
}
