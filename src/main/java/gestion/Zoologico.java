package gestion;
import java.util.ArrayList;

import zooAnimales.Anfibio;
import zooAnimales.Ave;
import zooAnimales.Mamifero;
import zooAnimales.Pez;
import zooAnimales.Reptil;

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
		
		if (zonas == null) {
			
			zonas = new ArrayList<Zona>();
		}
		
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
	
	public String getUbicacion () {
		
		return(this.ubicacion);
	}
	
	public ArrayList<Zona> getZona () {
		
		return (this.zonas);
	}
	


}
