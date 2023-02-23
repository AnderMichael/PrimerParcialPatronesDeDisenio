package ejercicio4;

public class PaqueteMediano extends Builder {

	@Override
	public void setPipocas() {
		super.getPaquete().setPipocas("Grandes");

	}

	@Override
	public void setRecargaPipocas() {
		super.getPaquete().setRecargaPipocas(false);

	}

	@Override
	public void setVasos() {
		super.getPaquete().setVasos(2);
	}

	@Override
	public void setTipoVasos() {
		super.getPaquete().setTipoVasos("Refrescos");

	}

	@Override
	public void setChocolates() {
		super.getPaquete().setChocolates(1);
	}

	@Override
	public void setTipoChocolates() {
		super.getPaquete().setTipoChocolates("Normal");
	}

}
