package Proyect.JavaFX_Persona;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
	@Override
	public void start(Stage primaryStage) {
		new PersonaView(primaryStage);
	}

	public static void main(String[] args) {
		launch(args);
	}
}