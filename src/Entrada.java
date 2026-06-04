/**
 * Clase que gestiona la lectura segura de datos del usuario.
 * Controla que el usuario introduzca valores válidos.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	
	
	 /**
     * Lee un número decimal del usuario de forma segura.
     * Si el usuario introduce un valor no válido, vuelve a pedirlo.
     * @param sc Scanner para leer la entrada
     * @return número decimal introducido por el usuario
     */
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
	
	
	
	/**
     * Lee un número entero del usuario de forma segura.
     * Si el usuario introduce un valor no válido, vuelve a pedirlo.
     * @param sc Scanner para leer la entrada
     * @return número entero introducido por el usuario
     */
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
