import java.util.*;
public class Main {

	
	public static void main(String[] args) {
		
		Persona fede = new Persona("Federico","Frutos","Los Andes 1521", 39113098,24,"Soltero.");
		Persona junior = new Persona("junior","mendoza","arroba", 3123123,23,"Soltero.");
		Persona ariel = new Persona("ariel","mascapo","arrobaishon", 345345,23,"casado con hijos.");
		
		
		
		//
		
		//
		HashMap<Object,Object> mapaPersona = new HashMap<Object, Object>();
		
		mapaPersona.put(fede.getNombre(), fede.getLista());
		mapaPersona.put(junior.getNombre(),junior.getLista());
		mapaPersona.put(ariel.getNombre(),ariel.getLista());
		
		
		mapaPersona.forEach((k, v) -> System.out.println("[Nombre] " + k + "  [Datos] " + v));
		
		
		
		

		
		
		

	}

}
