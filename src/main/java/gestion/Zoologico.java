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
	
	public static void main (String[] args) {
		
		Zoologico zoo = new Zoologico();
		
		Zona z1 = new Zona();
		Zona z2 = new Zona();
		zoo.agregarZonas(z1);
		zoo.agregarZonas(z2);
		z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(Mamifero.crearCaballo("test", 11, "M"));
		z1.agregarAnimales(Mamifero.crearLeon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearHalcon("test", 11, "M"));
		z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(Ave.crearAguila("test", 11, "M"));
		z1.agregarAnimales(Anfibio.crearRana("test", 11, "M"));
		z2.agregarAnimales(Anfibio.crearSalamandra("test", 11, "M"));
		z2.agregarAnimales(Reptil.crearIguana("test", 11, "M"));
		z2.agregarAnimales(Reptil.crearSerpiente("test", 11, "M"));
		z2.agregarAnimales(Pez.crearSalmon("test", 11, "M"));
		z2.agregarAnimales(Pez.crearBacalao("test", 11, "M"));
		Mamifero.crearCaballo("test", 11, "M");
		Ave.crearHalcon("test", 11, "M");
		Anfibio.crearRana("test", 11, "M");
		Reptil.crearIguana("test", 11, "M");
		Pez.crearBacalao("test", 11, "M");
		
		System.out.println(zoo.cantidadTotalAnimales());
	}

}
