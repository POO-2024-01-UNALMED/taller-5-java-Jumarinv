package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez (String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas) {
		
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		
		if (listado == null) {
			
			listado = new ArrayList<Pez>();		
		}
		
		listado.add(this);
	
	}
	
	public Pez () {
		
		if (listado == null) {
			
			listado = new ArrayList<Pez>();		
		}
		
		listado.add(this);
	}
	
	
	public static int cantidadPeces () {
		
		return (listado.size());
	}
	
	public String movimiento () {
		
		return("nadar");
		
	}
	
	public static Pez crearSalmon (String nombre, int edad, String genero) {
		
		Pez salmon = new Pez (nombre, edad, "oceano", genero, "rojo", 6);
		
		
		
		salmones++;
		
		return(salmon);
	}
	
	public static Pez crearBacalao (String nombre, int edad, String genero) {
		
		Pez bacalao = new Pez (nombre, edad, "oceano", genero, "gris", 6);
		
		
		
		bacalaos++;
		
		return(bacalao);
	}
	
	public static int getSalmones() {
		
		return(salmones);
	}
	
	public static int getBacalaos() {
		
		return(bacalaos);
	}
	
	public String getColorEscamas () {
		
		return (this.colorEscamas);
	}
	
	public int getCantidadAletas() {
		
		return (this.cantidadAletas);
	}

}
