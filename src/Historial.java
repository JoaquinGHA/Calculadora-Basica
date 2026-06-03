import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Historial {
	
	private ArrayList<String> operaciones = new ArrayList<>(); 
	
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
	
	public void guardar() {
		try {
			FileWriter fw = new FileWriter ("historial.txt", true);
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
			BufferedReader br = new BufferedReader(new FileReader("historial.txt"));
			String linea;
			while((linea = br.readLine()) != null) {if(!linea.isEmpty()) {operaciones.add(linea);}}
			
		
		br.close();
		System.out.println("Historial cargado correctamente");}
		catch(IOException e){
			System.out.println("No se encontró historial previo");
		}
	}
}
