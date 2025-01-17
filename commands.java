package Selenium_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class commands {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		String title_name=driver.getTitle();
		int title_length=title_name.length();
		System.out.println("Title is "+title_name+" length of "+title_length);
		String url=driver.getCurrentUrl();
		String desired_url="https://www.google.com/";
		if(url.equalsIgnoreCase(desired_url)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		String page_source=driver.getPageSource();
		long page_length=page_source.length();
		System.out.println("page length is "+page_length);
		driver.close();
	}

}
