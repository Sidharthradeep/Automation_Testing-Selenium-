package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoIt_fileupload {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open() {
		driver.get("https://www.ilovepdf.com/compress_pdf");
		driver.manage().window().maximize();
	}
	@Test
	public void run() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Runtime.getRuntime().exec("C:\\Users\\Sidharth Radeep M\\OneDrive\\Desktop\\T1.exe");
		Thread.sleep(1000);
		
	}
}
