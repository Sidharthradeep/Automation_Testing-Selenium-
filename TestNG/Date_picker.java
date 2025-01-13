package testng;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Date_picker {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open() {
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
	}
	@Test
	public void datepicker() {
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		while(true) {
		String monthtext=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
		if(monthtext.equals("March 2025")) {
			break;
		}
		else {
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		}
		}
		List<WebElement> datelist=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		for(WebElement dateElement:datelist) {
			String date=dateElement.getText();
			if(date.equals("5")) {
				dateElement.click();
				break;
				}
		}
		}
}
