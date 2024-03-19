package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal {
	
	private static ArrayList<Ave> listado;
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave (String nombre, int edad, String habitat, String genero,String colorPlumas) {
		
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
	
	}
	
	public Ave() {
		
	}
	
	public static int cantidadAves() {
		
		return (listado.size());
		
	}
	
	public String movimiento() {
		
		return("volar");
		
	}
	
	public void crearHalcon (String nombre, int edad, String genero) {
		
		Ave halcon = new Ave (nombre, edad, "montanas", genero, "cafe glorioso");
		
		listado.add(halcon);
		
		this.halcones ++;
		
	}
	
	public void crearAguilas (String nombre, int edad, String genero) {
		Ave aguila = new Ave (nombre, edad, "montanas", genero, "blanco y amarillo");
		
		listado.add(aguila);
		
		this.aguilas ++;
	}

}
