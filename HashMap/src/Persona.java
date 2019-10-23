import java.awt.List;

public class Persona {
	private String nombre;

	private List lista = new List();

	public Persona(String nombre, String apellido, String direccion, int dni, int edad, String estadoCivil) {
		this.nombre = nombre;
		lista.add(apellido);
		lista.add(direccion);
		lista.add(String.valueOf(dni));
		lista.add(String.valueOf(edad));
		lista.add(estadoCivil);
	}

	public String getLista() {
		String datos = " ";
		for (int i = 0; i < lista.getItemCount(); i++)
			datos = datos.concat(lista.getItem(i) + " ");

		return datos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setLista(List lista) {
		this.lista = lista;
	}

}
