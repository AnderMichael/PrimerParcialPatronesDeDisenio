package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Control {
	private List<Vehiculo> vehiculos = new ArrayList<>();
	private double dineroT;
	private static Control control;

	private Control() {
		this.vehiculos = new ArrayList<>();
	}

	public static Control getInstance() {
		if (control == null) {
			control = new Control();
		}
		return control;
	}

	public void registerVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
		if (vehiculos.size() >= 6) {
			showVehiculos();
		}
	}

	public void showVehiculos() {
		for (Vehiculo vehiculo : vehiculos) {
			vehiculo.showInfo();
		}
	}

}
