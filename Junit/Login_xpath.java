package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_xpath {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void open() {
		driver.navigate().to("https://keralaproperty.in/member/login/");	
	}
	@Test
	public void login() {
		driver.findElement(By.xpath("//input[@name='ulogin']")).sendKeys("hello@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
	}
 
}
