import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> historial = new ArrayList<>();
		
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
			System.out.println("5. Potencia");
			System.out.println("6. Raíz");
			System.out.println("7. Reiniciar");
			System.out.println("8. Mostrar historial");
			System.out.println("0. Salir del sistema");
			opcion = sc.nextInt();
			
			double b;
			
			
			
			switch(opcion) {
			
			case 1:
				System.out.println("\nNúmero a sumar: ");
				b = sc.nextDouble();
				double resultSuma = Operaciones.sumar(acumulador, b);
				historial.add(acumulador+" + "+b+" = " +resultSuma);
				acumulador = resultSuma;
				System.out.println("Resultado: " +String.format("%.2f", acumulador));
				break;
			case 2:
				System.out.println("\nNúmero a restar: ");
				b = sc.nextDouble();
				double resultResta = Operaciones.restar(acumulador, b);
				historial.add(acumulador+" - "+b+" = " +resultResta);
				acumulador = resultResta;
				System.out.println("Resultado: " +String.format("%.2f", acumulador));
				break;
			case 3:
				System.out.println("\nNúmero a multiplicar: ");
				b = sc.nextDouble();
				double resultMult = Operaciones.multiplicar(acumulador, b);
				historial.add(acumulador+" * "+b+" = " +resultMult);
				acumulador = resultMult;
				System.out.println("Resultado: " +String.format("%.2f", acumulador));
				break;
			case 4:
				System.out.println("\nNúmero a dividir: ");
				b = sc.nextDouble();
				if(b == 0) {
					System.out.println("No se puede dividir entre 0. El resultado no cambia.");
				}else {
					double resultDiv = Operaciones.dividir(acumulador, b);
					historial.add(acumulador+ " / "+b+ " = "+resultDiv);
					acumulador = resultDiv;
					System.out.println("Resultado: " +String.format("%.2f", acumulador));
				}
				
				break;
			case 5:
				System.out.println("\n¿Qué índice de raíz quieres aplicar a " + acumulador + "?");
				b = sc.nextDouble();
				double resultPot = Operaciones.potencia(acumulador, b);
				historial.add(acumulador+" ^ "+b+" = "+resultPot);
				acumulador = resultPot;
				System.out.println ("Resultado: " +String.format("%.2f", acumulador));
				break;
				
			case 6:
				System.out.println("Ingrese la raíz que dese del número "+acumulador);
				b  = sc.nextDouble();
				if(b == 0) {
					System.out.println("El índice no puede ser 0");}
				else {
					double resultRaiz = Operaciones.raiz(acumulador, b);
					historial.add(acumulador + " raíz " + b + " = " + resultRaiz);
					acumulador = resultRaiz;
					System.out.println("Resultado: " +String.format("%.2f", acumulador));
				}
				break;
				
			case 7:
				System.out.println("\n Ingresa el nuevo número: ");
				acumulador = sc.nextDouble();
				historial.add("----Reinicio del Sistema---Ingrese nuevo número --> " +acumulador+ " --");
				System.out.println("Acumulador reiniciado a: "+acumulador);
				break;
			case 8:
				if(historial.isEmpty()) {
					System.out.println("\nNo hay historial de operaciones");
				}else {
					for(String op : historial) {
						System.out.println(op);
					}
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
