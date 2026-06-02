import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opcion;
		
		do {
			System.out.println("\n====BIENVENIDO A LA CALCULADORA====");
			System.out.println("ELIGE UN NÚMERO");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir del sistema");
			opcion = sc.nextInt();
			
			double a, b;
			
			
			
			switch(opcion) {
			
			case 1:
				System.out.println("\n Primer número: ");
				a = sc.nextDouble();
				System.out.println("Segundo número: ");
				b = sc.nextDouble();
				System.out.println("Resultado de la suma entre "+a+ " y "+b+" es " +Operaciones.sumar(a, b) );
				break;
			case 2:
				System.out.println("\n Primer número: ");
				a = sc.nextDouble();
				System.out.println("Segundo número: ");
				b = sc.nextDouble();
				System.out.println("Resultado de la resta entre "+a+ " y "+b+" es " +Operaciones.restar(a, b) );
				break;
			case 3:
				System.out.println("\n Primer número: ");
				a = sc.nextDouble();
				System.out.println("Segundo número: ");
				b = sc.nextDouble();
				System.out.println("Resultado de la multiplicación entre "+a+ " y "+b+" es " +Operaciones.multiplicar(a, b) );
				break;
			case 4:
				System.out.println("\n Primer número: ");
				a = sc.nextDouble();
				System.out.println( "Segundo número: ");
				b = sc.nextDouble();
				System.out.println("Resultado de la división entre "+a+ " y "+b+" es " +Operaciones.dividir(a, b) );
				break;
			case 0:
				System.out.println("\n Saliendo del Sistema...");
				break;
			default:
				System.out.println("Opción no válida");
				
			}
			 } while (opcion != 0);
		sc.close();	}

}
