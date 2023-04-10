package moduleOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEWEbDriverClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C://Users//Mohd Aamir//Downloads//edgedriver_win32/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

}
