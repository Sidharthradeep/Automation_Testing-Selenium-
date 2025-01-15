package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagepkg.withpagefactory;

public class test1 {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void testing() {
		withpagefactory ob=new withpagefactory(driver);
		ob.source("abc@gmail.com","12345");
		ob.login();
	}
}
