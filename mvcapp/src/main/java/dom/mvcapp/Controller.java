package dom.mvcapp;
import javafx.event.Event;
import javafx.event.EventHandler;

public class Controller implements EventHandler
{
	Model model;
	View view;
	public Controller(Model model, View view) {
		super();
		this.model = model;
		this.view = view;
		this.view.submitButton.setOnAction(this);
		
	}
	
	@Override
	public void handle(Event event)
	{
		if(event.getSource()==this.view.submitButton)
		{
			int age = 0;
			int balance = 0;
			try
			{
				 age = Integer.parseInt(view.ageTF.getText());
				 balance = Integer.parseInt(view.balanceTF.getText());
			}
			catch (NumberFormatException ex)
			{
				;
			}
			addCustomer(view.nameTF.getText(),age ,balance);
			updateView();
			view.drawChart(model.customers);
		}
		
	}
	
	public void addCustomer(String name, int age, int balance)
	{
		model.addCustomer(name, age, balance);
	
	}
	public void updateView()
	{
		view.updateView();
	}
	

}
