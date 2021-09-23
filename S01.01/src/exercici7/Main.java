package exercici7;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Frog ranita = new Frog();
	
	ranita.correr();
	ranita.dormir();
	ranita.saltar();
	
	
	Amphibian anfibio = (Amphibian)ranita;
	
	anfibio.correr();
	anfibio.dormir();
	anfibio.saltar();
	
	
	Frog ranita2 = (Frog) anfibio;
	
	ranita2.correr();
	ranita2.dormir();
	ranita2.saltar();
	
	}

}

