//package moduleOne;
//
//import org.testng.annotations.Test;
//
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
//
//public class CaseStudy {
//	private static WebDriver driver;
//
//	public static void delay(int n) {
//		try {
//			Thread.sleep(n * 1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@BeforeClass
//	public void launch() {
//		System.setProperty("webdriver.chrome.driver",
//				"C://Users//Mohd Aamir//Downloads//chromedriver_win32/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//
//	@Test
//	public void login() {
//		String title=driver.getTitle();
//		Assert.assertTrue(driver.,"username is not visible !");
//		WebElement username =driver.findElement(By.name("username"));
//		username.sendKeys("Admin");
//		WebElement userpassword =driver.findElement(By.name("password"));
//		username.sendKeys("admin123");
//		WebElement logInBtn =driver.findElement(By.xpath("//button"));
//		logInBtn.submit();
//	}
////	@Test
////		public void goToAdmin () {
////		
////	}
////	@Test
////	public void addUser() {
////	
////}
////	@Test
////	public void deleteUser() {
////	
////}
//	@AfterClass
//	public void close() {
//		delay(3);
//		driver.quit();
//	}
//
//}
