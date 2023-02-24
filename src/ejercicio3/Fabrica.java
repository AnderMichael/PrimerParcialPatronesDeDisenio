package ejercicio3;

public class Fabrica {
	public static IArtefactoElectronico generateArtefacto(String artefacto) {
		switch (artefacto) {
		case "Radio": {
			Radio radio = new Radio();
			radio.setNombre("Radio");
			radio.setPrecio(20);
			return radio;
		}
		case "Television": {
			Television television = new Television();
			television.setNombre("Television");
			television.setPrecio(100);
			return television;
		}
		case "Batidora": {
			Batidora batidora = new Batidora();
			batidora.setNombre("Batidora");
			batidora.setPrecio(400);
			return batidora;
		}
		case "Refrigerador": {
			Refrigerador refrigerador = new Refrigerador();
			refrigerador.setNombre("Refrigerador");
			refrigerador.setPrecio(1070);
			return refrigerador;
		}
		case "Microondas": {
			Microondas microondas = new Microondas();
			microondas.setNombre("Microondas");
			microondas.setPrecio(1000);
			return microondas;
		}
		default:
			return null;
		}
	}
}
