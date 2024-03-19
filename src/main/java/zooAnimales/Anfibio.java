package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	
	private static ArrayList<Anfibio> listado;
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio (String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {

		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		
	}
	
	public Anfibio () {
		
	}
	
	public static int cantidadAnfibios () {
		
		return (listado.size());
		
		
	}
	
	public String movimiento () {
		
		return ("saltar");
		
	}
	
	public static void crearRana (String nombre, int edad, String genero) {
		
		Anfibio rana = new Anfibio (nombre, edad, "selva", genero, "rojo", true);
		
		listado.add(rana);
		
		ranas++;
		
	}
	
	public static void crearSalamandra (String nombre, int edad, String genero) {
		
		Anfibio salamandra = new Anfibio (nombre, edad, "selva", genero, "negro y amarillo", false);
		
		listado.add(salamandra);
		
		salamandras++;
	}


}
