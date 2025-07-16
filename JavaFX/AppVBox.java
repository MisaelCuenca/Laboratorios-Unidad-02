package Proyect.JavaFX;

import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AppVBox extends Application {

	@Override
	public void start(Stage primaryStage) {
		// Crear botón
		VBox vbox = new VBox(10);
		TextField campo = new TextField();
		Button boton = new Button("Mostrar");
		Label salida = new Label();
		boton.setOnAction(e -> salida.setText("Hola " + campo.getText()));
		vbox.getChildren().addAll(campo, boton, salida);
		Scene scene = new Scene(vbox, 300, 200);

		primaryStage.setTitle("VBox");
		primaryStage.setScene(scene);
		primaryStage.show();
		// En el evento del botón: Cambia de escena
		boton.setOnAction(e -> {
			Label nueva = new Label("Nueva Escena");
			Scene escenaNueva = new Scene(new StackPane(nueva), 200, 100);
			primaryStage.setScene(escenaNueva);
		});

	}

	public static void main(String[] args) {
		launch(args);
	}

}