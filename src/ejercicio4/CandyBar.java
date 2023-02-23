package ejercicio4;

public class CandyBar {
	private Builder builderPaquetes;

	public Paquete getPaquete() {
		return builderPaquetes.getPaquete();
	}

	public void setBuilderPaquetes(Builder builderPaquetes) {
		this.builderPaquetes = builderPaquetes;
	}

	public void generarPaquete() {
		builderPaquetes.crearBasePaquete();
		builderPaquetes.setPipocas();
		builderPaquetes.setRecargaPipocas();
		builderPaquetes.setChocolates();
		builderPaquetes.setTipoChocolates();
		builderPaquetes.setVasos();
		builderPaquetes.setTipoVasos();
	}

}
