package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class withpagefactory {
	 WebDriver driver;
	 
	 @FindBy(id="email")
	 WebElement fbemail;
	 @FindBy(id="pass")
	 WebElement fbpass;
	 @FindBy(name="login")
	 WebElement fblogin;
	 
	public withpagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void source(String email,String password) {
		fbemail.sendKeys(email);
		fbpass.sendKeys(password);
	}
	public void login() {
		fblogin.click();
	}
	}
