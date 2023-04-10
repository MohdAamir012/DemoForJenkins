package moduleOne;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
	public static void delay(int n) {
		try {
			Thread.sleep(n*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Mohd Aamir//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w =new WebDriverWait(driver,30);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	driver.get("https://www.google.com/");
		driver.get("https://demoqa.com/automation-practice-form/");
//	driver.
//	((ChromeDriver) driver).findElementById("h-contact-us");
		String title = driver.getTitle();
		System.out.println(title);
//	WebElement cu=
//	driver.findElement(By.className("practice-form-wrapper"));
//			driver.findElement(By.id("firstName")).sendKeys("aamir");
//			driver.findElement(By.cssSelector("input#firstName[type=\"text\"]")).sendKeys("aamir");
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		w.until(ExpectedConditions.visibilityOf(fname));
		fname.sendKeys("mohd");
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("aamir");
		driver.findElement(By.id("userEmail")).sendKeys("aa@ttn.com");
//		driver.findElement(By.xpath("//label[@for=\"gender-radio-1\"")).click();
		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
//*[contains(text(),"FEMALE"]  *[starts-with(text(),"FEMALE"]
		driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("9999149244");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		WebElement Hobbies =driver.findElement(By.xpath("//label[text()=\"Sports\"]"));
		w.until(ExpectedConditions.elementToBeClickable(Hobbies));
		Hobbies.click();
		//textarea[@id="currentAddress"]
		driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("tera address");

		Wait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(5))
					.ignoring(ElementClickInterceptedException.class);
		
		delay(20);
		driver.close();
	}

}
