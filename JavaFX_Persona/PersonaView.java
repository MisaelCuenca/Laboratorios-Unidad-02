package Proyect.JavaFX_Persona;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PersonaView {
	private TableView<Persona> tabla;
	private TextField nombreInput;
	private TextField apellidoInput;
	private TextField edadInput;
	private ObservableList<Persona> personas;

	@SuppressWarnings("unchecked")
	public PersonaView(Stage stage) {
		tabla = new TableView<>();
		personas = FXCollections.observableArrayList();

		TableColumn<Persona, String> colNombre = new TableColumn<>("Nombre");
		colNombre.setCellValueFactory(
				data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));

		TableColumn<Persona, String> colApellido = new TableColumn<>("Apellido");
		colApellido.setCellValueFactory(
				data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getApellido()));

		TableColumn<Persona, Number> colEdad = new TableColumn<>("Edad");
		colEdad.setCellValueFactory(data -> new javafx.beans.property.SimpleIntegerProperty(data.getValue().getEdad()));

		tabla.getColumns().addAll(colNombre, colApellido, colEdad);
		tabla.setItems(personas);

		nombreInput = new TextField();
		nombreInput.setPromptText("Nombre");

		apellidoInput = new TextField();
		apellidoInput.setPromptText("Apellido");

		edadInput = new TextField();
		edadInput.setPromptText("Edad");

		Button btnAgregar = new Button("Agregar");

		VBox vbox = new VBox(10, tabla, nombreInput, apellidoInput, edadInput, btnAgregar);
		vbox.setPadding(new Insets(10));

		Scene scene = new Scene(vbox, 500, 400);
		stage.setTitle("Gestión de Personas (MVC + TableView)");
		stage.setScene(scene);
		stage.show();

		// Controlador
		new PersonaController(this, btnAgregar);
	}

	public TableView<Persona> getTabla() {
		return tabla;
	}

	public TextField getNombreInput() {
		return nombreInput;
	}

	public TextField getApellidoInput() {
		return apellidoInput;
	}

	public TextField getEdadInput() {
		return edadInput;
	}

	public ObservableList<Persona> getPersonas() {
		return personas;
	}
}