package exercici2;

public class Vehicle {
public Vehicle() {
		
	}

	public void iniciar() {
		
	}
	
	public static void parar() {
	 new Vehicle().iniciar();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Vehicle().iniciar();//crida mètode no estàtic
		Vehicle.parar();//crida mètode static

}
}
