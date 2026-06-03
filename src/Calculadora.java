import java.util.Scanner;

public class Calculadora {

    public double ejecutar(int opcion, double acumulador, Scanner sc, Historial historial) {

        double b;

        switch (opcion) {
            case 1:
                System.out.println("\nNúmero a sumar: ");
                b = Entrada.leerDouble(sc);
                double resultSuma = Operaciones.sumar(acumulador, b);
                historial.agregar(String.format("%.2f", acumulador) + " + " + b + " = " + String.format("%.2f", resultSuma));
                acumulador = resultSuma;
                System.out.println("Resultado: " + String.format("%.2f", acumulador));
                break;
            case 2:
                System.out.println("\nNúmero a restar: ");
                b = Entrada.leerDouble(sc);
                double resultResta = Operaciones.restar(acumulador, b);
                historial.agregar(String.format("%.2f", acumulador) + " - " + b + " = " + String.format("%.2f", resultResta));
                acumulador = resultResta;
                System.out.println("Resultado: " + String.format("%.2f", acumulador));
                break;
            case 3:
                System.out.println("\nNúmero a multiplicar: ");
                b = Entrada.leerDouble(sc);
                double resultMult = Operaciones.multiplicar(acumulador, b);
                historial.agregar(String.format("%.2f", acumulador) + " * " + b + " = " + String.format("%.2f", resultMult));
                acumulador = resultMult;
                System.out.println("Resultado: " + String.format("%.2f", acumulador));
                break;
            case 4:
                System.out.println("\nNúmero a dividir: ");
                b = Entrada.leerDouble(sc);
                if (b == 0) {
                    System.out.println("No se puede dividir entre 0. El resultado no cambia.");
                } else {
                    double resultDiv = Operaciones.dividir(acumulador, b);
                    historial.agregar(String.format("%.2f", acumulador) + " / " + b + " = " + String.format("%.2f", resultDiv));
                    acumulador = resultDiv;
                    System.out.println("Resultado: " + String.format("%.2f", acumulador));
                }
                break;
            case 5:
                System.out.println("\n¿A qué potencia quieres elevar " + String.format("%.2f", acumulador) + "?");
                b = Entrada.leerDouble(sc);
                double resultPot = Operaciones.potencia(acumulador, b);
                historial.agregar(String.format("%.2f", acumulador) + " ^ " + b + " = " + String.format("%.2f", resultPot));
                acumulador = resultPot;
                System.out.println("Resultado: " + String.format("%.2f", acumulador));
                break;
            case 6:
                System.out.println("Ingrese la raíz que desee del número " + acumulador);
                b = Entrada.leerDouble(sc);
                if (b == 0) {
                    System.out.println("El índice no puede ser 0.");
                } else {
                    double resultRaiz = Operaciones.raiz(acumulador, b);
                    historial.agregar(String.format("%.2f", acumulador) + " raíz " + b + " = " + String.format("%.2f", resultRaiz));
                    acumulador = resultRaiz;
                    System.out.println("Resultado: " + String.format("%.2f", acumulador));
                }
                break;
            case 7:
                historial.mostrar();
                break;
            case 8:
                System.out.println("\nIngresa el nuevo número: ");
                acumulador = Entrada.leerDouble(sc);
                historial.agregar("----Reinicio----  nuevo número --> " + String.format("%.2f", acumulador));
                System.out.println("Acumulador reiniciado a: " + acumulador);
                break;
            
            case 0:
                System.out.println("\nSaliendo del sistema...");
                break;
            default:
                System.out.println("\nOpción no válida.");
        }

        return acumulador;
    }

}