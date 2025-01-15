package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.homepageclass;
import Pagepkg.loginpageclass;
import Utilitypkg.Excelutil;

public class testclass extends Baseclass{
	
	@Test
	public void valid_login() {

		loginpageclass ob=new loginpageclass(driver);
		String x1="C:\\Users\\Sidharth Radeep\\Downloads\\DataSwaglabs.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutil.getRowCount(x1,Sheet);
		System.out.println(rowCount);
		for(int i=1;i<=rowCount;i++)
		{
			String user=Excelutil.getCellValue(x1, Sheet,i,0);
			String pass=Excelutil.getCellValue(x1, Sheet,i,1);
			System.out.println("username ="+user);
			System.out.println("Password ="+pass);
			ob.insert(user, pass);
			ob.login();
			
			String expect="https://www.saucedemo.com/inventory.html";
			String url=driver.getCurrentUrl();
			if(url.equals(expect))
			{
				System.out.println("Successfully logged in with valid credentials");
				break;
			}
		}
		homepageclass home=new homepageclass(driver);
		home.addingtocart();
		home.click_continue();
		home.form_fill("Sidharth","Radeep","24323123");
		home.contin();
		home.logout();
	}
}
