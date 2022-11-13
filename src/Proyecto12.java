import java.util.Scanner;

/* Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete 
 * mostrar un mensaje "Promocionado". 
 */

public class Proyecto12 {

	public static void main(String[] args) {

		double nota1 = leer();
		double nota2 = leer();
		double nota3 = leer();

		double promedio = (nota1 + nota2 + nota3)/3;

		if (promedio > 7) {
			System.out.print("El alumno promociona con una nota de: " + Math.round(promedio));
		} else {
			System.out.print("El alumno suspende con una nota de: " + Math.round(promedio));
		}

	}

	static double leer() {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese una nota: ");
		double numero = teclado.nextDouble();

		return numero;

	}

}
