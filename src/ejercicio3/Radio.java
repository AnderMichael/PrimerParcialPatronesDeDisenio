package ejercicio3;

public class Radio implements IArtefactoElectronico {
	private String nombre;
	private int precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public void showInfo() {
		System.out.println("Artefacto: " + nombre);
		System.out.println("Precio: " + precio);
	}

}
