package Proyect.JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class AppButton extends Application {

	@Override
	public void start(Stage primaryStage) {
		// Crear botón
		Button btn = new Button("Haz clic");
		btn.setOnAction(e -> System.out.println("Boton presionado"));
		StackPane root = new StackPane(btn);
		Scene scene = new Scene(root, 300, 200);

		primaryStage.setTitle("Mi Primera App JavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}