package TestNG;

import java.util.ArrayList;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class window_handler {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open() {
		driver.get("https://www.google.com");
	}
	@Test
	public void run() {
	String parent=driver.getWindowHandle();
	System.out.println("Title is "+ driver.getTitle());
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.facebook.com");
	driver.switchTo().window(parent);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.ebay.com");
	System.out.println("Title is "+driver.getTitle());
	
	ArrayList<String> set=new ArrayList<>(driver.getWindowHandles());
	driver.switchTo().window(set.get(1));
	System.out.println(driver.getTitle());
	}
}
