package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import TestPackage.StartingClass;

public class CheckOrders extends StartingClass {
	
	public WebDriver driver ;
	
	public CheckOrders(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void orders()
	{
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		
		driver.findElement(By.xpath("//div[@data-card-identifier='YourOrders']//div[@class='a-box-inner']")).click();
	
		System.out.println("Orders are displayed successfully.....");
	}
}
