package TestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoboClass_Fileupload {
		ChromeDriver driver=new ChromeDriver();
		@Test
		public void file_upload() throws Exception {
			driver.get("https://www.ilovepdf.com/compress_pdf");
			driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
			
			file_upload("\"C:\\Users\\Sidharth Radeep M\\Downloads\\Sidharth_Test.pdf\"");
		}
		public void file_upload(String p) throws AWTException {
			StringSelection strselection=new StringSelection(p);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection,null);
			Robot robot=new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		}
}
