package ejercicio5;

public class OperacionMatematica extends AbstractExpression {
	private String numero;

	public OperacionMatematica(String numero) {
		this.numero = numero;
	}

	@Override
	public void interpreter(Context context) {
		if (context.isMultiplicacion()) {
			context.setOutput(context.getOutput() * Integer.parseInt(numero));

		} else {
			context.setOutput(context.getOutput() + Integer.parseInt(numero));

		}
		context.setInput(context.getInput().substring(numero.length()));
	}

}
