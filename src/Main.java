
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nombre = "", apellido = "", edad ="", hobbie = "", editor = "", so = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese su Nombre");
		nombre = sc.nextLine();
		System.out.println("Ingrese su Apellido");
		apellido = sc.nextLine();
		System.out.println("Ingrese su edad");
		edad = sc.nextLine();
		System.out.println("Ingrese un hobbie");
		hobbie = sc.nextLine();
		System.out.println("Ingrese su editor de código preferido");
		editor = sc.nextLine();
		System.out.println("Ingrese su sistema operativo");
		so = sc.nextLine();
			

		System.out.println("Sus datos son:"
				+"\nNombre: "+nombre
				+"\nApellido: "+apellido
				+"\nEdad: "+edad
				+"\nSu hobbie es: "+hobbie
				+"\nEditor de codigo preferido: "+editor
				+"\nSistema operativo en uso: "+so);
					
		}
		
}


