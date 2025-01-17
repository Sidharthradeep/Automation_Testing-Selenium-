package TestNG;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ss {
	ChromeDriver driver=new ChromeDriver();
	@BeforeMethod
	public void open() {
		driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void ss() throws Exception {
		WebElement SS=driver.findElement(By.xpath("//input[@type='button']"));
		File s=SS.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s,new File("./screenshot/screen.png"));
		
	}
}
