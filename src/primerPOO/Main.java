package primerPOO;

import static iu.MiMenu.*;//con el * importamos todos los metodos dentro de la clase

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//instanciar la clase, declarar miAnimal como un objeto de la clase Animales
        Animales miAnimal=new Animales();
		//id=1
		miAnimal.nombre="Thor";
		miAnimal.edad=4;
		miAnimal.mostrarCaracteristicas(miAnimal.nombre, miAnimal.edad, Animales.id);
		
		
		
		//id=2
		Animales miMascota=new Animales();
		miMascota.nombre="Sape";
		miMascota.edad=3;
		
		miMascota.mostrarCaracteristicas(miMascota.nombre, miMascota.edad, miMascota.id);
		//mostrarMenu();
		//llamar al metodo constructor de solo el nombre
		Animales miMascota2= new Animales("Candela");
		Animales miMascota3= new Animales("Candela2", 13);
		System.out.println("El id de" + miMascota3.nombre + " es "+ Animales.id);
	}

}
