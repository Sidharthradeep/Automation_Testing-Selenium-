package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngdemo {
	@BeforeTest
	public void test() {
		System.out.println("open");
	}
	@BeforeMethod
	public void method() {
		System.out.println(" before method");
	}
	@Test(priority=4,invocationCount=2)
	public void test1() {
		System.out.println("test 1");
	}
	@Test(priority=3,groups= {"sanity","smoke"})
	public void test2() {
		System.out.println("test 2");
	}
	@Test(priority=2,groups="sanity")
	public void test3() {
		System.out.println("test 3");
	}
	@Test(priority=1,groups= {"sanity"})
	public void test4() {
		System.out.println("test 4");
	}
	@AfterMethod
	public void amethod() {
		System.out.println("after method");
	}
	@AfterTest
	public void atest() {
		System.out.println("after test");
	}
}
