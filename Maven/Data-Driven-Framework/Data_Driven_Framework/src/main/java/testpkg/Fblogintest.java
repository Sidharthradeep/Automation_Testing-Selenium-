package testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import pagepkg.Fbloginpage;
import utilities.Excelutil;

public class Fblogintest extends Baseclass{
	@Test
	public void login_valid_check() {
		Fbloginpage ob=new Fbloginpage(driver);
		
		//Reading the data from excel file by specified path
		String x1="C://Users//Sidharth Radeep//Downloads//Book1.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutil.getRowCount(x1,Sheet);//To get the rowcount from the self defined class in excelutils
		
		for(int i=1;i<rowCount;i++) {
			String username=Excelutil.getCellValue(x1,Sheet,i,0);
			System.out.println("Username is  "+username );
			String pass=Excelutil.getCellValue(x1,Sheet,i,1);
			System.out.println("Password is  "+pass);
			//passing username and password as parameters
			ob.insert(username, pass);
			//Sumbiting the parameters in login
			ob.login();
		}
			String expect="https://www.facebook.com/";
			String current=driver.getCurrentUrl();
			if(current.equals(expect))
			{
				System.out.println("Url is passed");
			}
			else
			{
				System.out.println("Url is not equal");
			}
	}
}
