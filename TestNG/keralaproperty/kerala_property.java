package TestNG;


import java.net.MalformedURLException;
import java.net.URI;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.opentelemetry.semconv.UrlAttributes;

public class kerala_property {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open() {
		driver.navigate().to("https://keralaproperty.in/");
		driver.manage().window().maximize();
	}
	@Parameters({"email","pass"})
	@Test
	public void Signup(String email,String pass) {
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.linkText("New user?")).click();
		Select drop=new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div/div[2]/div[1]/div/select")));
		drop.selectByVisibleText("Agent");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sidharth");
		driver.findElement(By.xpath("//input[@id='umail']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='memberpass']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='repass']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='umobile']")).sendKeys("219384972");
		driver.findElement(By.xpath("//input[@name='sub_regbutton']")).click();	
	}
	@Parameters({"email","pass"})
	@Test(dependsOnMethods="Signup")
	public void login(String email,String pass) throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div[1]/input")).sendKeys(email);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div[2]/input")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/input[2]")).click();
	}
	@Test
	public void validate() throws Exception {
		String str=driver.getCurrentUrl();
		if(!str.equals("https://keralaproperty.in/member/login/")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		URI ob=new URI(str);
		HttpsURLConnection con=(HttpsURLConnection)ob.toURL().openConnection();
		System.out.println(con.getResponseCode());		
	}
	@AfterTest
	public void close() {
		driver.quit();
	}
}
