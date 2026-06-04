/**
 * Clase que contiene los métodos matemáticos de la calculadora.
 */
public class Operaciones {

    /** @return suma de a y b */
    public static double sumar(double a, double b) { return a + b; }

    /** @return resta de a y b */
    public static double restar(double a, double b) { return a - b; }

    /** @return multiplicación de a y b */
    public static double multiplicar(double a, double b) { return a * b; }

    /** @return división de a entre b */
    public static double dividir(double a, double b) { return a / b; }

    /** @return a elevado a la potencia b */
    public static double potencia(double a, double b) { return Math.pow(a, b); }

    /** @return raíz de índice n de a */
    public static double raiz(double a, double n) { return Math.pow(a, 1.0 / n); }

}