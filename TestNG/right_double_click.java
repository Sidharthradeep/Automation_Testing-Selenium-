package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class right_double_click {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open() {
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	@Test
	public void test() {
		WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(right).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		Alert a=driver.switchTo().alert();
		a.accept();
		WebElement Double=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(Double).perform();
		String text=a.getText();
		String toget="You double clicked me.. Thank You..";
		if(text.equals(toget)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		a.accept();
		
	}
	
}
