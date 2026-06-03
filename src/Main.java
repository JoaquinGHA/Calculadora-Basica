import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Historial historial = new Historial();
		historial.cargar();
		Menu menu = new Menu();
		Scanner sc = new Scanner (System.in);
		Calculadora calculadora = new Calculadora();
		
		
		System.out.println("Ingresa el primer número: ");
		double acumulador = Entrada.leerDouble(sc);
		
		
		int opcion;
		do {
			menu.mostrar(acumulador);
			opcion = Entrada.leerInt(sc);
			acumulador = calculadora.ejecutar(opcion, acumulador, sc, historial);
			 } while (opcion != 0);
		historial.guardar();
		sc.close();	
		}

}
