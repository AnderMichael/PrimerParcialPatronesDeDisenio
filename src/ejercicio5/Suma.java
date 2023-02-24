package ejercicio5;

public class Suma extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		context.setMultiplicacion(false);
		context.setInput(context.getInput().substring(1));
	}

}
