package ejercicio5;

public class Multiplicacion extends AbstractExpression {

	@Override
	public void interpreter(Context context) {
		context.setMultiplicacion(true);
		context.setInput(context.getInput().substring(1));
	}

}
