import java.util.Scanner;

public class Proyecto3 {
	public static void main(String[] ar) {
		try (Scanner teclado = new Scanner(System.in)) {
			int lado;
			int superficie;
			System.out.print("Ingrese el valor del lado del cuadrado:");
			lado = teclado.nextInt();
			superficie = lado * lado;
			System.out.print("La superficie del cuadrado es:");
			System.out.print(superficie);
		}
	}
}