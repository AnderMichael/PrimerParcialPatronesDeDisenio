package ejercicio5;

public class LaunchEjercicio5 {

	public static void main(String[] args) {
		String input = "2 * 3 + 5 + 6 + 5";
		Operador operador = new Operador("* " + input);
		System.out.println("Output: " + operador.interpreter());
	}

}
