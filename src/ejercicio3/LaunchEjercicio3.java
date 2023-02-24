package ejercicio3;

public class LaunchEjercicio3 {
	public static void main(String[] args) {
		Fabrica.generateArtefacto("Television").showInfo();
		Fabrica.generateArtefacto("Radio").showInfo();
		Fabrica.generateArtefacto("Refrigerador").showInfo();
		Fabrica.generateArtefacto("Microondas").showInfo();
		Fabrica.generateArtefacto("Batidora").showInfo();

	}
}
