package ejercicio5;

public class Context {
	private String input;
	private int output = 1;
	private boolean multiplicacion;

	public Context(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getOutput() {
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}

	public boolean isMultiplicacion() {
		return multiplicacion;
	}

	public void setMultiplicacion(boolean multiplicacion) {
		this.multiplicacion = multiplicacion;
	}

}
