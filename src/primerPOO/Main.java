package primerPOO;

import java.nio.charset.MalformedInputException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//instanciar la clase, declarar miAnimal como un objeto de la clase Animales
        Animales miAnimal=new Animales();
		
		miAnimal.nombre="Thor";
		miAnimal.id=1;
		miAnimal.edad=4;
		miAnimal.mostrarNombre();
		miAnimal.mostrarCaracteristicas(miAnimal.nombre, miAnimal.edad, miAnimal.id);
		miAnimal.nombre="Guffi";
		miAnimal.mostrarNombre();
      //miAnimal.mostrarCaracteristicas(miAnimal.nombre, miAnimal.edad, miAnimal.id);
	    System.out.println(miAnimal);
	}

}
