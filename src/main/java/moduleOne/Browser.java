package moduleOne;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;

	public class Browser {

	             static WebDriver driver;

	            public static WebDriver StartBrowser(String browsername , String url)
	            {
	                         // If the browser is Firefox
	                       if(browsername.equalsIgnoreCase("Firefox"))
	                        {
	                                      // Set the path for geckodriver.exe
	                    	   System.setProperty("webdriver.gecko.driver",
	                   				"C://Users//Mohd Aamir//Downloads//geckodriver-v0.32.2-win32/geckodriver.exe");
	                   		driver = new FirefoxDriver();
	                        }

	                      // If the browser is Chrome
	                    else if(browsername.equalsIgnoreCase("Chrome"))
	                     {
	                                 // Set the path for chromedriver.exe
	                    	System.setProperty("webdriver.chrome.driver",
	            					"C://Users//Mohd Aamir//Downloads//chromedriver_win32/chromedriver.exe");
	            			driver = new ChromeDriver();

	                     }
	                    // If the browser is IE
	                  else if(browsername.equalsIgnoreCase("IE"))
	                  {
	                                      // Set the path for IEdriver.exe
	                		System.setProperty("webdriver.edge.driver",
	                				"C://Users//Mohd Aamir//Downloads//edgedriver_win32/msedgedriver.exe");
	                		 driver = new EdgeDriver();
	                  }

	                           driver.manage().window().maximize();
	                          driver.get(url);
	                         return driver;
	                  }
	}
