package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

import TestPackage.StartingClass;

public class AddToCartPage extends StartingClass {
	
	public WebDriver driver;
	
	public AddToCartPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void AddToCart()
	{
		driver.findElement(By.xpath("//a[@class='a-link-normal'][normalize-space()='Buy Again']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        
        driver.findElement(By.xpath("//input[@name='submit.addToCart']")).click();
        
        js.executeScript("window.scrollBy(0, -500)");
        
        driver.findElement(By.id("nav-cart-count")).click();
       
	}
}
