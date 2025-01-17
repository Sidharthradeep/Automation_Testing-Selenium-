package Selenium_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class First_script {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); //open browser
		driver.get("https://www.google.com");   //to open google in browser
		String actual_title=driver.getTitle();
		String expected_title="google";
		if(actual_title.equalsIgnoreCase(expected_title))
				{
					System.out.println("pass");
					System.out.println(actual_title);
				}
		else
		{
			System.out.println("fail");
		}
		driver.close();
	}

}
