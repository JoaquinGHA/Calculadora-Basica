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

}
