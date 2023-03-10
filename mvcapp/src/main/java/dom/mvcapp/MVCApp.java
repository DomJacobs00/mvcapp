package dom.mvcapp;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MVCApp extends Application
{
	View view;
	Model model;
	Controller controller;
	

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("MVC App");
		Pane root = new Pane();
		primaryStage.setScene(new Scene(root, 1100, 400));
		primaryStage.show();
		model = new Model();
		view = new View(root, model);
		controller = new Controller(model, view);
		
		
	}

}
