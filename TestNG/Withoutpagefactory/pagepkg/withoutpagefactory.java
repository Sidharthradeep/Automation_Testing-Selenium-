package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class withoutpagefactory {
 WebDriver driver;
 By fbemail=By.id("email");
 By fbpass=By.id("pass");
 By fblogin=By.name("login");
 
public withoutpagefactory(WebDriver driver) {
	this.driver = driver;
}

public void source(String email,String password) {
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpass).sendKeys(password);
}
public void login() {
	driver.findElement(fblogin).click();
}
}
