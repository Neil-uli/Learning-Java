import java.util.Scanner;

class calculadora {
	public static void main(String[] args) {
		Integer a = 0;
		Integer b = 0;
		Scanner entradaDeTeclado = new Scanner(System.in);

		// Suma
		System.out.println("Ingresa a:");
		a = entradaDeTeclado.nextInt();
		System.out.println("ingresa b");
		b = entradaDeTeclado.nextInt();
		System.out.println("Resultado de a + b = " + suma(a, b));

		// Resta
		System.out.println("Ingresa a:");
		a = entradaDeTeclado.nextInt();
		System.out.println("ingresa b");
		b = entradaDeTeclado.nextInt();
		System.out.println("Resultado de a - b = " + resta(a, b));

		// Multiplicacion
		System.out.println("Ingresa a:");
		Long ab = Long.valueOf(entradaDeTeclado.nextLong());
		System.out.println("ingresa b");
		Long bc = Long.valueOf(entradaDeTeclado.nextLong());
		System.out.println("Resultado de ab * bc = " + multiplicacion(ab, bc));

		// Division
		//System.out.println("Ingresa a:");
		//a = entradaDeTeclado.nextLong();
		//System.out.println("ingresa b");
		//b = entradaDeTeclado.nextLong();
		//System.out.println("Resultado de a / b = " + division(a, b));

	}

	public static int suma(int a, int b) {
		Integer sum = 0;
		sum = a + b;
		return sum;
	}

	private static long resta(int a, int b) {
		Integer resta = 0;
		resta = a - b;
		return resta;
	}

	private static long multiplicacion(Long a, Long b) {
		Long multiplicacion = a * b;
		return multiplicacion;
	}

	//private static long division(long a,long b ){
	//		Integer division = a/b;
	//		return division;
//}
}
