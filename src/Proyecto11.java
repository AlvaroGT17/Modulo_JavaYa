import java.util.Scanner;

/* Realizar un programa que lea por teclado dos números, 
 * si el primero es mayor al segundo informar su suma y diferencia, 
 * en caso contrario informar el producto y la división del primero respecto al segundo. 
 */

public class Proyecto11 {

	public static void main(String[] args) {

	double number1= leer();
	double number2= leer();
	
	if (number1 > number2) {
		
		System.out.println("Al ser el número 1 mayor que el número 2 el resultado de la sumas es: " + (number1+number2) + " y la diferencia es: " + (number1-number2));
	}else {
		
		System.out.println("Al ser el número 1 mayor que el número 2 el resultado de la producto es: " + (number1*number2) + " y su division da como resultado: " + (number1 / number2));
	}

	}

	private static double leer() {
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Ingrese un Número entero.");
		double numero = teclado.nextInt();
		
		return numero;
	}

}
