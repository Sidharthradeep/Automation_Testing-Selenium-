package TestPKG;

import org.testng.annotations.Test;

import BasePKG.Baseclass;
import Excelutil.Excelclass;
import PagePKG.Pageclass;

public class Testclass extends Baseclass{
	
	@Test
	public void run() throws Exception {
	Pageclass ob=new Pageclass(driver);
	ob.account();
	}
	
	@Test
	public void sign_up() throws Exception {
		Pageclass ob=new Pageclass(driver);
		String x1="C:/Users/SidharthRadeep/Desktop/Register.xlsx";
		String sheet="Register";
		int rowcount=Excelclass.get_RowCount(x1,sheet);
		String fname=Excelclass.get_StringValue(x1, sheet,1, 0);
		String lname=Excelclass.get_StringValue(x1, sheet,1, 1);
		String email=Excelclass.get_StringValue(x1, sheet,1, 2);
		String tele=Excelclass.get_StringValue(x1, sheet, 1,3);
		String pass=Excelclass.get_StringValue(x1, sheet,1, 4);
		String con=Excelclass.get_StringValue(x1, sheet, 1,4);
		ob.reg(fname,lname,email,tele,pass,con);
	}
	
	@Test
	public void login() throws Exception {
		Pageclass ob=new Pageclass(driver);
		String x1="C:/Users/SidharthRadeep/Desktop/Register.xlsx";
		String sheet="Register";
		String email=Excelclass.get_StringValue(x1, sheet,1, 2);
		String pass=Excelclass.get_StringValue(x1, sheet,1, 4);
		ob.log(email, pass);
	}
	
	@Test
	public void addtocart() throws InterruptedException {
		Pageclass ob=new Pageclass(driver);
		ob.addcart();
	}
	
	@Test
	public void checkouting() throws Exception {
		Pageclass ob=new Pageclass(driver);
		ob.checkout();
	}
	@Test
	public void formfilling_checkout() throws Exception {
		Pageclass ob=new Pageclass(driver);
		String x1="C:/Users/SidharthRadeep/Desktop/Register.xlsx";
		String sheet="form";
		String fname=Excelclass.get_StringValue(x1, sheet, 1, 0);
		String lname=Excelclass.get_StringValue(x1, sheet, 1, 1);
		String email=Excelclass.get_StringValue(x1, sheet, 1, 2);
		String phone=Excelclass.get_StringValue(x1, sheet, 1, 3);
		String address=Excelclass.get_StringValue(x1, sheet, 1, 4);
		String city=Excelclass.get_StringValue(x1, sheet, 1, 5);
		String postal=Excelclass.get_StringValue(x1, sheet, 1, 6);
		ob.formfill(fname, lname, email, phone, address, city, postal);
	}
	@Test
	public void payment_method() throws Exception {
		Pageclass ob=new Pageclass(driver);
		String x1="C:/Users/SidharthRadeep/Desktop/Register.xlsx";
		String sheet="text";
		String text=Excelclass.get_StringValue(x1, sheet, 0, 0);
		ob.payment(text);
	}
	@Test
	public void logout() throws Exception {
		Pageclass ob=new Pageclass(driver);
		ob.out();
	}
}
