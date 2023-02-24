package ejercicio1;

public class LaunchEjercicio1 {
	public static void main(String[] args) {
		Control control = Control.getInstance();

		Vehiculo vehiculos[] = { new Vehiculo("646", "Suxuki", "Red"), new Vehiculo("5748", "Suxuki", "Red"),
				new Vehiculo("3829", "Toyota", "Gray"), new Vehiculo("24234", "Suxuki", "Blue"),
				new Vehiculo("3637", "Ford", "Yellow"), new Vehiculo("78978", "Toyota", "Red"),
				new Vehiculo("56388", "Suxuki", "Red") };

		for (Vehiculo vehiculo : vehiculos) {
			control.registerVehiculo(vehiculo);
		}
	}

}
