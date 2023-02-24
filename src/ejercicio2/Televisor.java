package ejercicio2;

public class Televisor implements IPrototype {
	private String sistemaOperativo;
	private String versionSistemaOperativo;
	private int pulgadas;
	private int resolucion;
	private boolean puertoHDMI;
	private int puertosUSB;
	private boolean controlRemoto;
	private boolean bluetooth;
	private int serialTelevisor;

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getVersionSistemaOperativo() {
		return versionSistemaOperativo;
	}

	public void setVersionSistemaOperativo(String versionSistemaOperativo) {
		this.versionSistemaOperativo = versionSistemaOperativo;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isPuertoHDMI() {
		return puertoHDMI;
	}

	public void setPuertoHDMI(boolean puertoHDMI) {
		this.puertoHDMI = puertoHDMI;
	}

	public int getPuertosUSB() {
		return puertosUSB;
	}

	public void setPuertosUSB(int puertosUSB) {
		this.puertosUSB = puertosUSB;
	}

	public boolean isControlRemoto() {
		return controlRemoto;
	}

	public void setControlRemoto(boolean controlRemoto) {
		this.controlRemoto = controlRemoto;
	}

	public boolean isBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public int getSenialTelevisor() {
		return serialTelevisor;
	}

	public void setSenialTelevisor(int senialTelevisor) {
		this.serialTelevisor = senialTelevisor;
	}

	@Override
	public Televisor clone() {
		Televisor clonTelevisor = new Televisor();
		clonTelevisor.setBluetooth(bluetooth);
		clonTelevisor.setControlRemoto(controlRemoto);
		clonTelevisor.setPuertoHDMI(puertoHDMI);
		clonTelevisor.setPuertosUSB(puertosUSB);
		clonTelevisor.setPulgadas(pulgadas);
		clonTelevisor.setResolucion(resolucion);
		clonTelevisor.setSenialTelevisor(serialTelevisor);
		clonTelevisor.setSistemaOperativo(sistemaOperativo);
		clonTelevisor.setVersionSistemaOperativo(versionSistemaOperativo);
		return clonTelevisor;
	}

	public void showInfo() {
		System.out.println("Televisor:::::::");
		System.out.println("Bluetooth: " + bluetooth);
		System.out.println("Control Remoto: " + controlRemoto);
		System.out.println("Puerto HDMI:" + puertoHDMI);
		System.out.println("Puerto USB: " + puertosUSB);
		System.out.println("Pulgadas: " + pulgadas);
		System.out.println("Resolución:" + resolucion);
		System.out.println("Serial:" + serialTelevisor);
		System.out.println("SO:" + sistemaOperativo);
		System.out.println("Version SO:" + versionSistemaOperativo);

	}
}
