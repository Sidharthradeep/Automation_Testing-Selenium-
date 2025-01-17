package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Title_assert_compare {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open(){
	driver.get("https://www.google.com"); 
	}
	@Test
	public void run(){
	String actual_title=driver.getTitle();
	String expected_title="google";
	
	Assert.assertEquals(actual_title,expected_title);
	System.out.println("Title verified");
	/*if(actual_title.equalsIgnoreCase(expected_title))
			{
				System.out.println("pass");
				System.out.println(actual_title);
			}
	else
	{
		System.out.println("fail");
	}*/
}
}
