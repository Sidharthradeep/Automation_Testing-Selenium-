package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void open() {
		driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void Dropdown() {
		Select dropdown_day=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
		dropdown_day.selectByVisibleText("05");
		Select dropdown_month=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
		dropdown_month.selectByValue("06");
		Select dropdown_year=new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
		dropdown_year.selectByIndex(2);
	}
}
