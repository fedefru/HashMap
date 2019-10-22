
public class Persona {
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private int edad;
	private String estadoCivil; 
	
	public Persona(String nombre, String apellido, String direccion, int dni,int edad, String estadoCivil ) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.direccion=direccion;
		this.dni=dni;
		this.edad=edad;
		this.estadoCivil=estadoCivil;
	}





	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
