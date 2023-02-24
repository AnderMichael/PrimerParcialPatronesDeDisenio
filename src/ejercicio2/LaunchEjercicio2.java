package ejercicio2;

public class LaunchEjercicio2 {
	public static void main(String[] args) {
		Televisor clonBase = new Televisor();
		clonBase.setBluetooth(true);
		clonBase.setControlRemoto(true);
		clonBase.setPuertoHDMI(true);
		clonBase.setPuertosUSB(4);
		clonBase.setPulgadas(80);
		clonBase.setResolucion(50);
		clonBase.setSenialTelevisor(123456);
		clonBase.setSistemaOperativo("Android");
		clonBase.setVersionSistemaOperativo("11.0");

		Televisor televisor1 = clonBase.clone();
		televisor1.setSenialTelevisor(657474);

		Televisor televisor2 = clonBase.clone();
		televisor2.setSenialTelevisor(564737);

		Televisor televisor3 = clonBase.clone();
		televisor3.setSenialTelevisor(647378);

		Televisor televisor4 = clonBase.clone();
		televisor4.setSenialTelevisor(465734);

		Televisor televisor5 = clonBase.clone();
		televisor5.setSenialTelevisor(564574);

		televisor1.showInfo();
		televisor2.showInfo();
		televisor3.showInfo();
		televisor4.showInfo();
		televisor5.showInfo();
	}
}
