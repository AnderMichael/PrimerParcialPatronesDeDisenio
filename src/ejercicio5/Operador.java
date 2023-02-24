package ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Operador {

	private Context context;
	private List<AbstractExpression> abstractExpressions = new ArrayList<>();

	public Operador(String input) {
		context = new Context(input.replace(" ", ""));
		for (String expresion : input.split(" ")) {
			switch (expresion) {
			case "*": {
				abstractExpressions.add(new Multiplicacion());
				break;
			}
			case "+": {
				abstractExpressions.add(new Suma());
				break;
			}
			default:
				abstractExpressions.add(new OperacionMatematica(expresion));
				break;
			}
		}
	}

	public int interpreter() {
		for (AbstractExpression abstractExpression : abstractExpressions) {
			abstractExpression.interpreter(context);
		}
		return context.getOutput();
	}

}
