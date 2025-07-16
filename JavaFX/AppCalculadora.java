package Proyect.JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppCalculadora extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {

		TextField a = new TextField();
		TextField b = new TextField();
		Button sumar = new Button("Sumar");
		Label resultado = new Label();

		sumar.setOnAction(e -> {
			try {
				int x = Integer.parseInt(a.getText());
				int y = Integer.parseInt(b.getText());
				resultado.setText("Resultado: " + (x + y));
			} catch (NumberFormatException ex) {
				resultado.setText("Error en entrada");
			}
		});

		VBox root = new VBox(10, new Label("Número 1"), a, new Label("Número 2"), b, sumar, resultado);
		root.setPadding(new Insets(10));
		Scene scene = new Scene(root, 300, 250);
		stage.setTitle("Calculadora Simple");
		stage.setScene(scene);
		stage.show();

	}

}
