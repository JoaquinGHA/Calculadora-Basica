import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

	public static double leerDouble(Scanner sc) {
		while(true) {
			try {
				return sc.nextDouble();
				}catch(InputMismatchException e){
					System.out.println("Entrada no válida. Introduce un número:");
					sc.nextLine();
				}
		}
	}
	
	
	public static int leerInt(Scanner sc) {
		while(true) {
			try {
				return sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Entrada no válida. Introduce un número entero:");
	            sc.nextLine();
	            }
		}
	}
}
