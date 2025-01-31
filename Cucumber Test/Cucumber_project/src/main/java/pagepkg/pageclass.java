package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageclass {
	WebDriver driver;
	

	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement pass;
	@FindBy(name="login")
	WebElement login;

	public pageclass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void set_values(String emails,String passs) {
		email.sendKeys(emails);
		pass.sendKeys(passs);
	}
	public void login() {
		login.click();
	}
	
	
}
