/*Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que 
 * lleva el cliente. Mostrar lo que debe abonar el comprador. 
 */


import java.util.Scanner;

public class Proyecto8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int precio;
		int producto;
		int total;
		
		System.out.println("Ingrese el precio del producto: ");
		precio = teclado.nextInt();
		System.out.println("Ingrese el número de articulos que lleva el cliente: ");
		producto = teclado.nextInt();
		
		total = precio*producto;

		System.out.println("El cliente debe de abonar: " + total);

	}

}
