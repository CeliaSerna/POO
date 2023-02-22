package segundoPOO;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Personas p=new Personas();
p.edad=18;
p.nombre="Carmen Alicia";
p.estatura = 1.56;
p.cumplirAnios();
p.saludar();
System.out.println("Cuando cumplas años tendrás " + p.edad);
System.out.println("¿Cuánto has crecido?");
double incremento = new Scanner(System.in).nextDouble();
p.crecer(incremento);
System.out.printf("Tu estatura ahora es %.2f", p.estatura);//para impromir solo dos decimales 
Personas a=new Personas("Pepe", 20, 1.9);

System.out.println(a.nombre + " " + a.edad + " " + a.estatura);
		
	}

}
