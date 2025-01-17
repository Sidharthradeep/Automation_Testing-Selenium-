package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot_pgm {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void open()
	{
		driver.get("file:///C:/Users/Sidharth%20Radeep%20M/Downloads/alert.html");
	}
	@Test
	public void t() throws Exception
	{
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss,new File("C:\\Users\\Sidharth Radeep M\\OneDrive\\Pictures\\Screenshots 1\\screenshot\\ss.png"));
		
		WebElement s=driver.findElement(By.xpath("/html/body/input[1]"));
		File sss= s.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sss,new File("./screenshot/sss.png"));
		
	}
}
