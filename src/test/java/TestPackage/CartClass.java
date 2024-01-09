package TestPackage;

import org.testng.annotations.Test;

import PageObject.AddToCartPage;

public class CartClass extends StartingClass {
	
	@Test
	public void Cart() throws InterruptedException
	{
		AddToCartPage obj = new AddToCartPage(driver);
		obj.AddToCart();
	}
}
