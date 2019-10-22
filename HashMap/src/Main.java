import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		
		Persona fede = new Persona("Federico","Frutos","Los Andes 1521", 39113098,24,"Soltero");
		Persona ariel = new Persona("Ariel","Vola","Guemes 1978", 2343234,20,"Casado con hijos");
		
		//Persona ariel = new Persona("Ariel","Vola","Guemes 1978", 32233123,20,"Soltero");
		
		//HashMap para traer el DNI
		HashMap<String,Integer> dni = new HashMap<String, Integer>();
		
		dni.put(fede.getNombre(), fede.getDni());
		dni.put(ariel.getNombre(), ariel.getDni());
		
		System.out.println("Dni fede: "+dni.get(fede.getNombre()));
		System.out.println("Dni ariel: "+dni.get(ariel.getNombre()));
		//HashMap para traer la Direccion
		HashMap<String,String> direccion = new HashMap<String, String>();
		
		direccion.put(fede.getNombre(), fede.getDireccion());
		direccion.put(ariel.getNombre(), ariel.getDireccion());
		
		System.out.println("Direccion fede: "+direccion.get(fede.getNombre()));
		System.out.println("Direccion ariel: "+direccion.get(ariel.getNombre()));
		
		//HashMap para traer el Apellido
		HashMap<String,String> apellido = new HashMap<String, String>();
		
		apellido.put(fede.getNombre(), fede.getApellido());
		
		System.out.println("Apellido: "+apellido.get(fede.getNombre()));
		
		//HashMap para traer la Edad
		HashMap<String,Integer> edad = new HashMap<String, Integer>();
		
		edad.put(fede.getNombre(), fede.getEdad());
		
		System.out.println("Edad: "+edad.get(fede.getNombre()));
		
		
		
		
		

		
		
		

	}

}
