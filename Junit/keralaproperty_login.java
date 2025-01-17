package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class keralaproperty_login {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void open_site() {
		driver.get("https://keralaproperty.in/member/login/");
	}
	@Test
	public void test() {
		driver.findElement(By.name("ulogin")).sendKeys("hello@gmail.com");
		driver.findElement(By.id("upass")).sendKeys("123456789");
		driver.findElement(By.id("sub_logbtn")).click();
			}
	@After
	public void close() {
	}
}
