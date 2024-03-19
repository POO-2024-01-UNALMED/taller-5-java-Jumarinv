package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
	
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero (String nombre, int edad, String habitat, String genero,boolean pelaje, int patas) {
		
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		
		
	}
	
	public Mamifero () {
		
	}
	
	
	public int cantidadMamiferos () {
		
		return (listado.size());
		
	}
	
	public static void crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		listado.add (caballo);
		caballos ++;
	}
	
	public static void crearleon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4); 
		listado.add(leon);
		leones ++;
	}
	
	public static int getCaballos() {
		
		return(caballos);
	}
	
	public static int getLeones() {
		
		return(leones);
	}
	
	public boolean getPelaje() {
		
		return (this.pelaje);
	}
	
	public int getPatas() {
		
		return (this.patas);
	}

}
