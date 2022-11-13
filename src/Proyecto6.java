// Escribir un programa en el cual se ingresen cuatro números, 
// calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.

import java.util.Scanner;

public class Proyecto6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		int num4;
		int multiplicacion;
		int suma;
		
		System.out.println("Ingrese el primer número: ");
		num1= teclado.nextInt();
		System.out.println("Ingrese el segundo número: ");
		num2= teclado.nextInt();
		System.out.println("Ingrese el tercero número: ");
		num3= teclado.nextInt();
		System.out.println("Ingrese el cuarto número: ");
		num4= teclado.nextInt();
		
		suma=num1 + num2;
		multiplicacion= num3 * num4;
		
		System.out.println("El resultado de la suma del 1º y 2º número es: " + suma);
		System.out.println("El resultado de la suma del 3º y 4º número es: " + multiplicacion);
		
		
	}

}
