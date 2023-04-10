package moduleOne;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import moduleOne.Browser;
import moduleOne.ScreenShot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import moduleOne.LoginPage;
import moduleOne.HomePage;
public class LoginTestCase {

               WebDriver driver;
               LoginPage lp;
               HomePage hp;
              int i = 0;
              // Launch of the given browser.
              @BeforeSuite
              public void browserlaunch()
              {
                             driver = Browser.StartBrowser("Chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
                             driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                             lp = new LoginPage(driver);
                          hp = new HomePage(driver);
               }
             // Login to the Site.
             @Test(priority = 1)
             public void Login() throws InterruptedException
              {
              lp.loginToSite("Admin","admin123");
              Thread.sleep(1000);
              System.out.println();
              }
             // Verifing the Home Page.
             @Test(priority = 2)
             public void HomePageVerify()
             {
                            String HomeText = hp.pageverify();
                            Assert.assertEquals(HomeText, "Dashboard");
                           // hp.admin();
              }
             
             @Test(priority = 3)
             public void addUser() throws InterruptedException, AWTException
              {
                     hp.admin();
                     Thread.sleep(10000);
                     Actions action = new Actions(driver);
                    
                   WebElement w=  driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
                   w.click();
//                   Select sel = new Select(wb);
//                   sel.selectByIndex(1);
                  	
                   Robot r =new Robot();
                   r.keyPress(KeyEvent.VK_DOWN);
                   Thread.sleep(2000);
                   r.keyPress(KeyEvent.VK_DOWN);
                   Thread.sleep(2000);
                  // r.keyPress(KeyEvent.VK_DOWN);
                   r.keyPress(KeyEvent.VK_ENTER);
//                   Select select=new Select(w);
//           		select.selectByVisibleText("ESS");
                     //action.keyDown(Keys.SHIFT).sendKeys("ESS").perform();
                     Thread.sleep(20000);
               }
 //Taking Screen shot on test fail
//              @AfterMethod
//              public void screenshot(ITestResult result)
//              {
//                         i = i+1;
//                         String name = "ScreenShot";
//                         String x = name+String.valueOf(i);
//                        if(ITestResult.FAILURE == result.getStatus())
//                          {
//                                         ScreenShot.captureScreenShot(driver, x);
//                           }
//   }
  @AfterSuite
   public void closeBrowser()
   {
                  driver.close();
    }
}