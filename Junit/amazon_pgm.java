package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_pgm {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void open() {
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
	}
	@Test
	public void search() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='nav-search-bar-form']/div[2]/div[1]/div[1]/input")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("HUURDCRCT@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[1]")).click();
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
	}
}
