package stepDefination;

import Page.GoogleSearch;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDef {
    static WebDriver driver;
    @Given("User login to url")
    public void user_login_to_url() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://freelance-learn-automation.vercel.app/login");
    }

    @When("User enters cred")
    public void user_enters_cred() {
        GoogleSearch page = new GoogleSearch(driver);
        page.enterUserName("aishwarya.gawande2@paysense.in");
        page.enterPassword("Testing@123");
        page.getSignButton();
    }



}
