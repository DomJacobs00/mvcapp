package dom.mvcapp;

import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
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
	NumberAxis xAxis = new NumberAxis();
	NumberAxis yAxis = new NumberAxis();
	ScatterChart<Number, Number> chart = new ScatterChart<Number, Number>(xAxis, yAxis);
	
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
		root.getChildren().add(chart);
		xAxis.setLabel("Age");
		yAxis.setLabel("Balance");
		chart.setTitle("Chart of Customers");
		chart.setLayoutX(300);
		chart.setLayoutY(10);
		
		
		
	}
	public void updateView()
	{
		String text = "";
		for(Customer c: model.customers)
			text=text+c.name+"\n";
		customersTA.setText(text);
	}
	void drawChart(ArrayList<Customer> customers)
	{
		chart.getData().clear();
		XYChart.Series series = new XYChart.Series();
		series.setName("Model Data");
		for(Customer c: customers)
			series.getData().add(new XYChart.Data(c.age, c.balance));
		chart.getData().add(series);
		
	}

}
