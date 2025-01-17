package TestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class upload_sendkeys {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	@Test
	public void send() {
		 
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		String actual=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).getText();
		String expect="Sumbit";
		if(actual.equals(expect)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail "+actual);
		}
	}
}
