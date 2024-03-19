package zooAnimales;
import gestion.Zona;
import java.util.ArrayList;
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
	
	public static String totalPorTipo () {
		
		return(   "Aves: " + Ave.cantidadAves()+
				"\nReptiles: " + Reptil.cantidadReptiles() +
				"\nPeces: " + Pez.cantidadPeces() + 
				"\nAnfibios: " + Anfibio.cantidadAnfibios() );
		
		
	}
	
	public String toString() {
		
		if (this.zona == null) {
			
			return("Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en el habitat " + this.habitat + " y mi genero es " + this.genero);
		}
		
		return ("Mi nombre es " + this.nombre + ", tengo una edad de " + this.edad + ", habito en el habitat " + this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es " + this.zona.getNombre() + ", en el zoo " + this.zona.getZoo().getNombre());
	}
	
	public static int getTotalAnimales () {
		
		return (totalAnimales);
	}
	
	public String getNombre () {
		
		return (this.nombre);
	}

	public int getEdad () {
		
		return (this.edad);
	}
	
	public String getHabitat () {
		
		return (this.habitat);
	}
	
	public String getGenero () {
		
		return (this.genero);
	}
	
	public Zona getZona () {
		
		return (this.zona);
	}
	
	public static void main (String[] args) {
		new Anfibio();
		new Anfibio();
		new Mamifero();
		new Mamifero();
		new Mamifero();
		new Reptil();
		new Pez();
		new Ave();
		new Ave();
		
		System.out.println(Animal.totalPorTipo());
	}
}


