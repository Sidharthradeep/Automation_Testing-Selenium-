package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago_checkin_date {
	ChromeDriver driver=new ChromeDriver();
	@BeforeTest
	public void open() {
		driver.get("https://www.trivago.in/en-IN?themeId=280&sem_keyword=trivago&sem_creativeid=598703244705&sem_matchtype=e&sem_network=g&sem_device=c&sem_placement=&sem_target=&sem_adposition=&sem_param1=&sem_param2=&sem_campaignid=12420248128&sem_adgroupid=118398954396&sem_targetid=kwd-5593367084&sem_location=9040212&cipc=br&cip=9119000005&gad_source=1&gclid=Cj0KCQiAvvO7BhC-ARIsAGFyToUVezmaWhyNpxoTC6qXkmH5cwx49MJCko-eN4jT3i0eJUoFFmDgb5EaAoKpEALw_wcB");
		driver.manage().window().maximize();
	}
	@Test
	public void checkin() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]")).click();
		while(true) {
		String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/section/div/div/div/div/div/div/div/div/div/div/div/h3")).getText();
		if(month.equals("April 2025")) {
			break;
		}
		else {
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/button[2]/span")).click();
		}
	}
		List<WebElement> datelist=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div/div[1]/div[2]/button/time"));
		for(WebElement d:datelist) {
			String date=d.getText();
			if(date.equals("6")) {
				d.click();
				break;
			}
		}
	}
	
}
