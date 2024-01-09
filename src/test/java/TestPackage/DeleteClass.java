package TestPackage;

import org.testng.annotations.Test;

import PageObject.DeleteFromCart;

public class DeleteClass extends StartingClass {
	
	@Test
	public void Delete() throws InterruptedException
	{
		DeleteFromCart obj = new DeleteFromCart(driver);
		obj.delete();
	}

}
