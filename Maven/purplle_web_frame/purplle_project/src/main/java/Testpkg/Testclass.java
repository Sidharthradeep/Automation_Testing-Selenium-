package Testpkg;


import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Pageclass;

public class Testclass extends Baseclass{
	@Test
	public void verification() {
		Pageclass ob=new Pageclass(driver);
		ob.title();
		ob.logo();
		ob.menu();
		ob.navigate();
		ob.cart();
	}
}
