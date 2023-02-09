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
			addCustomer(view.nameTF.getText());
			updateView();
		}
		
	}
	
	public void addCustomer(String name)
	{
		model.addCustomer(name);
	
	}
	public void updateView()
	{
		view.updateView();
	}
	

}
