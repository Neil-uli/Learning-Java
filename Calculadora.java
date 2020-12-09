import java.util.Scanner;

class Calculadora {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Ingresa la operacion : \n 1 - Sumar\n 2- Restar\n 3-Multi\n4- Dividir");
		int operacion = reader.nextInt();

		int a, b;

		switch (operacion) {
			case 1:
				System.out.println("Ingresa a:");
				a = reader.nextInt();
				System.out.println("ingresa b");
				b = reader.nextInt();
				suma(a, b);
				break;

			case 2:
				System.out.println("Ingresa a:");
				a = reader.nextInt();
				System.out.println("ingresa b");
				b = reader.nextInt();
				resta(a, b);
				break;

			case 3:
				System.out.println("Ingresa a:");
				a = reader.nextInt();
				System.out.println("ingresa b");
				b = reader.nextInt();
				multiplicacion(a, b);
				break;

			case 4:
				System.out.println("Ingresa a:");
				a = reader.nextInt();
				System.out.println("ingresa b");
				b = reader.nextInt();
				division(a, b);
				break;
			default:
				System.out.println("Ingresa un valor valido");
		}

	}

	public static int suma(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println("El resultado es:" + sum);
		return sum;
	}

	private static long resta(int a, int b) {
		int resta = 0;
		resta = a - b;
		System.out.println("El resultado es:" + resta);
		return resta;
	}

	private static long multiplicacion(int a, int b) {
		int multiplicacion = a * b;
		System.out.println("El resultado es:" + multiplicacion);
		return multiplicacion;
	}

	private static int division(int a, int b) {
		int division = a / b;
		System.out.println("El resultado es:" + division);
		return division;
	}
}
