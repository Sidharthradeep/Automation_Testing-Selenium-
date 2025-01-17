package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button_check {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void open() {
		driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@After
	public void close() {
		driver.quit();
	}
	@Test
	public void check() {
		WebElement button=driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[2]"));
		String text=button.getDomAttribute("value");
		System.out.println(text);
		String exp_text="Check availability";
		if(text.equals(exp_text)) {
			System.out.println("pass");
		}
	}
}
