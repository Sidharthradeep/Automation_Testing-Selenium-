package PagePKG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pageclass {
	WebDriver driver;
	
	@FindBy(id="input-firstname")
	WebElement fname;
	@FindBy(id="input-lastname")
	WebElement lname;
	@FindBy(id="input-email")
	WebElement email;
	@FindBy(id="input-telephone")
	WebElement tele;
	@FindBy(id="input-password")
	WebElement pass;
	@FindBy(id="input-confirm")
	WebElement confirmpass;
	@FindBy(xpath="/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[1]/input")
	WebElement sub;
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/div/input[1]")
	WebElement privacy;
	@FindBy(xpath="/html/body/div[2]/div/div/form/div/div/input[2]")
	WebElement Continue;
	
	@FindBy(id="input-email")
	WebElement logemail;
	@FindBy(id="input-password")
	WebElement logpass;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/input")
	WebElement login;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[1]")
	WebElement add;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/div[2]/div/div[3]/button[1]")
	WebElement add1;
	@FindBy(xpath="/html/body/nav/div/div[2]/ul/li[4]/a/span")
	WebElement cart;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/form/div/table/tbody/tr/td[4]/div/span/button[2]")
	WebElement remove;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[3]/div[2]/a")
	WebElement checkout;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]/div[2]/div/div/div[1]/div[2]/label/input")
	WebElement Guest;
	@FindBy(id="button-account")
	WebElement Continue1;
	
	@FindBy(id="input-payment-firstname")
	WebElement inputfname;
	@FindBy(id="input-payment-lastname")
	WebElement inputlname;
	@FindBy(id="input-payment-email")
	WebElement inputemail;
	@FindBy(id="input-payment-telephone")
	WebElement inputtele;
	@FindBy(id="input-payment-address-1")
	WebElement inputaddress;
	@FindBy(id="input-payment-city")
	WebElement inputcity;
	@FindBy(id="input-payment-postcode")
	WebElement inputpostcode;
	@FindBy(id="input-payment-country")
	WebElement countrydrop;
	@FindBy(id="input-payment-zone")
	WebElement statedrop;
	@FindBy(id="button-guest")
	WebElement Continue2;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[2]/div/p[2]/textarea")
	WebElement textarea;
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[3]/div[2]/div/div[2]/div/input[1]")
	WebElement Check;
	@FindBy(id="button-payment-method")
	WebElement Continue3;
    
	public Pageclass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void account() throws Exception {
		WebElement Account=driver.findElement(By.linkText("My Account"));
		Account.click();
		WebElement Register=driver.findElement(By.linkText("Register"));
		Register.click();
	}
	
	public void reg(String fnames,String lnames,String emails,String telephone,String password,String confirm) throws InterruptedException {
		Thread.sleep(2000);
		fname.sendKeys(fnames);
		lname.sendKeys(lnames);
		email.sendKeys(emails);
		tele.sendKeys(telephone);
		pass.sendKeys(password);
		confirmpass.sendKeys(confirm);
		sub.click();
		sub.isSelected();
		privacy.click();
		privacy.isSelected();
		Continue.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();
	}
	public void log(String emails,String password) throws InterruptedException {
		Thread.sleep(2000);
		logemail.sendKeys(emails);
		logpass.sendKeys(password);
		login.click();
	}
	
	public void addcart() throws InterruptedException {
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		add1.click();
		Thread.sleep(1000);
		cart.click();
		Thread.sleep(2000);
		remove.click();
	}

	public void checkout() throws Exception {
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");	
		Thread.sleep(1000);
		checkout.click();
		Thread.sleep(1000);
		Guest.click();
		Continue1.click();
	}
	public void formfill(String fname,String lname,String email,String phone,String Address,String city,String postal) {
		inputfname.sendKeys(fname);
		inputlname.sendKeys(lname);
		inputemail.sendKeys(email);
		inputtele.sendKeys(phone);
		inputaddress.sendKeys(Address);
		inputcity.sendKeys(city);
		inputpostcode.sendKeys(postal);
		Select dropdown=new Select(countrydrop);
		dropdown.selectByVisibleText("India");
		Select dropdown1=new Select(statedrop);
		dropdown1.selectByVisibleText("Kerala");	
		Continue2.click();
	}
	public void payment(String text) throws Exception {
		Thread.sleep(5000);
		textarea.sendKeys(text);
		Check.click();
		Continue3.click();
	}
	public void out() throws Exception {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");	
		driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]")).click();
	}
}
