package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_pgm {
		ChromeDriver driver=new ChromeDriver();
		@Before
		public void open()
		{
			driver.get("file:///C:/Users/Sidharth%20Radeep%20M/Downloads/alert.html");
		}
		@Test
		public void t() 
		{
			driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
			Alert A=driver.switchTo().alert();
			A.accept();
			driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("123");
			driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("1234");		
		}

}
