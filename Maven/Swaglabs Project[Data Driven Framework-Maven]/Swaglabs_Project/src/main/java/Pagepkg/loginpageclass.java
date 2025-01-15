package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class loginpageclass {
	
		WebDriver driver;
		
		@FindBy(id="user-name")
		WebElement username;
		@FindBy(id="password")
		WebElement password;
		@FindBy(name="login-button")
		WebElement login;
		
		public loginpageclass(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		  
		public void insert(String user,String pass) {
			username.clear();
			username.sendKeys(user);
			password.clear();
			password.sendKeys(pass);
		}
		public void login() {
			login.click();
		}
}
