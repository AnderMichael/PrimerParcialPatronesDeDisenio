package ejercicio4;

public class LaunchEjercicio4 {

	public static void main(String[] args) {
		Builder megaPaqueteB = new MegaPaquete();
		Builder paqueteMedianoB = new PaqueteMediano();
		Builder paqueteNormalB = new PaqueteNormal();

		CandyBar candyBar = new CandyBar();
		candyBar.setBuilderPaquetes(megaPaqueteB);
		candyBar.generarPaquete();
		Paquete megaPaquete = candyBar.getPaquete();
		megaPaquete.showInfo();

		candyBar.setBuilderPaquetes(paqueteMedianoB);
		candyBar.generarPaquete();
		Paquete paqueteMediano = candyBar.getPaquete();
		paqueteMediano.showInfo();

		candyBar.setBuilderPaquetes(paqueteNormalB);
		candyBar.generarPaquete();
		Paquete paqueteNormal = candyBar.getPaquete();
		paqueteNormal.showInfo();
	}
}
