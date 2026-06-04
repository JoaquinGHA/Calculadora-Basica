/**
 * Clase que gestiona el historial de operaciones.
 * Guarda y carga las operaciones en un archivo de texto por día.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Historial {
	 
	
	/** Archivo donde se guardan las operaciones del día actual */
	private String archivo = "historial_" + LocalDate.now() + ".txt";
	
	/** Lista de operaciones realizadas en la sesión actual */
	private ArrayList<String> operaciones = new ArrayList<>();
	Scanner sc = new Scanner (System.in);
	
	/**
     * Añade una operación al historial con la hora actual.
     * @param operacion texto de la operación realizada
     */
	public void agregar(String operacion) {
		String hora =LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	    operaciones.add(hora+" | " +operacion);
	}
	
	
	/**
     * Muestra por pantalla todas las operaciones del historial.
     */
	public void mostrar() {
		if(operaciones.isEmpty()) {
			System.out.println("\nNo hay historial de operaciones");
		}else {
			for(String op : operaciones) {
				System.out.println(op);
			}
		}
	}
	
	public boolean isEmpty() {
	    return operaciones.isEmpty();
	}
	
	
	
	
	 /**
     * Guarda el historial en el archivo de texto del día.
     */
	public void guardar() {
		if(operaciones.isEmpty()) return;
		try {
			FileWriter fw = new FileWriter (archivo);
			for (String op : operaciones) {
				fw.write(op + "\n");
			}fw.close();
			System.out.println("Historial guardado correctamente");
		}catch(IOException e){
			System.out.println("Error al guardar el historial");
		}
	}
	
	
	/**
     * Carga el historial desde el archivo de texto del día.
     */
	public void cargar() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			String linea;
			while((linea = br.readLine()) != null) {if(!linea.isEmpty()) {operaciones.add(linea);}}
			
		
		br.close();
		System.out.println("Historial cargado correctamente");}
		catch(IOException e){
			System.out.println("No se encontró historial previo");
		}
	}
	
	
	
	/**
     * Lista todos los archivos de historial disponibles.
     */
	public void listarHistoriales() {
	    File carpeta = new File(".");
	    String[] todosArchivos = carpeta.list();
	    ArrayList<String> listaHistoriales = new ArrayList<>();
	    for (String nombre : todosArchivos) {
	        if (nombre.startsWith("historial_") && nombre.endsWith(".txt")) {
	            listaHistoriales.add(nombre);
	        }
	    }
	    String[] archivos = listaHistoriales.toArray(new String[0]);

	    if (archivos.length == 0) {
	        System.out.println("No hay historiales guardados.");
	    } else {
	        System.out.println("\n====HISTORIALES DISPONIBLES====");
	        for (int i = 0; i < archivos.length; i++) {
	            System.out.println(i + 1 + ". " + archivos[i]);
	        }
	    }
	}
	
	/**
     * Elimina un archivo de historial elegido por el usuario.
     * @param sc Scanner para leer la elección del usuario
     */
	public void eliminarHistorial(Scanner sc) {
		File carpeta = new File("C:\\Users\\joaqu\\eclipse-workspace\\Calculadora Básica");
		String[] archivos = carpeta.list((dir, nombre) -> nombre.startsWith("historial_") && nombre.endsWith(".txt"));
		if(archivos == null || archivos.length == 0) {
			System.out.println("No hay historiales para eliminar.");
			return;
		}
		
		
		System.out.println("\n====HISTORIALES DISPONIBLES====");
		for(int i = 0; i < archivos.length; i++) {
			System.out.println(i+1+". "+archivos[i]);
		}
		
		
		System.out.println("Elige el número del historial a eliminar");
		int eleccion = Entrada.leerInt(sc);
		
		if(eleccion < 1 || eleccion > archivos.length) {
			System.out.println("Opción no válida");
		}
		
		File archivo = new File(archivos[eleccion - 1]);
		if(archivo.delete()) {
			System.out.println("Historial eliminado correctamente");
			if(archivos[eleccion - 1].equals(this.archivo)){
				limpiar();
			}
		}else {
			System.out.println("Error al eliminar el historial");
		}
	}
	
	
	/**
     * Limpia las operaciones de la memoria.
     */
	public void limpiar(){
		operaciones.clear();
	}
}
