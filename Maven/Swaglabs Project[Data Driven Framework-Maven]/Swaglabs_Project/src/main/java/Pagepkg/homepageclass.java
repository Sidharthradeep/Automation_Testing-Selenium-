package Pagepkg;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepageclass {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div/div/div/div[2]/div/div/div/div/div/div/button")
	List<WebElement> Addcart ;
	
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement cartclick;
	@FindBy(id="checkout")
	WebElement checkout;
	
	@FindBy(id="first-name")
	WebElement firstname;
	@FindBy(id="last-name")
	WebElement lastname;
	@FindBy(id="postal-code")
	WebElement pincode;
	
	@FindBy(id="continue")
	WebElement con;
	@FindBy(id="finish")
	WebElement finish;
	@FindBy(id="back-to-products")
	WebElement backhome;
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement Menu;
	@FindBy(xpath="//*[@id=\"logout_sidebar_link\"]")
	WebElement logout;
	        
	public homepageclass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void addingtocart() {
		for(WebElement add:Addcart) {
			add.click();
		}
	}
	
	public void click_continue() {
		cartclick.click();
		checkout.click();
	}
	
	public void form_fill(String first,String last,String pin){
		firstname.sendKeys(first);
		lastname.sendKeys(last);
		pincode.sendKeys(pin);
	}
	
	public void contin() {
		con.click();
		finish.click();
		backhome.click();
	}
	
	public void logout() {
		Menu.click();
		logout.click();
	}
}
