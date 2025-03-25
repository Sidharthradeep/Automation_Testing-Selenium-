package BasePKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	public static WebDriver driver;
	
	@BeforeTest
	public void open() {
		driver=new ChromeDriver();
		driver.navigate().to("https://awesomeqa.com/ui/index.php?route=common/home");
		driver.manage().window().maximize();
	}
}