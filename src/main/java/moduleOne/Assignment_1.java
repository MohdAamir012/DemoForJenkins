package moduleOne;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {
	public static void delay(int n) {
		try {
			Thread.sleep(n * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C://Users//Mohd Aamir//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
// Q3 search to the new on google
//		driver.get("https://www.google.com/");
//		WebElement search = driver.findElement(By.xpath("//input[@name=\"q\"]"));
//		search.sendKeys("To The New");
//		search.submit();
//Q4  http://www.tothenew.com/ 
//		 
////		Q5
		driver.get("http://www.tothenew.com/");
		List<WebElement> LWE =driver.findElements(By.id("h-contact-us"));
		WebElement cu=LWE.get(1);
		cu.click();
		System.out.println(driver.getTitle());
		delay(50);
		driver.close();
////		Q6
//		driver.get("http://www.tothenew.com/");
//		List<WebElement> LWE =driver.findElements(By.id("h-contact-us"));
//		WebElement cu=LWE.get(1);
//		cu.click();
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
////		Q7
//		driver.get("https://demo.automationtesting.in/Register.html");
//		List<WebElement> LWE =driver.findElements(By.name("radiooptions"));
//		WebElement cu=LWE.get(0);
//		cu.click();
//		if(cu.isSelected())
//			System.out.println("gender is selectd");
//		else 
//			System.out.println("gender is not selectd");
////		Q8
//		driver.get("https://demo.automationtesting.in/Register.html");
////		WebElement header = driver.findElement(By.xpath("//h1"));
//		String ETitle="Register";
//		String ATitle =driver.getTitle();
//		System.out.println(ATitle);
//		if(ATitle.equals(ETitle))
//			System.out.println("verified Title");
//		else 
//			System.out.println("Title is not verified");
//		delay(10);
//		driver.close();
//		Q12
//		driver.get("https://demo.automationtesting.in/Register.html");
//		WebElement FName = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
//		FName.sendKeys("Mohd");
//		WebElement LName = driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
//		LName.sendKeys("Aamir");
//		WebElement UName = driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]"));
//		UName.sendKeys("aamir@ttn.com");
//		
//		
		delay(10);
		driver.close();
	}

}
