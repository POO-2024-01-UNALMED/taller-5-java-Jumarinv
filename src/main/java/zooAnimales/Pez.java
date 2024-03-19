package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	
	private static ArrayList<Pez> listado;
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez (String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas) {
		
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	
	}
	
	public Pez () {
		
	}
	
	
	public static int cantidadPeces () {
		
		return (listado.size());
	}
	
	public String movimiento () {
		
		return("nadar");
		
	}
	
	public void crearSalmon (String nombre, int edad, String genero) {
		
		Pez salmon = new Pez (nombre, edad, "oceano", genero, "rojo", 6);
		
		listado.add(salmon);
		
		salmones++;
	}
	
	public void crearBacalao (String nombre, int edad, String genero) {
		
		Pez bacalao = new Pez (nombre, edad, "oceano", genero, "gris", 6);
		
		listado.add(bacalao);
		
		bacalaos++;
	}

}
