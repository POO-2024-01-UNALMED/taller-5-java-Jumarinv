package gestion;
import java.util.ArrayList;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas; 
	
	public Zoologico (String nombre, String ubicacion) {
		
		this.nombre = nombre;
		this.ubicacion = ubicacion;		
	}
	
	public Zoologico () {
		
	}
	
	public void agregarZonas (Zona zona) {
		
		zonas.add(zona);
	}
	
	public int cantidadTotalAnimales () {
		
		int total = 0;
		
		for (int i = 0; i < zonas.size(); i = i+1) {
			
			
			
			total = total + zonas.get(i).cantidadAnimales();
			
		}
		
		return (total);
	}
	
	public String getNombre () {
		
		return(this.nombre);
	}
	

}
