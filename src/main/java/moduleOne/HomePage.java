package moduleOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

WebDriver driver;

By Admin = By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][1]");
By home = By.xpath("//h6[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]");
By user=By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
//Constructor to initialize object
public HomePage(WebDriver dr)
              {
                             this.driver=dr;
               }
              public String pageverify()
              {
                            return driver.findElement(home).getText();
               }
             public void admin() throws InterruptedException
              {
                            WebElement webElement= driver.findElement(Admin);
                            webElement.click();
                            WebElement webUser=driver.findElement(user);
                            webUser.click();
                            WebElement newUser=driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]"));
                            newUser.sendKeys("Aamir");
                            Thread.sleep(1000);
               }
}