package zooAnimales;
import gestion.Zona;
public class Animal {
	
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
		
		
	}
	
	public Animal() {
		
		
	}
	
	public String movimiento () {
		
		return ("desplazarse");
	}
	
	public String totalPorTipo () {
		
		return("Aves: " + Ave.cantidadAves()+"\nReptiles: " + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios() );
		
		
	}
	
	public String toString() {
		
		if (this.zona == null) {
			
			return("Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en el habitat " + this.habitat + " y mi genero es " + this.genero);
		}
		
		return ("Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en el habitat " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona + ", en el zoo " + this.zona.getZoo());
	}

}
