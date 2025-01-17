package junitpkg;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seag_lab_response {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void open() {
	driver.navigate().to("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void test() {
		List<WebElement> lk=driver.findElements(By.tagName("a"));
		int size=lk.size();
		for(WebElement el:lk) {
			System.out.println(el.getDomAttribute("href")+"----"+el);
			String link=el.getDomAttribute("href");
			verify(link);
		}
		
	}
	void verify(String link) {
		try {
			URI ob = new URI(link);
			HttpsURLConnection con=(HttpsURLConnection)ob.toURL().openConnection();
			if(con.getResponseCode()==200)
			{
				System.out.println(200);
			}
		}
			catch (Exception e) {
			e.printStackTrace();
		}	
		
	}
}