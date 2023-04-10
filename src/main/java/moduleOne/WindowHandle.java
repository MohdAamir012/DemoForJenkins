package moduleOne;
import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class WindowHandle {	
 private static WebDriver driver;
	public static void delay(int n) {
		try {
			Thread.sleep(n*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		@BeforeMethod

		public void launch() {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//Mohd Aamir//Downloads//chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demoqa.com/forms");
		}

		@Test
		public void iframehandle() {
			WebElement iElement = driver.findElement(By.xpath("//iframe[@id=\"google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0\"]"));
			driver.switchTo().frame(iElement);
		}
//		@Test(priority=2)
//		public void window() {
//			driver.findElement(By.id("tabButton")).click();
//			Set<String> tabhandles=driver.getWindowHandles();
//		driver.switchTo().window(tabhandles.stream().toList().get(1));
//		String Atext=driver.findElement(By.xpath("//h1")).getText();
//		String Etext="This isa sample page";
//		Assert.assertEquals(Atext, Etext, "Not match");
//		}
	
		
		@AfterMethod
		public void close() {
			delay(5);
			driver.quit();
		}
	
	

}
