package zooAnimales;
import java.util.ArrayList;
public class Ave extends Animal {
	
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave (String nombre, int edad, String habitat, String genero,String colorPlumas) {
		
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		
		if (listado == null) {
			
			listado = new ArrayList<Ave>();		
		}
		listado.add(this);
	
	}
	
	public Ave() {
		if (listado == null) {
			
			listado = new ArrayList<Ave>();		
		}
		listado.add(this);
		
	}
	
	public static int cantidadAves() {
		
		return (listado.size());
		
	}
	
	public String movimiento() {
		
		return("volar");
		
	}
	
	public static Ave crearHalcon (String nombre, int edad, String genero) {
		
		Ave halcon = new Ave (nombre, edad, "montanas", genero, "cafe glorioso");
		
		
		
		halcones ++;
		
		return (halcon);
		
	}
	
	public static Ave crearAguila (String nombre, int edad, String genero) {
		Ave aguila = new Ave (nombre, edad, "montanas", genero, "blanco y amarillo");
		
		
		
		aguilas ++;
		
		return (aguila);
	}
	
	public static int getHalcones() {
		
		return(halcones);
	}
	
	public static int getAguilas() {
		
		return(aguilas);
	}
	
	public String getColorPlumas () {
		
		return (this.colorPlumas);
	}

}
