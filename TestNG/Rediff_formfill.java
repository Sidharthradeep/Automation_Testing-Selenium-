package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff_formfill {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open_site() {
		driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void login() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("sidarth@gmail.com");
		
	}
}
