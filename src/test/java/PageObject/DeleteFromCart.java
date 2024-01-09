package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestPackage.StartingClass;

public class DeleteFromCart extends StartingClass {
	
	public WebDriver driver;
	
	public DeleteFromCart(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void delete()
	{
		driver.findElement(By.xpath("//input[@name='submit.delete.c59bf559-d545-4014-9e17-01838dcec773']")).click();
	}

}
