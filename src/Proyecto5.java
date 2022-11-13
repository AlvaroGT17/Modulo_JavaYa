// Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo 
// (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro). 

import java.util.Scanner;

public class Proyecto5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int perimetro;
		
		System.out.print("Ingrese el valor de un lado: ");
		int lado = teclado.nextInt();
		
		perimetro= lado*4;
		
		System.out.print("El perimetro de la figura introducida es: " + perimetro);
	}

}
