package ejercicio4;

public class Paquete {
	private String pipocas;
	private boolean recargaPipocas;
	private int chocolates;
	private String tipoChocolates;
	private int vasos;
	private String tipoVasos;

	public String getPipocas() {
		return pipocas;
	}

	public void setPipocas(String pipocas) {
		this.pipocas = pipocas;
	}

	public boolean isRecargaPipocas() {
		return recargaPipocas;
	}

	public void setRecargaPipocas(boolean recargaPipocas) {
		this.recargaPipocas = recargaPipocas;
	}

	public int getChocolates() {
		return chocolates;
	}

	public void setChocolates(int chocolates) {
		this.chocolates = chocolates;
	}

	public String getTipoChocolates() {
		return tipoChocolates;
	}

	public void setTipoChocolates(String tipoChocolates) {
		this.tipoChocolates = tipoChocolates;
	}

	public int getVasos() {
		return vasos;
	}

	public void setVasos(int vasos) {
		this.vasos = vasos;
	}

	public String getTipoVasos() {
		return tipoVasos;
	}

	public void setTipoVasos(String tipoVasos) {
		this.tipoVasos = tipoVasos;
	}

	public void showInfo() {
		System.out.println("*****Paquete*****");
		System.out.println("Pipocas: " + pipocas);
		System.out.println("Recarga Pipocas: " + recargaPipocas);
		System.out.println("Chocolates: " + chocolates);
		System.out.println("TipoChocolates:" + tipoChocolates);
		System.out.println("Vasos: " + vasos);
		System.out.println("TipoVasos: " + tipoVasos);
		System.out.println("*****************");
	}
}
