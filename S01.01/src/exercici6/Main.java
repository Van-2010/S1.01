package exercici6;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Frog granota = new Frog();
	
	granota.correr();
	granota.dormir();
	granota.saltar();
	granota.parlar();
	
	
	Amphibian anfibio = (Amphibian)granota;
	
	anfibio.correr();
	anfibio.dormir();
	anfibio.saltar();
	
	
	}

}

