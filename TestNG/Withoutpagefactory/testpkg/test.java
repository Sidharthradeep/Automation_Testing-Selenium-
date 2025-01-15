package testpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.withoutpagefactory;

public class test {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void testing() {
		withoutpagefactory ob=new withoutpagefactory(driver);
		ob.source("abc@gmail.com","12345");
		ob.login();
	}
}
