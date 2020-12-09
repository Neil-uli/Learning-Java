import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class PruebaSet {
	private static final String colores[] = {"rojo", "blanco", "azul", "verde"};

	public PruebaSet() {
		List<String> lista = Arrays.asList(colores);
		System.out.printf("ArrayList: %s \n", lista);
		imprimirSinDuplicados(lista);
	}

	private void imprimirSinDuplicados(Collection<String> coleccion) {
		Set<String> conjunto = new HashSet<String>(coleccion);
		System.out.println("\nLos valores sin duplicados son: ");
		for (String s: conjunto) {
			System.out.printf(" %s ", s);
		}
		System.out.println();
	}
	public static void main (String[] args) {
		new PruebaSet();
	}
}
