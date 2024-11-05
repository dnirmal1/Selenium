package stepDefination;

import Payloads.AllAPIs;
import org.testng.annotations.Test;

public class APIMethods {
    @Test(priority = 0)
    public void getAPIMethod() throws InterruptedException {
        AllAPIs.getAPIMethod();
    }
    @Test(priority = 1)
    public void postAPIMathod() throws InterruptedException{
        AllAPIs.postAPIMethod();
    }
}
