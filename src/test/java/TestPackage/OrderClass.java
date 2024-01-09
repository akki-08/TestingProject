package TestPackage;

import org.testng.annotations.Test;

import PageObject.CheckOrders;

public class OrderClass extends StartingClass {
	
	@Test
	public void order() throws InterruptedException
	{
		CheckOrders ord = new CheckOrders(driver);
		ord.orders();
	}
}
