package primerPOO;

public class Animales {

	//atributos
	String nombre;
	int id;
	int edad;
	
	//métodos
	public void mostrarNombre() {
		System.out.println(nombre);
	}
	
	public void mostrarCaracteristicas(String nombre1, int edad1, int id1) {
	System.out.println("Mi animal se llama " + nombre1 + ", tiene "+ edad1+" años y su ID es "+ id1 +".");
}

	
}
