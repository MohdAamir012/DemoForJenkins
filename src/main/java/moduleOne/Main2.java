package moduleOne;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main2 {
	public static void delay(int n) {
		try {
			Thread.sleep(n*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Mohd Aamir//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Mohd");
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Aamir");
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("999999999");
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("mohdaamir@ttn.com");
		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("Block A");
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("New Delhi");
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Delhi");
		driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("11023");
		WebElement address = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select s =new Select(address);
		s.selectByVisibleText("INDIA");
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("mohdaamir@ttn.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Aamir@123");
		driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("Aamir@123");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();		
		Wait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5))
					.ignoring(ElementClickInterceptedException.class);
//	
//		Alert a = driver.switchTo().alert();
//		a.
		delay(15);
		driver.close();
	}

}
