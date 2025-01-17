package junitpkg;

import java.net.URI;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff_logo {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void open() {
		driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
	boolean status=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
	if (status==true) {
		System.out.println("Logo is Present");
	}
	else
	{
		System.out.println("Logo not available");
	}
	}
	@Test
	public void button() {
		boolean status=driver.findElement(By.xpath("//input[@value='m']")).isSelected();
		if(status) {
			System.out.println("Male button is selected");
		}
		else
		{
			System.out.println("not selected");
		}
		}
	@After
	public void after() {
		driver.quit();
	}
	
}
