package Proyect.JavaFX_Persona;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Persona {
	private final SimpleStringProperty nombre;
	private final SimpleStringProperty apellido;
	private final SimpleIntegerProperty edad;

	public Persona(String nombre, String apellido, int edad) {
		this.nombre = new SimpleStringProperty(nombre);
		this.apellido = new SimpleStringProperty(apellido);
		this.edad = new SimpleIntegerProperty(edad);
	}

	public String getNombre() {
		return nombre.get();
	}

	public void setNombre(String nombre) {
		this.nombre.set(nombre);
	}

	public String getApellido() {
		return apellido.get();
	}

	public void setApellido(String apellido) {
		this.apellido.set(apellido);
	}

	public int getEdad() {
		return edad.get();
	}

	public void setEdad(int edad) {
		this.edad.set(edad);
	}
}
