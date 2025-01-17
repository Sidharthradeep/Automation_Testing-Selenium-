package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class souce_site_demo {
	ChromeDriver driver=new ChromeDriver();
	public void slowdown(int milli)
	{
		try
		{
			Thread.sleep(milli);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
	@Before
	public void open() {
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void login() {
		driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
		slowdown(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		slowdown(1000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		slowdown(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
		slowdown(1000);
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a")).click();
		slowdown(1000);
		driver.findElement(By.xpath("//button[contains(@id,'checkout')]")).click();
		slowdown(1000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Sidharth");
		slowdown(1000);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Radeep");
		slowdown(1000);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("682502");
		slowdown(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
	