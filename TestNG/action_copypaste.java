package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class action_copypaste {
	ChromeDriver driver=new ChromeDriver();
	 @BeforeTest
	 public void setup() {
		 driver.navigate().to("https://register.rediff.com/register/register.php?FormName=user_details");
	 }
	 @Test
	 public void copypaste() {
		 WebElement fname=driver.findElement(By.xpath("//input[@type='text']"));
		 fname.sendKeys("abc");
		 WebElement redditname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		 Actions act=new Actions(driver);
		 act.keyDown(fname,Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL);//To press control key and a and release control key for selecting all
		 act.keyDown(fname,Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL);//To press control key and c and release control key to copy elements
		 act.keyDown(redditname,Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL);//To press control key and v and release control key to paste elements in desired space
		 act.perform();
	 }
}
