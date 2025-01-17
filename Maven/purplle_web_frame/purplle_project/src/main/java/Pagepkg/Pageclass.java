package Pagepkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Pageclass {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"body\"]/app-root/div/div/app-header/header/div[2]/div/div/div/div[2]/img[1]")
	WebElement logo;	
	
	@FindBy(xpath="//*[@id=\"body\"]/app-root/div/div/app-header/header/div[3]/div/div/div[2]/div/a")
	List<WebElement> menu;
	
	@FindBy(xpath="//*[@id=\"body\"]/app-root/div/div/app-header/header/div[3]/div/div/div[2]/div[4]/a")
	WebElement newmenu;
	
	@FindBy(xpath="//*[@id=\"filter_0\"]/ul/li[1]/label/span/span")
	WebElement ishadow;
	
	@FindBy(xpath="//*[@id=\"filter_0\"]/div[2]/a/span")
	WebElement filter;
	
	@FindBy(xpath="//img[@alt='Good Vibes Berry Nourishing Lip Sleeping Mask, Moisturizing, Vegan, No Parabens , No Sulphates, No Mineral Oil, No Silicones, No Animal Testing (12 gm)']")
	WebElement product;
	
	@FindBy(xpath="//*[@id=\"body\"]/app-root/div/div/div/app-product/div[2]/pds-card/pds-card-body/div/div[2]/div/div[4]/div/a")
	WebElement addcart;
	
	public Pageclass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void title() {
		String current=driver.getTitle();
		String exp="Buy Beauty & Cosmetic Products Online In India at Best Price | Purplle.com";
		Assert.assertEquals(current,exp,"The Title is wrong");
		System.out.println("Title Verification passed");
	}
	
	public void logo() {
		boolean logo_present=logo.isDisplayed();
		Assert.assertTrue(logo_present);
		System.out.println("Logo is present");
	}
	public void menu() {
		System.out.println("The Menu contains:");
		for(WebElement each:menu ) {
			String text=each.getText();
			System.out.println(text);
		}
	};
	public void navigate() {
		newmenu.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='filterHeader']/div/div/ul/li[1]/a/span[1]")));
		element.click();
		ishadow.click();
		filter.click();
	}
	public void cart() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Good Vibes Berry Nourishing Lip Sleeping Mask, Moisturizing, Vegan, No Parabens , No Sulphates, No Mineral Oil, No Silicones, No Animal Testing (12 gm)']")));
		product.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"body\"]/app-root/div/div/div/app-product/div[2]/pds-card/pds-card-body/div/div[2]/div/div[4]/div/a")));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		addcart.click();
		driver.navigate().back();
		driver.navigate().back();
		}
}
