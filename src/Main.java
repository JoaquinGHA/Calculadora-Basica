import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Historial historial = new Historial();
		Menu menu = new Menu();
		Scanner sc = new Scanner (System.in);
		Calculadora calculadora = new Calculadora();
		
		
		System.out.println("Ingresa el primer número: ");
		double acumulador = sc.nextDouble();
		
		
		int opcion;
		do {
			menu.mostrar(acumulador);
			opcion = sc.nextInt();
			acumulador = calculadora.ejecutar(opcion, acumulador, sc, historial);
			 } while (opcion != 0);
		sc.close();	}

}
