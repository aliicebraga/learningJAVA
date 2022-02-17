
public class Main {

	public static void main(String[] args) {
		Bicicleta bike1 = new Bicicleta("Mountain Bike", "Aventura", 1200, 21);
		bike1.dados();
		bike1.acelerar();
		bike1.acelerar();
		bike1.frear();
		
		Motocicleta moto = new Motocicleta("Kawasaki", "Vulcan S",47390.90 );
		moto.dados();
		moto.acelerar();
		moto.acelerar();

	}

}
