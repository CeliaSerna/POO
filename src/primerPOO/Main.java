package primerPOO;

import segundoPOO.Personas;

import static iu.MiMenu.*;//con el * importamos todos los metodos dentro de la clase

public class Main {
	@SuppressWarnings("static-access")//suprime las advertencias

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//instanciar la clase, declarar miAnimal como un objeto de la clase Animales
        Animales miAnimal=new Animales();
		//id=1
		miAnimal.nombre="Thor";
		miAnimal.edad=4;
		miAnimal.mostrarCaracteristicas(miAnimal.nombre, miAnimal.edad, miAnimal.id);
		
		//id=2
		Animales miMascota=new Animales();
		miMascota.nombre="Sape";
		miMascota.edad=3;
		miMascota.mostrarCaracteristicas(miMascota.nombre, miMascota.edad, miMascota.id);
		mostrarMenu();
	}

}
