package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_tabChange {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open() throws Exception {
		driver.get("https://www.amazon.com/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
	}
	@Test
	public void run() {
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div[1]/span/a/div/img")).click();
		String link=driver.getCurrentUrl();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get(link);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	}
}
