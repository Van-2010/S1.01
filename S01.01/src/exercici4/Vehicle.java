package exercici4;

public class Vehicle {
	//Exercici 4
		public final String matricula;
		public static int numPortes;
		public final static int capacitat=5;
	//més restrictiu, no pot nar a un constructor
		
		public Vehicle(String matricula, int numPuertas) {
			this.matricula= matricula;
			this.numPortes = numPortes;
			
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println(Vehicle.capacitat);
			Vehicle.numPortes = 4;
			Vehicle v1 = new Vehicle("2334FGX",4);
		}

	}

