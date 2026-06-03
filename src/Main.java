import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int opcion;
		
		System.out.println("Ingresa el primer número: ");
		double acumulador = sc.nextDouble();
		
		do {
			System.out.println("\n====BIENVENIDO A LA CALCULADORA====");
			System.out.println("Resultado actual : " +acumulador);
			System.out.println("ELIGE UNA OPERACIÓN");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir del sistema");
			opcion = sc.nextInt();
			
			double b;
			
			
			
			switch(opcion) {
			
			case 1:
				System.out.println("\nNúmero a sumar: ");
				b = sc.nextDouble();
				acumulador = Operaciones.sumar(acumulador, b);
				System.out.println("Resultado: " +acumulador);
				break;
			case 2:
				System.out.println("\nNúmero a restar: ");
				b = sc.nextDouble();
				acumulador = Operaciones.restar(acumulador, b);
				System.out.println("Resultado: " +acumulador);
				break;
			case 3:
				System.out.println("\nNúmero a multiplicar: ");
				b = sc.nextDouble();
				acumulador = Operaciones.multiplicar(acumulador, b);
				System.out.println("Resultado: " +acumulador);
			case 4:
				System.out.println("\nNúmero a dividir: ");
				b = sc.nextDouble();
				if(b == 0) {
					System.out.println("No se puede dividir entre 0. El resultado no cambia.");
				}else {
					acumulador = Operaciones.dividir(acumulador, b);
					System.out.println("Resultado: " +acumulador);
				}
				
				break;
			case 0:
				System.out.println("\n Saliendo del Sistema...");
				break;
			default:
				System.out.println("\nOpción no válida");
				
			}
			 } while (opcion != 0);
		sc.close();	}

}
