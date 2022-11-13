import java.util.Scanner;

/* Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje 
 * indicando si el número tiene uno o dos dígitos.
 * (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
 */

public class Proyecto13 {

	public static void main(String[] strg) {

		int numero = leer();

		if (numero >= 0 && numero < 10) {
			System.out.print("El numero " + numero + " está formado por un solo digito");
		} else {
			if (numero >= 10 && numero <= 99) {
				System.out.print("El numero " + numero + " está formado por dos digitos");
			}
		}

	}

	static int leer() {

		Scanner teclado = new Scanner(System.in);
		int numero1 = 0;

		try {
			
			System.out.print("Ingrese un numero comprendido entre 0 y 99): ");
			numero1 = teclado.nextInt();
			teclado.nextLine();
			
		} catch (java.util.InputMismatchException control) {
			System.out.println("Digiito mal introducido");

		}

		return numero1;

	}
}
