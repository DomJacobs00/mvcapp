package dom.mvcapp;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class View 
{
	Pane root;
	Model model;
	Button submitButton;
	TextField nameTF;
	TextArea customersTA;
	
	public View(Pane root, Model model) {
		super();
		this.root = root;
		this.model = model;
		submitButton = new Button("Submit");
		submitButton.setLayoutX(10);
		submitButton.setLayoutY(10);
		
		nameTF = new TextField();
		nameTF.setLayoutX(10);
		nameTF.setLayoutY(50);
		
		customersTA = new TextArea();
		customersTA.setLayoutX(200);
		customersTA.setLayoutY(10);
		customersTA.setPrefSize(350, 350);
		
		root.getChildren().addAll(submitButton,nameTF, customersTA);
		
	}
	public void updateView()
	{
		String text = "";
		for(Customer c: model.customers)
			text=text+c.name+"\n";
		customersTA.setText(text);
	}

}
