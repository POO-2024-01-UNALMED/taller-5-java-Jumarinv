package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona (String nombre, Zoologico zoo) {
		
		this.nombre = nombre;
		this.zoo = zoo;
		
		this.zoo.agregarZonas(this);
		
	}
	
	public Zona () {
		
	}
	
	public void agregarAnimales(Animal animal) {
		
		if (animales == null) {
			
			animales = new ArrayList<Animal>();
		}
		
		animales.add(animal);
		
	}
	
	public int cantidadAnimales() {

		return (animales.size());
	}
	
	public Zoologico getZoo () {
		
		return(this.zoo);
	}
	
	public String getNombre () {
		
		return (this.nombre);
	}

}
