package junitpkg;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Verify;

public class link_count {
	ChromeDriver driver=new ChromeDriver();
	@Before
	public void open() {
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void count() {
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int size=li.size();
		System.out.println("Count is"+li.size());
		for(WebElement el:li) {
			System.out.println(el.getDomAttribute("href")+"------"+el.getText());
			String link=el.getDomAttribute("href");
			Verify(link);
		}
		
	}
	private void Verify(String link) {
		try {
			URI ob=new URI(link);
			HttpsURLConnection con=(HttpsURLConnection)ob.toURL().openConnection();
			if(con.getResponseCode()==200) {
				System.out.println("Response code is 200"+link);
			}
			else if(con.getResponseCode()==404) {
				System.out.println("Response code is 404"+link);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	@After
	public void close() {
		driver.quit();
	}
	
}
