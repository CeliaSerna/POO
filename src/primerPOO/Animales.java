package primerPOO;

public class Animales {

	//atributos
	String nombre;
	static int id=0; //se le pone static para que incremente
	int edad;
	//métodos
	public void mostrarNombre() {
		System.out.println(nombre);
	}
	public void mostrarCaracteristicas(String nombre1, int edad1, int id1) {
	System.out.println("Mi animal se llama " + nombre1 + ", tiene "+ edad1+" años y su ID es "+ id1 +".");
	}
	public Animales() {//es un metodo constructor
		id++;
	}
	public Animales(String nombre) {
		id++;
		this.nombre = nombre;
		System.out.println("El nombre es "+this.nombre);
	}
	public Animales(String nombre, int edad) {
		id++;
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("Mi mascota es "+this.nombre + " y tiene "+ this.edad + " y su id es "+id);
	}
	
}
