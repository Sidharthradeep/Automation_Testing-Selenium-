package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebay_hover {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open() {
		driver.navigate().to("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void ebay() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));	
		WebElement element=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]"));
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"vl-flyout-nav\\\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
		WebElement click=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"));
		act.moveToElement(click).build().perform();
		act.click();
		
	}
	
}
