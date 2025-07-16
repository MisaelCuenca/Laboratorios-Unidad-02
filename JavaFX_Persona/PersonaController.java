package Proyect.JavaFX_Persona;

import javafx.scene.control.Button;

public class PersonaController {
	private final PersonaView vista;

	public PersonaController(PersonaView vista, Button btnAgregar) {
		this.vista = vista;

		btnAgregar.setOnAction(e -> {
			try {
				String nombre = vista.getNombreInput().getText();
				String apellido = vista.getApellidoInput().getText();
				int edad = Integer.parseInt(vista.getEdadInput().getText());

				Persona persona = new Persona(nombre, apellido, edad);
				vista.getPersonas().add(persona);

				vista.getNombreInput().clear();
				vista.getApellidoInput().clear();
				vista.getEdadInput().clear();
			} catch (NumberFormatException ex) {
				System.out.println("Edad inválida");
			}
		});
	}

	public PersonaView getVista() {
		return vista;
	}
}