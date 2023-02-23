package ejercicio4;

public class PaqueteNormal extends Builder {

	@Override
	public void setPipocas() {
		super.getPaquete().setPipocas("Normal");

	}

	@Override
	public void setRecargaPipocas() {
		super.getPaquete().setRecargaPipocas(false);

	}

	@Override
	public void setVasos() {
		super.getPaquete().setVasos(1);
	}

	@Override
	public void setTipoVasos() {
		super.getPaquete().setTipoVasos("Refresco");

	}

	@Override
	public void setChocolates() {
		super.getPaquete().setChocolates(0);
	}

	@Override
	public void setTipoChocolates() {
		super.getPaquete().setTipoChocolates("");
	}

}
