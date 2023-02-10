package dom.mvcapp;

import java.util.ArrayList;

public class Model
{
	ArrayList<Customer> customers = new ArrayList<Customer>();
	public void addCustomer(String name, int age, int balance)
	{
		customers.add(new Customer(name, age, balance));
	}

}
