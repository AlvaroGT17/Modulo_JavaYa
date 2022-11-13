// Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio. 

import java.util.Scanner;

public class Proyecto7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int num1;
		int num2;
		int num3;
		int num4;
		int suma;
		int promedio;

		System.out.println("Ingrese el primer número: ");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo número: ");
		num2 = teclado.nextInt();
		System.out.println("Ingrese el tercero número: ");
		num3 = teclado.nextInt();
		System.out.println("Ingrese el cuarto número: ");
		num4 = teclado.nextInt();

		suma = num1 + num2 + num3 + num4;
		promedio = suma / 4;

		System.out
				.println("El resultado de la suma de los cuatro numero es: " + suma + " y el promedio es: " + promedio);

	}

}
