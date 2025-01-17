package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;
	
	@BeforeTest
	public void open() {
		driver=new ChromeDriver();
		driver.get("https://www.purplle.com/");
		driver.manage().window().maximize();
	}
}
