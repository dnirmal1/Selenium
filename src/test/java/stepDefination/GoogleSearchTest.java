package stepDefination;

import Page.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://freelance-learn-automation.vercel.app/login");
    }

    @Test
    public void searchMethod(){
        GoogleSearch page = new GoogleSearch(driver);
        page.enterUserName("aishwarya.gawande2@paysense.in");
        page.enterPassword("Testing@123");
        page.getSignButton();
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
