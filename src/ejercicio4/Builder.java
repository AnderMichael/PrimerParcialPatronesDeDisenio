package ejercicio4;

public abstract class Builder {
	private Paquete paquete;

	public void crearBasePaquete() {
		paquete = new Paquete();
	}

	public Paquete getPaquete() {
		return paquete;
	}

	public abstract void setPipocas();

	public abstract void setRecargaPipocas();

	public abstract void setVasos();

	public abstract void setTipoVasos();

	public abstract void setChocolates();

	public abstract void setTipoChocolates();
}
