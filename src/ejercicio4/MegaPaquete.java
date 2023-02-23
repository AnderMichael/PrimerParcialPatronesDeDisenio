package ejercicio4;

public class MegaPaquete extends Builder {

	@Override
	public void setPipocas() {
		super.getPaquete().setPipocas("Extragrandes");

	}

	@Override
	public void setRecargaPipocas() {
		super.getPaquete().setRecargaPipocas(true);

	}

	@Override
	public void setVasos() {
		super.getPaquete().setVasos(3);
	}

	@Override
	public void setTipoVasos() {
		super.getPaquete().setTipoVasos("Gaseosas Extragrandes");

	}

	@Override
	public void setChocolates() {
		super.getPaquete().setChocolates(2);
	}

	@Override
	public void setTipoChocolates() {
		super.getPaquete().setTipoChocolates("Grandes");
	}
}
