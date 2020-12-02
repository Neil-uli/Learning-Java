import java.util.Scanner;
class a {
   
		enum EstadoCivil {solt, casa, divorci};
	public static void main(String[] args) {
    System.out.println("Hello, world!");         
 		System.out.println("helol");
		EstadoCivil ec = EstadoCivil.solt;
		switch(ec) {
			case solt: System.out.println("Soltero");
								 break;
			case casa: System.out.println("casado");
								 break;

			case divorci: System.out.println("divorciado");
		break;
		}

		Integer x = 0;
		Integer n = 0; 
		String q = "";

		System.out.println("Introduce el valor de x:");
		 Scanner scanner = new Scanner(System.in);
		 x = scanner.nextInt();
		 System.out.println("Introduce n:");
		 n = scanner.nextInt();
		double s = serie(n, x);
		System.out.println("Resultado = " + s);
			System.out.println("sd");
			q = scanner.nextLine();
			System.out.println(q);
			Integer k = suma(50, 80 , 100);
	}

		public static double serie(double x, int n)
		{
		double s;
		int i;
		s = 0.0; // tiempo t1
		for (i = 1; i <= n; i++) // tiempo t2
		{
		s += i*x; // tiempo t3
		}
		return s; // tiempo t4
		}

		public static int suma(int z,int h, int i){
		Integer sum;
		sum = z + h + i;
		System.out.println(sum);
		return sum;
		}
}
