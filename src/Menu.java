/**
 * Clase que gestiona la visualización del menú de la calculadora.
 */
public class Menu {
	
	/**
     * Muestra el menú de opciones con el resultado actual.
     * @param acumulador valor actual de la calculadora
     */
	public void mostrar(double acumulador) {
		System.out.println("\n====BIENVENIDO A LA CALCULADORA====");
		System.out.println("Resultado actual : " +String.format("%.2f", acumulador));
		System.out.println("ELIGE UNA OPERACIÓN");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Potencia");
		System.out.println("6. Raíz");
		System.out.println("7. Mostrar historial");
		System.out.println("8. Reiniciar");
		System.out.println("9. Listar Historial");
		System.out.println("10. Eliminar Historial");
		System.out.println("0. Salir del sistema");

		}
	}
