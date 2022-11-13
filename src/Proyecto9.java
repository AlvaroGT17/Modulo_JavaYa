/* Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando 
 * que debe abonar impuestos.
 */

import java.util.Scanner;

public class Proyecto9 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double sueldo;

		System.out.println("Ingrese el sueldo del operario: ");
		sueldo = teclado.nextDouble();

		if (sueldo > 3000) {
			System.out.println("El operario debe de pagar inpuestos.");
		} else {
			System.out.println("El operario no debe de pagar inpuestos.");
		}

	}

}
