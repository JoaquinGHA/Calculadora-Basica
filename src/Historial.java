import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Historial {
	
	private ArrayList<String> operaciones = new ArrayList<>();
	Scanner sc = new Scanner (System.in);
	
	public void agregar(String operacion) {
	    operaciones.add(operacion);
	}
	
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
	
	
	private String archivo = "historial_" + LocalDate.now() + ".txt";
	public void guardar() {
		try {
			FileWriter fw = new FileWriter (archivo, true);
			for (String op : operaciones) {
				fw.write(op + "\n");
			}fw.close();
			System.out.println("Historial guardado correctamente");
		}catch(IOException e){
			System.out.println("Error al guardar el historial");
		}
	}
	
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
	
	
	public void eliminarHistorial() {
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
		}else {
			System.out.println("Error al eliminar el historial");
		}
	}
}
