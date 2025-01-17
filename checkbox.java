package Selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElement(By.xpath("//input[@name='chk_altemail731e8d08']")).isSelected();
		driver.findElement(By.xpath("//input[@name='chk_altemail731e8d08']")).click();
		driver.findElement(By.xpath("//input[@name='chk_altemail731e8d08']")).isSelected();

	}

}
