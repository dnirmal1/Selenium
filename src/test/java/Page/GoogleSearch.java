package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
    WebDriver driver;
    public GoogleSearch(WebDriver driver){
        this.driver = driver;
    }
    By getEmail = By.name("email1");
    By  getPassword = By.name("password1");

    public void enterUserName(String getUser){
        try{
            driver.findElement(getEmail).sendKeys(getUser);

        }catch (Exception e){
            System.out.println("Exceptions Caught: " + e.getMessage());
        }
    }
    public void enterPassword(String getPass){
        try{
            driver.findElement(getPassword).sendKeys(getPass);
        }catch (Exception e){
            System.out.println("Exceptions Caught: " + e.getMessage());
        }
    }

    public void getSignButton(){
        try {
            By getSignBtn = By.xpath("//button[@type='submit']");
            driver.findElement(getSignBtn).click();
        }catch (Exception e){
            System.out.println("Exceptions Caught:" + e.getMessage());
        }
    }

}
