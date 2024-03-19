package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public void agregarAnimales(Animal animal) {
		
		animales.add(animal);
		
	}
	
	public int cantidadAnimales() {

		return (animales.size());
	}
	
	public String getZoo () {
		
		return(this.zoo.getNombre());
	}

}
