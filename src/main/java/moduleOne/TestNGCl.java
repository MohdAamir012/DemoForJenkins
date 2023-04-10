package moduleOne;

import org.testng.annotations.Test;
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

public class TestNGCl {
	
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
			
			driver.get("https://demoqa.com/automation-practice-form/");
		}
		@Parameters("browser")
		
		@Test(priority=2)
		public void demo() {
//			WebElement Hobbies =driver.findElement(By.xpath("//label[text()=\"Sports\"]"));
//			System.out.println(Hobbies.isDisplayed());
//			String t=driver.getTitle();
//			String e="ToolsQA";
////			System.out.println(t.equals(e));
//			Assert.assertEquals(t, e,"Title not match");
//			System.out.println(t);
//			WebElement ui =driver.findElement(By.xpath("//label[text()=\"Female\"]"));
//			 Actions ac=new Actions(driver);			
//			 ac.moveToElement(ui);
			WebElement regText = driver.findElement(By.xpath("//h5"));
			String Eres="Student Regist ration Form";
			String Ares=regText.getText();
			Assert.assertEquals(Ares, Eres,"Not valid heading");
//			w.until(ExpectedConditions.visibilityOf(fname));
//			fname.sendKeys("mohd");
//			String E_fname=fname.getText();	
//			Assert.assertEquals(E_fname,"mohd","fname not match");
			WebElement lname = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
			lname.sendKeys("aamir");
			Assert.assertEquals(lname.isDisplayed(), true,"lname not match");
//			Assert.assertEquals(E_lname,"aamir");
//			WebElement emailid =driver.findElement(By.id("userEmail"));
//			emailid.sendKeys("aa@ttn.com");

//			String E_emailid=emailid.getText();
//			Assert.assertEquals(E_emailid,"ab@ttn.com","email not match");
//			driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"")).click();
//			WebElement rbtn =driver.findElement(By.xpath("//label[text()=\"Female\"]"));
//			rbtn.click();
			
		}
//		@Test(priority=1) //this execute first
//		public void demo1() {
//			WebElement mobNo =driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]"));
//			mobNo.sendKeys("9999149244");
//			String Emob=mobNo.getText();
//			int el=10;
//			int al=Emob.length();
//			Assert.assertEquals(10,al,"invalid no");
//			
//		}
		
		@AfterMethod
		public void close() {
			delay(5);
			driver.close();
		}
	
	

}
