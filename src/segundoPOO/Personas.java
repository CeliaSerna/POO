package segundoPOO;

public class Personas {

	String nombre;
	int edad;
	double estatura;
	
	public void saludar() {
		System.out.println("Hola, Mi nombre es: "+ nombre);
		System.out.println("Encantada de conocerte");
	}
	
	public void cumplirAnios() {
		edad++;
	}

	public void crecer(double incremento) {
	estatura+=	incremento;
	}

}
