/*Realizar un programa que solicite ingresar dos números distintos y muestre por pantalla el mayor de ellos.
 */

import java.util.Scanner;

public class Proyecto10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int number1;
		int number2;

		System.out.print("Ingrese el primer número: ");
		number1 = teclado.nextInt();
		System.out.print("Ingrese el segundo número: ");
		number2 = teclado.nextInt();

		if (number1==number2) {
			System.out.print("El primer número y el segundo número son iguales");
		}else {
			if (number1 > number2) {
			System.out.print("El primer número es el mayor");
		} else {
			System.out.print("El segundo número es el mayor ");
		}
		}
		

	}

}
