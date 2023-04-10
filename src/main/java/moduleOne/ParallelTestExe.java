package moduleOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTestExe {
	 private static WebDriver driver;
		public static void delay(int n) {
			try {
				Thread.sleep(n*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			@BeforeClass
			public void launch() {
				System.setProperty("webdriver.chrome.driver",
						"C://Users//Mohd Aamir//Downloads//chromedriver_win32/chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println(driver.hashCode());
				driver.manage().window().maximize();
				
				driver.get("https://www.amazon.in/");
			}
//			@Parameters("browser")
			
			@Test
			public void demo() {
//				String heading1=driver.findElement(By.id("h75b6eKlE7vu--0SJfK5vQ")).getText();
				String heading1=driver.getTitle();

				System.out.println(heading1);
//				Assert.assertEquals(heading1,"Bluetooth Calling Smartwatch starts at","not found");
			}
			@Test//this execute first
			public void demo1() {
				if(driver==null)
				System.out.println("Have null");
				WebElement search =driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
				search.sendKeys("Samsung");
				WebElement submit =driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
				submit.click();
//				Assert.assertEquals(heading1,"Bluetooth Calling Smartwatch starts at","not found");
			}
			
			@AfterClass
			public void close() {
				delay(5);
				driver.quit();
}
}